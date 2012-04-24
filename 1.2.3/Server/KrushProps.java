// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   KrushProps.java

import java.io.*;
import java.util.*;

public final class KrushProps
{

    public KrushProps(String fName)
    {
        lines = new ArrayList();
        props = new HashMap();
        fileName = fName;
        File file = new File(fileName);
        if(file.exists())
            try
            {
                load();
            }
            catch(IOException ex)
            {
                System.out.println((new StringBuilder()).append("[Props] Unable to load ").append(fileName).append("!").toString());
            }
        else
            save();
    }

    public void load()
        throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "UTF8"));
        lines.clear();
        props.clear();
        String line;
        while((line = reader.readLine()) != null) 
        {
            line = new String(line.getBytes(), "UTF-8");
            char c = '\0';
            int pos;
            for(pos = 0; pos < line.length() && Character.isWhitespace(c = line.charAt(pos)); pos++);
            if(line.length() - pos == 0 || line.charAt(pos) == '#' || line.charAt(pos) == '!')
            {
                lines.add(line);
            } else
            {
                int start = pos;
                boolean needsEscape = line.indexOf('\\', pos) != -1;
                StringBuffer key = needsEscape ? new StringBuffer() : null;
                if(key != null)
                    do
                    {
                        if(pos >= line.length() || Character.isWhitespace(c = line.charAt(pos++)) || c == '=' || c == ':')
                            break;
                        if(needsEscape && c == '\\')
                        {
                            if(pos == line.length())
                            {
                                line = reader.readLine();
                                if(line == null)
                                    line = "";
                                pos = 0;
                                if(++pos < line.length())
                                {
                                    if(Character.isWhitespace(c = line.charAt(pos)))
                                        break;
                                    continue;
                                }
                            }
                            c = line.charAt(pos++);
                        } else
                        {
                            switch(c)
                            {
                            case 110: // 'n'
                                key.append('\n');
                                break;

                            case 116: // 't'
                                key.append('\t');
                                break;

                            case 114: // 'r'
                                key.append('\r');
                                break;

                            case 117: // 'u'
                                if(pos + 4 <= line.length())
                                {
                                    char uni = (char)Integer.parseInt(line.substring(pos, pos + 4), 16);
                                    key.append(uni);
                                    pos += 4;
                                }
                                break;

                            case 111: // 'o'
                            case 112: // 'p'
                            case 113: // 'q'
                            case 115: // 's'
                            default:
                                key.append('\0');
                                break;
                            }
                        }
                    } while(true);
                boolean isDelim = c == ':' || c == '=';
                String keyString;
                if(needsEscape)
                    keyString = key.toString();
                else
                if(isDelim || Character.isWhitespace(c))
                    keyString = line.substring(start, pos - 1);
                else
                    keyString = line.substring(start, pos);
                for(; pos < line.length() && Character.isWhitespace(c = line.charAt(pos)); pos++);
                if(!isDelim && (c == ':' || c == '='))
                    for(pos++; pos < line.length() && Character.isWhitespace(c = line.charAt(pos)); pos++);
                if(!needsEscape)
                {
                    lines.add(line);
                } else
                {
                    StringBuilder element = new StringBuilder(line.length() - pos);
                    do
                    {
                        if(pos >= line.length())
                            break;
                        c = line.charAt(pos++);
                        if(c == '\\')
                        {
                            if(pos == line.length())
                            {
                                line = reader.readLine();
                                if(line == null)
                                    break;
                                for(pos = 0; pos < line.length() && Character.isWhitespace(c = line.charAt(pos)); pos++);
                                element.ensureCapacity((line.length() - pos) + element.length());
                                continue;
                            }
                            c = line.charAt(pos++);
                            switch(c)
                            {
                            case 110: // 'n'
                                element.append('\n');
                                break;

                            case 116: // 't'
                                element.append('\t');
                                break;

                            case 114: // 'r'
                                element.append('\r');
                                break;

                            case 117: // 'u'
                                if(pos + 4 <= line.length())
                                {
                                    char uni = (char)Integer.parseInt(line.substring(pos, pos + 4), 16);
                                    element.append(uni);
                                    pos += 4;
                                    break;
                                }
                                continue;

                            case 111: // 'o'
                            case 112: // 'p'
                            case 113: // 'q'
                            case 115: // 's'
                            default:
                                element.append('\0');
                                break;
                            }
                        }
                        element.append('\0');
                    } while(true);
                    lines.add((new StringBuilder()).append(keyString).append("=").append(element.toString()).toString());
                }
            }
        }
        reader.close();
    }

    public void save()
    {
        OutputStream os = null;
        try
        {
            os = new FileOutputStream(fileName);
        }
        catch(FileNotFoundException ex)
        {
            System.out.println((new StringBuilder()).append("[Props] Unable to open ").append(fileName).append("!").toString());
        }
        PrintStream ps = null;
        try
        {
            ps = new PrintStream(os, true, "UTF-8");
        }
        catch(UnsupportedEncodingException ex)
        {
            System.out.println((new StringBuilder()).append("[Props] Unable to write to ").append(fileName).append("!").toString());
        }
        List usedProps = new ArrayList();
        Iterator i$;
        for(i$ = lines.iterator(); i$.hasNext();)
        {
            String line = (String)i$.next();
            if(line.trim().length() == 0)
                ps.println(line);
            else
            if(line.charAt(0) == '#')
                ps.println(line);
            else
            if(line.contains("="))
            {
                int delimPosition = line.indexOf('=');
                String key = line.substring(0, delimPosition).trim();
                if(props.containsKey(key))
                {
                    String value = (String)props.get(key);
                    ps.println((new StringBuilder()).append(key).append("=").append(value).toString());
                    usedProps.add(key);
                } else
                {
                    ps.println(line);
                }
            } else
            {
                ps.println(line);
            }
        }

        i$ = props.entrySet().iterator();
        do
        {
            if(!i$.hasNext())
                break;
            java.util.Map.Entry entry = (java.util.Map.Entry)i$.next();
            if(!usedProps.contains(entry.getKey()))
                ps.println((new StringBuilder()).append((String)entry.getKey()).append("=").append((String)entry.getValue()).toString());
        } while(true);
        ps.close();
        try
        {
            props.clear();
            lines.clear();
            load();
        }
        catch(IOException ex)
        {
            System.out.println((new StringBuilder()).append("[Props] Unable to load ").append(fileName).append("!").toString());
        }
    }

    public Map returnMap()
        throws Exception
    {
        Map map = new HashMap();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        do
        {
            String line;
            if((line = reader.readLine()) == null)
                break;
            if(line.trim().length() != 0 && line.charAt(0) != '#' && line.contains("="))
            {
                int delimPosition = line.indexOf('=');
                String key = line.substring(0, delimPosition).trim();
                String value = line.substring(delimPosition + 1).trim();
                map.put(key, value);
            }
        } while(true);
        reader.close();
        return map;
    }

    public boolean containsKey(String var)
    {
        for(Iterator i$ = lines.iterator(); i$.hasNext();)
        {
            String line = (String)i$.next();
            if(line.trim().length() != 0 && line.charAt(0) != '#' && line.contains("="))
            {
                int delimPosition = line.indexOf('=');
                String key = line.substring(0, delimPosition);
                if(key.equals(var))
                    return true;
            }
        }

        return false;
    }

    public String getProperty(String var)
    {
        for(Iterator i$ = lines.iterator(); i$.hasNext();)
        {
            String line = (String)i$.next();
            if(line.trim().length() != 0 && line.charAt(0) != '#' && line.contains("="))
            {
                int delimPosition = line.indexOf('=');
                String key = line.substring(0, delimPosition).trim();
                String value = line.substring(delimPosition + 1);
                if(key.equals(var))
                    return value;
            }
        }

        return "";
    }

    public void removeKey(String var)
    {
        Boolean changed = Boolean.valueOf(false);
        if(props.containsKey(var))
        {
            props.remove(var);
            changed = Boolean.valueOf(true);
        }
        try
        {
            for(int i = 0; i < lines.size(); i++)
            {
                String line = (String)lines.get(i);
                if(line.trim().length() != 0 && line.charAt(0) != '#' && line.contains("="))
                {
                    int delimPosition = line.indexOf('=');
                    String key = line.substring(0, delimPosition).trim();
                    if(key.equals(var))
                    {
                        lines.remove(i);
                        changed = Boolean.valueOf(true);
                    }
                }
            }

        }
        catch(ConcurrentModificationException concEx)
        {
            removeKey(var);
            return;
        }
        if(changed.booleanValue())
            save();
    }

    public boolean keyExists(String key)
    {
        try
        {
            return containsKey(key);
        }
        catch(Exception localException)
        {
            return false;
        }
    }

    public String getString(String key)
    {
        if(containsKey(key))
            return getProperty(key);
        else
            return "";
    }

    public String getString(String key, String value)
    {
        if(containsKey(key))
        {
            return getProperty(key);
        } else
        {
            setString(key, value);
            return value;
        }
    }

    public void setString(String key, String value)
    {
        props.put(key, value);
        save();
    }

    public int getInt(String key)
    {
        if(containsKey(key))
            return Integer.parseInt(getProperty(key));
        else
            return 0;
    }

    public int getInt(String key, int value)
    {
        if(containsKey(key))
        {
            return Integer.parseInt(getProperty(key));
        } else
        {
            setInt(key, value);
            return value;
        }
    }

    public void setInt(String key, int value)
    {
        props.put(key, String.valueOf(value));
        save();
    }

    public double getDouble(String key)
    {
        if(containsKey(key))
            return Double.parseDouble(getProperty(key));
        else
            return 0.0D;
    }

    public double getDouble(String key, double value)
    {
        if(containsKey(key))
        {
            return Double.parseDouble(getProperty(key));
        } else
        {
            setDouble(key, value);
            return value;
        }
    }

    public void setDouble(String key, double value)
    {
        props.put(key, String.valueOf(value));
        save();
    }

    public long getLong(String key)
    {
        if(containsKey(key))
            return Long.parseLong(getProperty(key));
        else
            return 0L;
    }

    public long getLong(String key, long value)
    {
        if(containsKey(key))
        {
            return Long.parseLong(getProperty(key));
        } else
        {
            setLong(key, value);
            return value;
        }
    }

    public void setLong(String key, long value)
    {
        props.put(key, String.valueOf(value));
        save();
    }

    public boolean getBoolean(String key)
    {
        if(containsKey(key))
            return Boolean.parseBoolean(getProperty(key));
        else
            return false;
    }

    public boolean getBoolean(String key, boolean value)
    {
        if(containsKey(key))
        {
            return Boolean.parseBoolean(getProperty(key));
        } else
        {
            setBoolean(key, value);
            return value;
        }
    }

    public void setBoolean(String key, boolean value)
    {
        props.put(key, String.valueOf(value));
        save();
    }

    private String fileName;
    private List lines;
    private Map props;
}
