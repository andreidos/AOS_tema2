FROM java:8

COPY ./target/lab3-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch lab3-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","lab3-0.0.1-SNAPSHOT.jar"]  