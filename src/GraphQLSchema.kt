package konstantin.bezzemelnyi

import com.apurebase.kgraphql.schema.dsl.SchemaBuilder
import konstantin.bezzemelnyi.mock.mockTasks
import konstantin.bezzemelnyi.model.UIComponent.UIComponent
import konstantin.bezzemelnyi.model.UIComponent.UIComponentType
import konstantin.bezzemelnyi.model.UIContainer.UIContainer

fun SchemaBuilder.schemaValue() {

    query("GetTasksAssigned") {
        description = "Retrieve all the tasks that are assigned on the user."
        resolver { ->
            mockTasks
        }
    }

    type<UIComponent> {}

    enum<UIComponentType>()

    enum<UIContainer.Direction> {}
    enum<UIContainer.Type> {}


}
