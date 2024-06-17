# Customer API

Simple Java Spring Boot app to manage customers

### Setup
- Install JDK 17 with sdkman.
  Go to: https://sdkman.io/install
  ```bash
  $ sdk env install
  ```
  this will install and use JDK configured in `.sdkmanrc` file
#### On Windows
- Install `make`
    ```bash 
    $ choco install make
    ```
    and then 
    ```bash 
    $ make docker-run
    ```
  or manually start docker container with
  ```bash
  $ docker run --name customer-mysql -e MYSQL_ROOT_PASSWORD=123456 -e MYSQL_DATABASE=customerdb -p 3306:3306 -d mysql:latest
  ```
#### On Mac/Linux
- Start the database with
    ```bash 
    $ make docker-run
    ```
### Run
```bash 
$ ./mvnw spring:boot start
```
or use IntelliJ run configurations configured in `.run` folder

### Tests
```bash 
$ ./mvnw verify
```