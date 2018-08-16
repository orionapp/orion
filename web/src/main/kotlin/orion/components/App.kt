package app

import react.RComponent
import react.RProps
import react.RState
import react.RBuilder
import react.router.dom.browserRouter
import react.router.dom.switch
import react.router.dom.route
import js.utils.require
import login.Login
import home.Home

class App : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            switch {
                route("/", Home::class, exact = true)
                route("/login", Login::class)
            }
        }
    }
}

fun RBuilder.app() = child(App::class) {}
