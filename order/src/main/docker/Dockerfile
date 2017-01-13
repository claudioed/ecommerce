FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
ADD order.jar order.jar
RUN bash -c 'touch /order.jar'
EXPOSE 8888
ENTRYPOINT ["java","-Dspring.profiles.active=default","-jar","/order.jar"]