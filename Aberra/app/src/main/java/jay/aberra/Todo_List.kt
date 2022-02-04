package jay.aberra

import java.time.format.DateTimeFormatter

data class Todo_List(
    var newTodo: String,
    var dueDate: String,
    var ischecked: Boolean
)