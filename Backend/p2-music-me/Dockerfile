FROM gradle AS build
WORKDIR /p2-Music.Me-ReMake
COPY build.gradle ./
RUN gradle clean build --no-daemon > /dev/null 2>&1 || true
COPY ./ /p2-Music.Me-ReMake
RUN gradle clean build --no-daemon --stacktrace




FROM openjdk:11
COPY --from=build . /p2-Music.Me-ReMake/Backend/p2-music-me/build/libs/p2-music-me-0.0.1-SNAPSHOT.jar
WORKDIR /Users/keythageniuz/p2-Music.Me-ReMake
EXPOSE 8081
ENTRYPOINT [ "java","-jar","./p2-music-me/build/libs/p2-music-me-0.1.0-SNAPSHOT.jar" ]