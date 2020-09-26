FROM gradle:6.6-jdk14 AS build
COPY . /app/
WORKDIR /app
RUN gradle build --warning-mode all

FROM tomcat:9.0-jdk14-openjdk-buster AS runtime
RUN ["rm", "-rf", "/usr/local/tomcat/webapps/ROOT"]
COPY --from=build /app/build/libs/java-webapp.war /usr/local/tomcat/webapps/ROOT.war
