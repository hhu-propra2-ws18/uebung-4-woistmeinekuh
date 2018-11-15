FROM debian:latest
COPY . /autohaus
CMD ./autohaus/gradlew bootrun
