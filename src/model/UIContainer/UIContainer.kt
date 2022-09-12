package konstantin.bezzemelnyi.model.UIContainer

import konstantin.bezzemelnyi.model.UIComponent.UIComponent

class UIContainer(
    val type: Type,
    val direction: Direction,
    val components: ArrayList<UIComponent>
) {
    enum class Type {
        STACK,
        REUSABLE_LIST
    }

    enum class Direction {
        HORIZONTAL,
        VERTICAL
    }
}

fun UIContainer(lambda: UIContainerBuilder.() -> Unit): UIContainer {
    return UIContainerBuilder().apply(lambda).build()
}
