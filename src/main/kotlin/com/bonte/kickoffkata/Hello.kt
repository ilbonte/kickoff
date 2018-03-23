package com.bonte.kickoffkata

import spark.Request
import spark.Response
import spark.Spark
import spark.servlet.SparkApplication

class Hello : SparkApplication {
    override fun init() {

        Spark.get("/"
        ) { _: Request, response: Response ->
            response.redirect("/hello")
            null
        }

        Spark.get("/hello"
        ) { _: Request, _: Response -> MySQLDatabaseExampleKotlin.executeMySQLQuery() }

        Spark.get("/hello/:name"
        ) { request: Request, _: Response -> String.format("Hello, %s!", request.params(":name")) }
    }
}