spring-gae-biz-persona-api
==========================

Uses JDK 1.8
Because this is appengine, none of the Maven Projects in the Intellij apply. Only use command line.
Annotation @Controller does not work, so this platform is not good for MVC type development.

Quickstart
==========
Rename appengine-web.xml - sample.xml to appengine-web.xml
Enter your appengine project. Use commands above develop and deploy.

Comes from this project https://github.com/GoogleCloudPlatform/getting-started-java/tree/master/appengine-standard-java8/springboot-appengine-standard
but information like 'mvn appengine:deploy' is WRONG.

To run locally on port 8081,

mvn appengine:devserver

Deploying to AppEngine Project in appengine-web.xml

mvn appengine:update

Database
--------

H2 database access
jdbc:h2:mem:testdb

devtools does not work with appengine.

Links
=====

* [Markdown](https://daringfireball.net/projects/markdown/basics)

To Do
=====

* Todo: switch to JpaRepository for pagination and sorting
* Todo: add [one-to-many](https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/) relations to the models
