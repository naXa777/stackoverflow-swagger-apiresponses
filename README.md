# Swagger @ApiResponses Demo

A mini project to answer a Stack Overflow [question](https://stackoverflow.com/q/46324478/1429387) about Swagger annotations.
It demonstrates Swagger annotations, specifically [`@ApiResponses`](http://docs.swagger.io/swagger-core/apidocs/com/wordnik/swagger/annotations/ApiResponse.html), for configuring responses in API documentation.

For more details read [the answer](https://stackoverflow.com/a/53266819/1429387).

## Technologies

* Java 8
* Spring Boot 2
* Spring MVC
* Springfox
* Gradle

## Build

[![Build Status](https://travis-ci.com/naXa777/stackoverflow-swagger-apiresponses.svg?branch=master&style=flat)](https://travis-ci.com/naXa777/stackoverflow-swagger-apiresponses)

```$sh
./gradlew bootRun
```

Open http://localhost:8080/swagger-ui.html in browser.

## Screenshots

![Swagger UI](/screenshots/api-documentation.png)

## License

This work is licensed under [Creative Commons Attribution-Share Alike](https://creativecommons.org/licenses/by-sa/4.0/). [Proper attribution](https://stackoverflow.blog/2009/06/25/attribution-required/) is required if you republish this repository content.
