package konstantin.bezzemelnyi.database

import konstantin.bezzemelnyi.Screen
import konstantin.bezzemelnyi.mock.mockScreens

class ScreensRepo : IScreensRepo {

    private val screens: ArrayList<Screen> = mockScreens

    override suspend fun getScreens(): ArrayList<Screen> {
        return this.screens
    }

}