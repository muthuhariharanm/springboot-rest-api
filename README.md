# springboot-rest-api
Simple Implementation of Rest API in spring boot

It is a simple api that supports GET, POST, DELETE requests to maintaing rating for a particulau ad-email

### GET
- /ratings returns all email with its rating
- /rating/{email} return the rating of that particular email

### POST
- /rating Adds new email-rating entry into database tabe

### DELETE
- /rating/{email} Deletes entry of particular email from table

## To try this, you can to any of the following

#### With Docker
```
git clone https://github.com/muthuhariharanm/springboot-rest-api.git
cd springboot-rest-api
docker build -t spring-api .
docker run -p 7070:7070 spring-api
```
- The output will be at http://docker-machine-ip:7070

#### Build using maven
- Download maven and add to path
```
git clone https://github.com/muthuhariharanm/springboot-rest-api.git
cd springboot-rest-api
./run.sh
```
- The output will be at http://localhost:7070
