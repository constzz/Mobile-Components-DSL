package konstantin.bezzemelnyi.model.Task

import konstantin.bezzemelnyi.Screen

class ScreensBuilder {
    private val _tasks: ArrayList<Screen> = ArrayList()

    fun screen(lambda: ScreenBuilder.() -> Unit) {
        this._tasks.add(ScreenBuilder().apply(lambda).build())
    }

    fun build(): ArrayList<Screen> = this._tasks

}