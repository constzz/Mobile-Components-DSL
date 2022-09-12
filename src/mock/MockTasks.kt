package konstantin.bezzemelnyi.mock

import konstantin.bezzemelnyi.Task
import konstantin.bezzemelnyi.model.Task.TaskBuilder
import konstantin.bezzemelnyi.model.Task.TasksBuilder
import konstantin.bezzemelnyi.model.UIContainer.UIContainer

val mockTasks: ArrayList<Task> = TasksBuilder().apply {
    // 1. Question about the user existence reason
    task {
        container {
            type {
                UIContainer.Type.STACK
            }
            direction {
                UIContainer.Direction.VERTICAL
            }
            components {
                textField("Oh hello")
                label("I do not know why I am here")
            }
        }
    }
    // 2. Question about personal life
    task {
        container {
            type {
                UIContainer.Type.STACK
            }
            direction {
                UIContainer.Direction.VERTICAL
            }
            components {
                label("Do you have a partner?")
                textField("Preferred number of partners")
            }
        }
    }
}.build()