#!/usr/bin/env bash
f=`ls`
echo 'fist file list:'
echo $f
ssh d.com <<'ENDSSH'
cd ~/install/apache-tomcat-8.0.24/bin/
FILELIST=`ps aux | grep tomcat`
echo 'fileList is :'
echo $FILELIST
#./shutdown.sh
#./startup.sh
ENDSSH