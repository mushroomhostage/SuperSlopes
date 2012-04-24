#!/bin/sh
rm -rf net
mkdir -p net/minecraft/server
./compile.sh
mv bukkit/*.class net/minecraft/server/
zip -r SuperSlopes-mcpc125-r1.zip net/ 
cd ..
