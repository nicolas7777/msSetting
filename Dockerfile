FROM openjdk:11
VOLUME /tmp
EXPOSE 8888
ADD ./target/ms.config.server-0.0.1.jar msserverconfig.jar
ENTRYPOINT ["java","-jar","/msserverconfig.jar"]
