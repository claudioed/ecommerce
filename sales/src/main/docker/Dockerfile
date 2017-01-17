FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
ADD sales.jar sales.jar
RUN bash -c 'touch /sales.jar'
EXPOSE 8046
ENTRYPOINT ["java","-Dspring.profiles.active=default","-jar","/sales.jar"]