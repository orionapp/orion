package orion.data
import kotlinx.serialization.*

// TODO - get this working 
// 1 (highest) to 4 (lowest)
// @Serializable
// enum class Priority(val rgb: String)  { 
//     P1("1"),
//     P2("2"),
//     P3("3"),
//     P4("4") 
// }

// TODO - recurrence + subtasks 
@Serializable
data class Task(
    val Id: String = "",
    val CreatedAt: String = "",
    var Description: String = "",
    var Deadline: String = "",
    var Priority: Int = 1,
    var Notes: String  = ""
)

