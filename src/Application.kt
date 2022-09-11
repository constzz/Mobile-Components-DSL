package konstantin.bezzemelnyi

import io.ktor.application.*
import io.ktor.http.*
import io.ktor.response.*
import io.ktor.routing.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

fun Application.module(testing: Boolean = false) {
    routing {
        route("/hello", HttpMethod.Get) {
            handle {
                call.respondText("hello there")
            }
        }
    }
}

