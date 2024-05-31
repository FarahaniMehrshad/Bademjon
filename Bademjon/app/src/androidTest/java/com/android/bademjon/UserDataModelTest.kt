import com.android.bademjon.model.UserDataModel
import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class UserDataModelTest {

    private lateinit var userDataModel: UserDataModel

    @Before
    fun setup() {
        userDataModel = UserDataModel()
    }

    @Test
    fun testUpdateName() {
        val newName = "Alice"
        userDataModel.updateName(newName)
        assertEquals(newName, userDataModel.name.value)
    }

    @Test
    fun testUpdateWeight() {
        val newWeight = 70
        userDataModel.updateWeight(newWeight)
        assertEquals(newWeight.toString(), userDataModel.weight.value)
    }

    @Test
    fun testUpdateHeight() {
        val newHeight = 170
        userDataModel.updateHeight(newHeight)
        assertEquals(newHeight.toString(), userDataModel.height.value)
    }

    // Repeat the same test format for other update functions like updateAge, updateWrist, updateRate, updateGender, updateDisease
}
