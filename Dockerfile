FROM openjdk:11
EXPOSE 8080
COPY . /usr/src/app
WORKDIR /usr/src/app
RUN ["/usr/src/app/gradlew", "build"]
CMD ["/usr/src/app/gradlew", "bootRun"]
