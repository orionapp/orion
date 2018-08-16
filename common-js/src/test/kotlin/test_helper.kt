import kotlin.test.*
import kotlin.js.JSON 
import orion.data.*
import js.model.*

class TestSource {
    @Test
    fun testToTask() {
        var myTask = Task("123", "resign", 2)

        var s = """
        {
            "Id": "123",
            "Description": "resign",
            "Priority": 2
        }
        """ 
        assertEquals(
            myTask,
            ToTask(s)
        )
    }
}
