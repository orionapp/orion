package index

import app.app
import react.dom.render
import kotlin.browser.document
import js.utils.require

val fontStyles = require("../../src/main/kotlin/orion/index/fonts.css")
val indexStyles = require("../../src/main/kotlin/orion/index/index.css")

fun main(args: Array<String>) {
    render(document.getElementById("root")!!) {
        app()
    }
}
