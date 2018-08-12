import react.dom.render
import kotlin.browser.document
import kotlin.browser.window
import react.dom.h1

fun main(args: Array<String>) {
    window.onload = {
        render(document.getElementById("root")) {
            h1 {
                +"Hello world!"
            }
        }
    }
}