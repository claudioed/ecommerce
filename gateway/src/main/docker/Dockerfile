FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
ADD gateway.jar gateway.jar
RUN bash -c 'touch /gateway.jar'
EXPOSE 8888
ENTRYPOINT ["java","-Dspring.profiles.active=default","-jar","/gateway.jar"]