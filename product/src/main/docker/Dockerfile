FROM java:8
MAINTAINER Claudio de Oliveira<claudioed.oliveira@gmail.com>
VOLUME /tmp
ADD product.jar product.jar
RUN bash -c 'touch /product.jar'
EXPOSE 8045
ENTRYPOINT ["java","-Dspring.profiles.active=default","-jar","/product.jar"]