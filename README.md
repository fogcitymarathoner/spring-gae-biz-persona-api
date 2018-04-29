spring-gae-biz-persona-api
==========================

Uses JDK 1.8
Use appengine plugin to run local server and deploy to appengine.
Maven targets with TomCat as the server can be used with devtools for fast MVC development.

Comes from this [project](https://github.com/GoogleCloudPlatform/getting-started-java/tree/master/appengine-standard-java8/springboot-appengine-standard)
'mvn appengine:deploy' is WRONG in this link.

Quickstart
==========

# Rename appengine-web.xml - sample.xml to appengine-web.xml
# Enter your appengine project. Use commands above develop and deploy.
# Rename application.properties.sample to application.properties
# Change DB properties

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
joined tables do not work with jackson as demonstrated by 'mysql' branch.

Links
=====

* [Markdown](https://daringfireball.net/projects/markdown/basics)
* [jackson-datatype-hibernate](https://github.com/FasterXML/jackson-datatype-hibernate) for Avoiding infinite loop problem with jackson serializer
* [Jackson – Bidirectional Relationships](http://www.baeldung.com/jackson-bidirectional-relationships-and-infinite-recursion)

To Do
=====

* Todo: switch to JpaRepository for pagination and sorting
* Todo: add [one-to-many](https://www.callicoder.com/hibernate-spring-boot-jpa-one-to-many-mapping-example/) relations to the models (only works for ThymeLeaf)
