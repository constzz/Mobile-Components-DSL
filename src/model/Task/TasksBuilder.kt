package konstantin.bezzemelnyi.model.Task

import konstantin.bezzemelnyi.Task

class TasksBuilder {
    private val _tasks: ArrayList<Task> = ArrayList()

    fun task(lambda: TaskBuilder.() -> Unit) {
        this._tasks.add(TaskBuilder().apply(lambda).build())
    }

    fun build(): ArrayList<Task> = this._tasks

}