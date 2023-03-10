package com.lmorda.listdetails

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.lmorda.listdetails.navigation.RepoList
import com.lmorda.repolist.RepoListScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ListDetailsActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = RepoList.route,
            ) {
                composable(route = RepoList.route) {
                    RepoListScreen()
                }
            }
        }
    }
}