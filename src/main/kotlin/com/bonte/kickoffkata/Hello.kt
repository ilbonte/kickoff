package com.bonte.kickoffkata

import spark.Request
import spark.Response
import spark.Spark
import spark.servlet.SparkApplication

class Hello : SparkApplication {
    override fun init() {

        Spark.get("/"
        ) { request: Request, response: Response ->
            response.redirect("/sparkServletExample/hello")
            null
        }

        Spark.get("/hello"
        ) { request: Request, response: Response -> "Hello World!" }

        Spark.get("/hello/:name"
        ) { request: Request, response: Response -> String.format("Hello, %s!", request.params(":name")) }
    }
}