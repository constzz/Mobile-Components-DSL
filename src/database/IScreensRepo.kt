package konstantin.bezzemelnyi.database

import konstantin.bezzemelnyi.Screen

object IncorrectTaskID : Error("Incorrect task ID provided.")

interface IScreensRepo {

    suspend fun getScreens(): ArrayList<Screen>

}