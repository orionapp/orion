package app

import react.*
import react.dom.*
import logo.*

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("center-div-outer") {
            logo()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
