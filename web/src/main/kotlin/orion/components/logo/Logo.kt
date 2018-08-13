package logo

import react.*
import react.dom.*
import kotlinext.js.*
import kotlinx.html.style

fun RBuilder.logo() {
    div("Logo") {
        img(alt = "Orion Logo", src = "assets/images/logo/logo.png", classes = "Logo") {}
    }
}
