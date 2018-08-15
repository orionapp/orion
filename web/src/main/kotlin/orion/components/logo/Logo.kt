package logo

import react.*
import react.dom.*
import js.utils.require

val logoStyles = require("../../src/main/kotlin/orion/components/logo/logo.css")
val logoImg = require("../../../assets/images/logo/logo.png")

fun RBuilder.logo() {
    div("Logo") {
        img(alt = "Orion Logo", src = logoImg, classes = "Logo") {}
    }
}