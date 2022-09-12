package konstantin.bezzemelnyi

import com.apurebase.kgraphql.schema.dsl.SchemaBuilder
import konstantin.bezzemelnyi.mock.mockTasks

fun SchemaBuilder.schemaValue() {

    query("GetTasksAssigned") {
        description = "Retrieve all the tasks that are assigned on the user."
        resolver { ->
            mockTasks
        }
    }
}
