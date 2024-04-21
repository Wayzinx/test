#基础镜像
FROM java:8
#设定时区
MAINTAINER "TEST"
VOLUME /tmp
EXPOSE 8080
ARG JAR_FILE=target/docker-jenkins.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
