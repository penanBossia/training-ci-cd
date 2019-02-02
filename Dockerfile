FROM java:openjdk-8u111-jdk
WORKDIR /opt
ADD build/libs/springboot-*.jar api.jar
ENV JAVA_OPTS "-Djava.security.egd=file:/dev/./urandom"
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/api.jar"]
