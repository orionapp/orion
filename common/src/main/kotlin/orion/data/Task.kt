package orion.data

import kotlinx.serialization.*

@Serializable
data class Task(
    val Id: String, 
    val Description: String, 
    val Priority: Int
)

