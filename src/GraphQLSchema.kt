package konstantin.bezzemelnyi

import com.apurebase.kgraphql.schema.dsl.SchemaBuilder
import io.ktor.http.*
import konstantin.bezzemelnyi.database.IScreensRepo
import konstantin.bezzemelnyi.database.IncorrectTaskID
import konstantin.bezzemelnyi.database.ScreensRepo
import konstantin.bezzemelnyi.model.UIComponent.UIComponent
import konstantin.bezzemelnyi.model.UIComponent.UIComponentType
import konstantin.bezzemelnyi.model.UIContainer.UIContainer

fun SchemaBuilder.schemaValue() {

    val screensRepo: IScreensRepo = ScreensRepo()

    query("GetScreens") {
        description = "Retrieve all the screens for the user."
        resolver { ->
            screensRepo.getScreens()
        }
    }

    type<UIComponent> {}

    type<IncorrectTaskID>()
    enum<UIComponentType>()

    enum<UIContainer.Direction> {}
    enum<UIContainer.Type> {}


}
