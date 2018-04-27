# spring-gae-biz-persona-api

Uses JDK 1.8
Because this is appengine, none of the Maven Projects in the Intellij apply. Only use command line.
Annotation @Controller does not work, so this platform is not good for MVC type development.

To run locally on port 8081,

mvn appengine:devserver

Deploying to AppEngine Project in appengine-web.xml

mvn appengine:update

Quickstart
Rename appengine-web.xml - sample.xml to appengine-web.xml
Enter your appengine project. Use commands above develop and deploy.

Comes from this project https://github.com/GoogleCloudPlatform/getting-started-java/tree/master/appengine-standard-java8/springboot-appengine-standard
but information like 'mvn appengine:deploy' is WRONG.

H2 database access
jdbc:h2:mem:testdb

devtools does not work

Todo: Remove demonstration labels like 'demo', 'example' and 'hello'
Todo: Reformat this README.md