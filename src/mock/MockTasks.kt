package konstantin.bezzemelnyi.mock

import konstantin.bezzemelnyi.Screen
import konstantin.bezzemelnyi.model.Task.ScreensBuilder
import konstantin.bezzemelnyi.model.UIContainer.UIContainer

val mockScreens: ArrayList<Screen> = ScreensBuilder().apply {
    // 1. Question about the user existence reason
    screen {
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
    screen {
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