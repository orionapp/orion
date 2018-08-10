package index

import app.*
import react.dom.*
import kotlinext.js.*
import kotlin.browser.*

fun main(args: Array<String>) {

    // Load external style sheets.
    //
    // TODO: Fix this to work when hosted on Google Drive.
    //
    requireAll(require.context("src", true, js("/\\.css$/")))

    // Render app.
    render(document.getElementById("root")) {
        app()
    }
}
