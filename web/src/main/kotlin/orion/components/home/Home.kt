package home

import react.RComponent
import react.RProps
import react.RState
import react.RBuilder
import react.dom.div
import react.dom.h1
import js.utils.require

val homeStyles = require("../../src/main/kotlin/orion/components/home/home.css")

class Home : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("center-div-outer") {
            h1 {
                +"Coming Soon..."
            }
        }
    }
}
