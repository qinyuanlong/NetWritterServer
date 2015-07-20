#!/usr/bin/env bash
#打包
scp -v -r ../web/target/web/WEB-INF/classes root@d.com:/root/install/apache-tomcat-8.0.24/webapps/web/WEB-INF/classes
#重启tomcat
ssh d.com <<'ENDSSH'
	cd ~/install/apache-tomcat-8.0.24/bin/
	./shutdown.sh
	./startup.sh
ENDSSH