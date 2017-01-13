FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
ADD data-api.jar data-api.jar
RUN bash -c 'touch /data-api.jar'
EXPOSE 8010
ENTRYPOINT ["java","-Dspring.profiles.active=default","-jar","/data-api.jar"]