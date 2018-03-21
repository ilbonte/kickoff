`./gradlew clean war`

`docker build -t bonte/kickoffkata .`

`docker run --rm=true -it -p 8081:8080 bonte/kickoffkata`

To enter the container:

`docker ps` and get ContainerID

`docker exec -it 2f /bin/sh`