package login

import react.*
import styled.*
import kotlinx.css.*
import logo.logo
import js.utils.require

class Login : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        logo()
        styledDiv {
            css {
                classes = arrayListOf("center-div-outer")
                height = 100.pct.minus(80.px)
                margin(top = -30.px)
            }
            styledDiv {
                styledH1 {
                    css {
                        fontSize = 70.px
                        margin(vertical = 0.px)
                    }
                    +"Orion"
                }
                styledP {
                    css {
                        fontSize = 20.px
                    }
                    +"A task manager for everyone."
                }
            }
        }
    }
}