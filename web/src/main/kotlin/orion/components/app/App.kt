package app

import react.*
import react.dom.*
import logo.*
import js.utils.require

val appStyles = require("../../src/main/kotlin/orion/components/app/app.css")

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("center-div-outer") {
            logo()
        }
    }
}

fun RBuilder.app() = child(App::class) {}
