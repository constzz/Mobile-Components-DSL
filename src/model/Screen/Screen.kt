package konstantin.bezzemelnyi

import konstantin.bezzemelnyi.model.UIContainer.UIContainer
import java.util.*

data class Screen(
    val container: UIContainer,
    val id: String = UUID.randomUUID().toString()
)