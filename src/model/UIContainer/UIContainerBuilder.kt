package konstantin.bezzemelnyi.model.UIContainer

import konstantin.bezzemelnyi.model.UIComponent.UIComponent
import konstantin.bezzemelnyi.model.UIComponent.UIContainerComponentsBuilder

class UIContainerBuilder {

    private var type: UIContainer.Type = UIContainer.Type.STACK
    private var direction: UIContainer.Direction = UIContainer.Direction.VERTICAL
    private var components: ArrayList<UIComponent> = ArrayList()

    fun type(lambda: () -> UIContainer.Type) {
        this.type = lambda()
    }

    fun direction(lambda: () -> UIContainer.Direction) {
        this.direction = lambda()
    }

    fun components(lambda: UIContainerComponentsBuilder.() -> Unit) {
        this.components = UIContainerComponentsBuilder().apply(lambda).build()
    }

    fun build(): UIContainer = UIContainer(this.type, this.direction, this.components)
}