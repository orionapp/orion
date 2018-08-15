package index

import app.app
import react.dom.render
import kotlin.browser.document
import js.utils.require

val fontStyles = require("../../src/main/kotlin/orion/css/fonts.css")
val bootstrapStyles = require("../../src/main/kotlin/orion/css/bootstrap.css")
val orionStyles = require("../../src/main/kotlin/orion/css/orion.css")

fun main(args: Array<String>) {
    render(document.getElementById("root")!!) {
        app()
    }
}
