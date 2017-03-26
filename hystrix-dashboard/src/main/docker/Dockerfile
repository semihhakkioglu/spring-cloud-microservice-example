FROM java:8
VOLUME /tmp
ADD hystrix-dashboard-1-SNAPSHOT.jar hystrix-dashboard.jar
RUN bash -c 'touch /hystrix-dashboard.jar'
ENTRYPOINT ["java","-jar","/hystrix-dashboard.jar","--spring.profiles.active=docker"]
