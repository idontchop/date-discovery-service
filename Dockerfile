FROM java:8
WORKDIR /
ADD target/dateDiscovery-0.0.1-SNAPSHOT.jar dateDiscovery-0.0.1-SNAPSHOT.jar
CMD java -jar dateDiscovery-0.0.1-SNAPSHOT.jar
EXPOSE 8761


