package konstantin.bezzemelnyi

import konstantin.bezzemelnyi.model.UIContainer.UIContainer
import java.util.*

data class Task(
    val container: UIContainer,
    val id: String = UUID.randomUUID().toString()
)

data class TaskAnswerInput(
    val answers: TaskAnswer<Any>
)

class TaskAnswer<T>(
    val value: T
)