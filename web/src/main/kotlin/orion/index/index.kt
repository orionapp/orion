package index

import app.app
import react.dom.render
import kotlinext.js.js
import kotlinext.js.requireAll
import kotlinext.js.require
import kotlin.browser.document

fun main(args: Array<String>) {
    render(document.getElementById("root")!!) {
        app()
    }
}
