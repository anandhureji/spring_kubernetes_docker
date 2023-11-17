To run docker build command using maven plug :
1.Use git bash as terminal
2.Run the command : mvn spring-boot:build-image -Dspring-boot.build-image.imageName=anandhureji33/bookmark-api

 To run docker :
 docker run -p8887:8888 bookmark-api:latest
