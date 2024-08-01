package com.example.submission_jetpack_compose.navigation

sealed class Screen(val route : String) {
    object Home : Screen("home")

    object Detail : Screen("detail?&name={name}&city={city}&image={image}&desc={desc}"){
        fun createRoute(
            name : String?,
            city : String?,
            image : String?,
            desc : String?
        ): String{
            return "detail?&name=${name}&city=${city}&image=${image}&desc=${desc}"
        }
    }

    object Profile : Screen("profile")
}