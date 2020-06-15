package js.model 

import kotlinx.serialization.*
import kotlinx.serialization.json.JSON
import orion.data.Task 

fun ToTask(input: String): Task  {
   var conv  = JSON.parse<Task>(input);
   println(conv)
   return conv
}

// // assigns a UUID, created timestamp 
// fun NewTask(input: String) Task {
//     t = ToTask(input)
    
// }
