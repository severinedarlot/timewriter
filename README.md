# timewriter
-------------

This is my timewriter

# Prerequisite

## Nice to have
Brew on MacOs  https://brew.sh


## Java 17

Java 17 (because accoriding to https://docs.spring.io/spring-shell/docs/3.1.1/docs/index.html, Spring Shell is based on Spring Boot 3.1.0 and Spring Framework 6.0.9 and thus requires JDK 17.)

### Easy With SDKMan

https://sdkman.io/install
sdk install java 17.0.7-oracle
sdk use java 17.0.7-oracle
sdk env init (to create the .sdkmanrc file)

Be sure that auto-env is enabled through the sdkman_auto_env config
open $HOME/.sdkman/etc/config and be sure that sdkman_auto_env=true

## Gradle
    brew install gradle

# Build and run

    gradle build
    gradle jar
    java -jar build/libs/timewriter-0.0.1-SNAPSHOT.jar 

