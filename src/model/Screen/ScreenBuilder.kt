package konstantin.bezzemelnyi.model.Task

import konstantin.bezzemelnyi.Screen
import konstantin.bezzemelnyi.model.UIContainer.UIContainer
import konstantin.bezzemelnyi.model.UIContainer.UIContainerBuilder

class ScreenBuilder {
    private lateinit var _container: UIContainer

    fun container(lambda: UIContainerBuilder.() -> Unit) {
        this._container = UIContainerBuilder().apply { lambda() }.build()
    }

    fun build(): Screen {
        if (!this::_container.isInitialized) {
            throw RuntimeException("Container must be initialized before task instantiation.")
        }
        return Screen(container = _container)
    }
}