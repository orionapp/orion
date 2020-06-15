import kotlin.test.*
import kotlin.js.*
import orion.data.*
import js.model.*


class TestSource {
    @Test
    fun testToTask() {
        var expect1 = Task(
                Id = "123",
                Description = "resign",
                CreatedAt = "2018-08-17",
                Deadline = "2018-08-20",
                Priority = 1, 
                Notes = "some notes go here"
        )
        var test1 = """
        {
            "Id": "123",
            "Description": "resign",
            "CreatedAt": "2018-08-17",
            "Deadline": "2018-08-20",
            "Priority": 1,
            "Notes": "some notes go here"
        }
        """

        assertEquals(
            expect1,
            ToTask(test1)
        )
    }
}
