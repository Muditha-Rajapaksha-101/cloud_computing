FROM openjdk:17
EXPOSE 8080
ADD target/course-work.jar course-work.jar
ENTRYPOINT ["java","-jar","/course-work.jar"]