package com.example.submission_jetpack_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.submission_jetpack_compose.navigation.Screen
import com.example.submission_jetpack_compose.ui.detail.DetailScreens
import com.example.submission_jetpack_compose.ui.home.HomeScreens
import com.example.submission_jetpack_compose.ui.profile.ProfileScreens
import com.example.submission_jetpack_compose.ui.theme.Submission_jetpack_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Submission_jetpack_composeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController: NavHostController = rememberNavController()
                    NavHost(
                        navController = navController,
                        startDestination = Screen.Home.route
                    ) {
                        composable(Screen.Home.route) {
                            HomeScreens(
                                goToDetail = {name, city, image, desc ->
                                    navController.navigate(
                                        Screen.Detail.createRoute(
                                            name, city, image, desc
                                        )
                                    )
                                },
                                goToProfile = { navController.navigate(Screen.Profile.route)}
                            )
                        }
                        composable(
                            Screen.Detail.route,
                            arguments = listOf(
                                navArgument("name") {
                                    type = NavType.StringType
                                    defaultValue = ""
                                },
                                navArgument("city") {
                                    type = NavType.StringType
                                    defaultValue = ""
                                },
                                navArgument("image") {
                                    type = NavType.StringType
                                    defaultValue = ""
                                },
                                navArgument("desc") {
                                    type = NavType.StringType
                                    defaultValue = ""
                                },
                            ),
                        ) {
                            val name = it.arguments!!.getString("name", "")
                            val city = it.arguments!!.getString("city", "")
                            val image = it.arguments!!.getString("image", "")
                            val desc = it.arguments!!.getString("desc", "")
                            DetailScreens(
                                goBack = { navController.navigateUp() },
                                nameBus = name,
                                cityBus = city,
                                imageBus = image,
                                descriptionBus = desc
                            )
                        }
                        composable(Screen.Profile.route) {
                            ProfileScreens { navController.navigateUp() }
                        }
                    }
                }
            }
        }
    }
}