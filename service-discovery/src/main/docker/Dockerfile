FROM java:8
VOLUME /tmp
ADD service-discovery-1-SNAPSHOT.jar service-discovery.jar
RUN bash -c 'touch /service-discovery.jar'
ENTRYPOINT ["java","-jar","/service-discovery.jar","--spring.profiles.active=docker"]
