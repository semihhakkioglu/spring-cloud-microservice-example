FROM java:8
VOLUME /tmp
ADD merchant-service-1-SNAPSHOT.jar merchant-service.jar
RUN bash -c 'touch /merchant-service.jar'
ENTRYPOINT ["java","-jar","/merchant-service.jar","--spring.profiles.active=docker"]
