FROM openjdk:11
COPY . /usr/src/app
WORKDIR /usr/src/app
EXPOSE 8080
RUN gradlew build
CMD ["gradlew", "bootRun"]