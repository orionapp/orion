package logo

import react.*
import react.dom.*
import js.utils.require

val logoStyles = require("../../src/main/kotlin/orion/components/logo/logo.css")

fun RBuilder.logo() {
    div("Logo") {
        img(alt = "Orion Logo", src = "/static/images/logo/logo.png", classes = "Logo") {}
    }
}
