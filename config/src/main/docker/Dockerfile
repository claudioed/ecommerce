FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
ADD config.jar config.jar
RUN bash -c 'touch /config.jar'
EXPOSE 8001
ENTRYPOINT ["java","-Dspring.profiles.active=default","-jar","/config.jar"]