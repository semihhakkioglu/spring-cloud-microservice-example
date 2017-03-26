FROM java:8
VOLUME /tmp
ADD invoice-service-1-SNAPSHOT.jar invoice-service.jar
RUN bash -c 'touch /invoice-service.jar'
ENTRYPOINT ["java","-jar","/invoice-service.jar","--spring.profiles.active=docker"]
