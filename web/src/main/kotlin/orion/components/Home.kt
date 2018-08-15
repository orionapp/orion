package home

import react.*
import styled.*
import kotlinx.css.*
import js.utils.require

class Home : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledDiv {
            css {
                classes = arrayListOf("center-div-outer")
                height = 100.pct
            }
            styledH1 {
                +"Coming Soon..."
            }
        }
    }
}
