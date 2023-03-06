package com.example.jetnav1

const val SCREEN1_ARGUMENT1 = "id"
const val SCREEN1_ARGUMENT2 = "name"

sealed class Screens(val route: String) {
    object Screen1 : Screens(route = "screen_1")

    //object Screen2 : Screens(route = "screen_2/{id}")
    object Screen2 : Screens(route = "screen_2/{$SCREEN1_ARGUMENT1}/{$SCREEN1_ARGUMENT2}") {
        /*fun passId(id: Int): String {
            return "screen_2/$id"
        }*/

//        fun passId(id: Int): String {
//            return this.route.replace(oldValue = "{$DETAIL_ARGUMENT}", newValue = id.toString())
//        }

        fun passIdName(id:Int,name:String):String{
            return "screen_2/$id/$name"
        }
    }

}