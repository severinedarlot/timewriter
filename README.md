# timewriter
-------------

This is my timewriter

# Prerequisite

Brew on MacOs 


## Java 17

Java 17 (because accoriding to https://docs.spring.io/spring-shell/docs/3.1.1/docs/index.html, Spring Shell is based on Spring Boot 3.1.0 and Spring Framework 6.0.9 and thus requires JDK 17.)

### With JEnv

JEnv because it's handy to switch on Java 17 but you have to install it before
To install it: https://www.jenv.be/ (console zsh)
Basic commands:
- jenv versions
- jenv local 17.0.7 (to create the .java-version file)

### With SDKMan

https://sdkman.io/install
sdk install java 17.0.7-oracle
sdk use java 17.0.7-oracle
sdk env init (to create the .sdkmanrc file)

## Gradle
    brew install gradle

