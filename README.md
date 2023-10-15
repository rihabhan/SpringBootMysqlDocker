# SpringBootMysqlDocker
https://www.youtube.com/watch?v=PAQvxqocb6A&t=863s \
docker network create -d bridge my-springapp-net \
docker run -d -p 3307:3306 --net my-springapp-net --name mysqldbsb -e MYSQL_ROOT_PASSWORD=root -e MYSQL_DATABASE=ems -v "/home/rihab/Desktop/db":/var/lib/mysql  mysql \
docker container inspect mysqldbsb \
docker run -p 9090:8080 --name appsb --net my-springapp-net -e MYSQL_HOST=mysqldbsb -e MYSQL_USER=root -e MYSQL_PASSWORD=root -e MYSQL_PORT=3306 sbapp \
