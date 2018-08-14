package login

import react.RComponent
import react.RProps
import react.RState
import react.RBuilder
import react.dom.div
import logo.logo
import js.utils.require

val loginStyles = require("../../src/main/kotlin/orion/components/login/login.css")

class Login : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        div("center-div-outer") {
            logo()
        }
    }
}