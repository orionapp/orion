import javafx.scene.control.Label
import javafx.scene.layout.HBox
import tornadofx.App
import tornadofx.View

class WelcomeView : View() {
    override val root = HBox(Label("Welcome to Orion!"))
}

class OrionApp : App() {
    override val primaryView = WelcomeView::class
}