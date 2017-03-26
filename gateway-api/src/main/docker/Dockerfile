FROM java:8
VOLUME /tmp
ADD gateway-api-1-SNAPSHOT.jar gateway-api.jar
RUN bash -c 'touch /gateway-api.jar'
ENTRYPOINT ["java","-jar","/gateway-api.jar","--spring.profiles.active=docker"]
