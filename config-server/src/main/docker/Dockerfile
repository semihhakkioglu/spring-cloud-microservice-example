FROM java:8
VOLUME /tmp
ADD config-server-1-SNAPSHOT.jar config-server.jar
RUN bash -c 'touch /config-server.jar'
ENTRYPOINT ["java","-jar","/config-server.jar","--spring.profiles.active=docker"]
