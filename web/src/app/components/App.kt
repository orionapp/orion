package app

import react.*
import react.dom.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("center-div") {
            h1 {
                +"Welcome to Orion!"
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
