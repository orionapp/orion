package jvm.orion.app

import javafx.scene.control.Label
import javafx.scene.layout.HBox
import tornadofx.App
import tornadofx.View

class HelloWorld : View() {
    override val root = HBox(Label("Hello world!"))
}

class OrionApp : App() {
    override val primaryView = HelloWorld::class
}