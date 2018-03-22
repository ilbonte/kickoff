`./gradlew clean war`

`docker build -t bonte/kickoffkata .`

`docker run --rm=true -it -p 8081:8080 bonte/kickoffkata`

Visit: http://localhost:8081/kick-off-kata-1.0-SNAPSHOT/hello/guest

To enter the container:

`docker ps` and get ContainerID

`docker exec -it 2f /bin/sh`


# Todo
[] Deploy in pro "manuale"
[] CI/CD
[] DB
[] Gestione sessioni
[] Gestione properites per gli ambienti

--------------
Cose fatte:

Per tomcat dobbiamo:
 - estendere SparkApplication e implementare init() (http://sparkjava.com/documentation#other-web-server)
 - creare un web.xml adatto
