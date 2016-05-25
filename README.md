# PIK
Project for the purpose of PIK - programming corporate and internet applications

# Build and run

## Prerequisites

* Git
* JDK 1.8
* Maven

## Instructions

First clone the repository and enter its directory:
```
$ git clone https://github.com/pkubik/pik.git
$ cd pik
```

Let maven download all dependencies and prepare the jar:
```
$ mvn package
```

Run the server:
```
$ java -jar target/pik-project.jar
```

Alternatively you can replace previous step with one:
```
$ mvn spring-boot:run
```

You can kill the running server with the keyboard interrupt `CTRL+C`.


> Note: Maven will check for changes and repeat only the necessary steps during consequent runs.

Refer to the wiki for more details.
