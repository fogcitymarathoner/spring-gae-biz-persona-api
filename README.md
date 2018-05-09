spring-gae-biz-persona-api
==========================

Uses JDK 1.8
Use appengine plugin to run local server and deploy to appengine.
Maven targets with TomCat as the server can be used with devtools for fast MVC development.

Comes from this [project](https://github.com/GoogleCloudPlatform/getting-started-java/tree/master/appengine-standard-java8/springboot-appengine-standard)
'mvn appengine:deploy' is WRONG in this link.

Quickstart
==========

1. Rename appengine-web.xml - sample.xml to appengine-web.xml
2. Enter your appengine project. Use commands above develop and deploy.
3. Rename application.properties.sample to application.properties
4. Change DB properties

To run locally on port 8081
---------------------------

mvn appengine:devserver

Deploying to AppEngine Project specified in appengine-web.xml
-------------------------------------------------------------
mvn appengine:update

H2 Database for local development
---------------------------------

H2 database access
jdbc:h2:mem:testdb

Caveats
-------
devtools does not work with appengine.
table joined models do not work with jackson. work ok with ThymeLeaf.

Links
=====

* [Markdown](https://daringfireball.net/projects/markdown/basics)
* [jackson-datatype-hibernate](https://github.com/FasterXML/jackson-datatype-hibernate) for Avoiding infinite loop problem with jackson serializer
* [Jackson – Bidirectional Relationships](http://www.baeldung.com/jackson-bidirectional-relationships-and-infinite-recursion)

To Do
=====

* Todo: switch to JpaRepository for pagination and sorting
* Todo: add [one-to-many](https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/) relations to the models (only works for ThymeLeaf)
* Todo: Add [Oauth2](https://spring.io/guides/tutorials/spring-boot-oauth2/#_social_login_manual) social login
