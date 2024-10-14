package com.example.a2unit_1pathway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.a2unit_1pathway.ui.theme._2unit_1pathwayTheme

//fun main() {
//    println(1 < 1)
//}

//------------------------------------------------
fun main() {
    val trafficLightColor = "Black"

    val message =
        if (trafficLightColor == "Red") "Stop"
        else if (trafficLightColor == "Yellow") "Slow"
        else if (trafficLightColor == "Green") "Go"
        else "Invalid traffic-light color"

    println(message)
}
 //-----------------------------------------------
//fun main() {
//    val trafficLightColor = "Amber"

//    when (trafficLightColor) {
//        "Red" -> println("Stop")
//        "Yellow", "Amber" -> println("Slow")
//        "Green" -> println("Go")
//        else -> println("Invalid traffic-light color")
//    }
//}
//-------------------------------------------------

//fun main() {
//    val x: Any = 20

//    when (x) {
//       2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
//        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
//        is Int -> println("x is an integer number, but not between 1 and 10.")
//        else -> println("x isn't an integer number.")
//    }
//}
//-----------------------------------------------------