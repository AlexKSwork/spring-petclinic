# Spring PetClinic Sample Application [![Build Status](https://travis-ci.org/spring-projects/spring-REMOVED.png?branch=master)](https://travis-ci.org/spring-projects/spring-REMOVED/)

## Understanding the Spring Petclinic application with a few diagrams
<a href="https://speakerdeck.com/michaelisvy/spring-REMOVED-sample-application">See the presentation here</a>

## Running REMOVED locally
Petclinic is a https://spring.io/guides/gs/spring-boot[Spring Boot] application built using https://spring.io/guides/gs/maven/[Maven]. You can build a jar file and run it from the command line:


```
git clone https://github.com/spring-projects/spring-REMOVED.git
cd spring-REMOVED
./mvnw package
java -jar target/*.jar
```

You can then access REMOVED here: http://localhost:8080/

<img width="1042" alt="REMOVED-screenshot" src="https://cloud.githubusercontent.com/assets/838318/19727082/2aee6d6c-9b8e-11e6-81fe-e889a5ddfded.png">

Or you can run it from Maven directly using the Spring Boot Maven plugin. If you do this it will pick up changes that you make in the project immediately (changes to Java source files require a compile as well - most people use an IDE for this):

```
./mvnw spring-boot:run
```

## In case you find a bug/suggested improvement for Spring Petclinic
Our issue tracker is available here: https://github.com/spring-projects/spring-REMOVED/issues


## Database configuration

In its default configuration, Petclinic uses an in-memory database (HSQLDB) which
gets populated at startup with data. A similar setup is provided for MySql in case a persistent database configuration is needed.
Note that whenever the database type is changed, the app needs to be run with a different profile: `spring.profiles.active=mysql` for MySql.

You could start MySql locally with whatever installer works for your OS, or with docker:

```
docker run -e MYSQL_ROOT_PASSWORD=REMOVED -e MYSQL_DATABASE=REMOVED -p 3306:3306 mysql:5.7.8
```

## Working with Petclinic in your IDE

### prerequisites
The following items should be installed in your system:
* Java 8 or newer.
* git command line tool (https://help.github.com/articles/set-up-git)
* Your prefered IDE 
  * Eclipse with the m2e plugin. Note: when m2e is available, there is an m2 icon in Help -> About dialog. If m2e is not there, just follow the install process here: http://www.eclipse.org/m2e/
  * or [Spring Tools Suite](https://spring.io/tools) (STS)
  * or IntelliJ IDEA

### Steps:

1) In the command line
```
git clone https://github.com/spring-projects/spring-REMOVED.git
```
2) Inside Eclipse or STS
```
File -> Import -> Maven -> Existing Maven project
```

Then either build on the command line `./mvnw install` or using the Eclipse launcher (right click on project and `Run As -> Maven install`) to generate the css. Run the application main method by right clicking on it and choosing `Run As -> Java Application`.

3) Or inside IntelliJ IDEA

On the main menu, select `File -> Open`. Select the Petclinic [pom.xml](pom.xml). Click on the `Open as Project` button.
Then either build on the command line `./mvnw install` or right click on the `spring-REMOVED` project then `Maven -> Generates sources and Update Folders` to generate the CSS.
Run the application by right clicking on the `PetClinicApplication` main class and choosing `Run 'PetClinicApplication'`.

4) Navigate to Petclinic

Visit [http://localhost:8080](http://localhost:8080) in your browser.


## Looking for something in particular?

|Spring Boot Configuration | Class or Java property files  |
|--------------------------|---|
|The Main Class | [PetClinicApplication](https://github.com/spring-projects/spring-REMOVED/blob/master/src/main/java/org/springframework/samples/REMOVED/PetClinicApplication.java) |
|Properties Files | [application.properties](https://github.com/spring-projects/spring-REMOVED/blob/master/src/main/resources) |
|Caching | [CacheConfiguration](https://github.com/spring-projects/spring-REMOVED/blob/master/src/main/java/org/springframework/samples/REMOVED/system/CacheConfiguration.java) |

## Interesting Spring Petclinic branches and forks

The Spring Petclinic master branch in the main
[spring-projects](https://github.com/spring-projects/spring-REMOVED)
GitHub org is the "canonical" implementation, currently based on
Spring Boot and Thymeleaf. There are quite a few forks in a special
GitHub org [spring-REMOVED](https://github.com/spring-REMOVED). If
you have a special interest in a different technology stack that could
be used to implement the Pet Clinic then please join the community
there.

| Link                               | Main technologies |
|------------------------------------|-------------------|
| [spring-framework-REMOVED][]     | Spring Framework XML configuration, JSP pages, 3 persistence layers: JDBC, JPA and Spring Data JPA |
| [javaconfig branch][]              | Same frameworks as the [spring-framework-REMOVED][] but with Java Configuration instead of XML |
| [spring-REMOVED-angularjs][]     | AngularJS 1.x, Spring Boot and Spring Data JPA |
| [spring-REMOVED-angular][]       | Angular 4 front-end of the Petclinic REST API [spring-REMOVED-rest][] |
| [spring-REMOVED-microservices][] | Distributed version of Spring Petclinic built with Spring Cloud |
| [spring-REMOVED-reactjs][]       | ReactJS (with TypeScript) and Spring Boot |
| [spring-REMOVED-graphql][]       | GraphQL version based on React Appolo, TypeScript and GraphQL Spring boot starter |
| [spring-REMOVED-kotlin][]        | Kotlin version of [spring-REMOVED][] |
| [spring-REMOVED-rest][]          | Backend REST API |


## Interaction with other open source projects

One of the best parts about working on the Spring Petclinic application is that we have the opportunity to work in direct contact with many Open Source projects. We found some bugs/suggested improvements on various topics such as Spring, Spring Data, Bean Validation and even Eclipse! In many cases, they've been fixed/implemented in just a few days.
Here is a list of them:

| Name | Issue |
|------|-------|
| Spring JDBC: simplify usage of NamedParameterJdbcTemplate | [SPR-10256](https://jira.springsource.org/browse/SPR-10256) and [SPR-10257](https://jira.springsource.org/browse/SPR-10257) |
| Bean Validation / Hibernate Validator: simplify Maven dependencies and backward compatibility |[HV-790](https://hibernate.atlassian.net/browse/HV-790) and [HV-792](https://hibernate.atlassian.net/browse/HV-792) |
| Spring Data: provide more flexibility when working with JPQL queries | [DATAJPA-292](https://jira.springsource.org/browse/DATAJPA-292) |


# Contributing

The [issue tracker](https://github.com/spring-projects/spring-REMOVED/issues) is the preferred channel for bug reports, features requests and submitting pull requests.

For pull requests, editor preferences are available in the [editor config](.editorconfig) for easy use in common text editors. Read more and download plugins at <http://editorconfig.org>. If you have not previously done so, please fill out and submit the https://cla.pivotal.io/sign/spring[Contributor License Agreement].

# License

The Spring PetClinic sample application is released under version 2.0 of the [Apache License](http://www.apache.org/licenses/LICENSE-2.0).

[spring-REMOVED]: https://github.com/spring-projects/spring-REMOVED
[spring-framework-REMOVED]: https://github.com/spring-REMOVED/spring-framework-REMOVED
[spring-REMOVED-angularjs]: https://github.com/spring-REMOVED/spring-REMOVED-angularjs 
[javaconfig branch]: https://github.com/spring-REMOVED/spring-framework-REMOVED/tree/javaconfig
[spring-REMOVED-angular]: https://github.com/spring-REMOVED/spring-REMOVED-angular
[spring-REMOVED-microservices]: https://github.com/spring-REMOVED/spring-REMOVED-microservices
[spring-REMOVED-reactjs]: https://github.com/spring-REMOVED/spring-REMOVED-reactjs
[spring-REMOVED-graphql]: https://github.com/spring-REMOVED/spring-REMOVED-graphql
[spring-REMOVED-kotlin]: https://github.com/spring-REMOVED/spring-REMOVED-kotlin
[spring-REMOVED-rest]: https://github.com/spring-REMOVED/spring-REMOVED-rest
