FROM 192.168.31.28:5001/hz-jdk8
COPY target/demo-*.jar demo.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "demo.jar"]