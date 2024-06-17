docker-run:
  docker run --name customer-mysql -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=customerdb -p 3306:3306 -d mysql:latest

