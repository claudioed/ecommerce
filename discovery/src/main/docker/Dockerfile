FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
ADD discovery.jar discovery.jar
RUN bash -c 'touch /discovery.jar'
EXPOSE 8001
ENTRYPOINT ["java","-Dspring.profiles.active=default","-jar","/discovery.jar"]