package logo

import react.*
import styled.*
import kotlinx.css.*
import js.utils.require

val logoImg = require("../../../assets/images/logo/logo.png")

fun RBuilder.logo() {
    styledImg(alt = "Orion Logo", src = logoImg) {
        css {
            height = 60.px
            padding(10.px)
        }
    }
}
