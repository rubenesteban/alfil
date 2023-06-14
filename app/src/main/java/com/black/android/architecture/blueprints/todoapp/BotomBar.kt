package com.black.android.architecture.blueprints.todoapp




import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.android.architecture.blueprints.todoapp.R



@Composable
fun MenuBottomNavigation(navController: NavController, task1:() -> Unit, task2:() -> Unit, task3:() -> Unit) {


    BottomNavigation {

        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route


        BottomNavigationItem(
            selected = currentRoute == "Home",
            onClick = task1,
            icon = { Icon(painterResource(id = R.drawable.ic_done), contentDescription = "inicio") },
            label = { Text(text = "Home") }
        )

        BottomNavigationItem(
            selected = currentRoute == "List",
            onClick = task2,
            icon = { Icon(painterResource(id = R.drawable.ic_menu), contentDescription = "inicio") },
            label = { Text(text = "List") }
        )
        BottomNavigationItem(
            selected = currentRoute == "Pdfs",
            onClick = task3,
            icon = { Icon(painterResource(id = R.drawable.ic_filter_list), contentDescription = "inicio") },
            label = { Text(text = "Pdfs") }
        )

    }

}


