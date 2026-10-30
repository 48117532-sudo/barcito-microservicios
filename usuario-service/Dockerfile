FROM eclipse-temurin:17-jre
arg jar_file=target/*.jar
copy ${jar_file} app.jar
entrypoint ["java", "-jar", "/app.jar"]