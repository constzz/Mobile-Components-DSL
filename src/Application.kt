package konstantin.bezzemelnyi

import com.apurebase.kgraphql.GraphQL
import io.ktor.application.*
import io.ktor.server.netty.*


fun main(args: Array<String>): Unit = EngineMain.main(args)

fun Application.module(testing: Boolean = false) {
    install(GraphQL) {
        schema { schemaValue() }
        playground = true
    }
}


