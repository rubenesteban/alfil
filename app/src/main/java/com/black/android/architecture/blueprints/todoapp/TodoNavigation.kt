/*
 * Copyright 2022 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.black.android.architecture.blueprints.todoapp

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import com.example.android.architecture.blueprints.todoapp.TodoDestinationsArgs.TASK_ID_ARG
import com.example.android.architecture.blueprints.todoapp.TodoDestinationsArgs.TITLE_ARG
import com.example.android.architecture.blueprints.todoapp.TodoDestinationsArgs.USER_MESSAGE_ARG
import com.example.android.architecture.blueprints.todoapp.TodoScreens.ADD_EDIT_TASK_SCREEN
import com.example.android.architecture.blueprints.todoapp.TodoScreens.STATISTICS_SCREEN
import com.example.android.architecture.blueprints.todoapp.TodoScreens.TASKS_SCREEN
import com.example.android.architecture.blueprints.todoapp.TodoScreens.TASK_DETAIL_SCREEN
import com.example.android.architecture.blueprints.todoapp.TodoScreens.chitasS_SCREEN
import com.example.android.architecture.blueprints.todoapp.TodoScreens.legueS_SCREEN
import com.example.android.architecture.blueprints.todoapp.TodoScreens.sta_SCREEN
import com.example.android.architecture.blueprints.todoapp.TodoScreens.state_SCREEN
import com.example.android.architecture.blueprints.todoapp.TodoScreens.tigreS_SCREEN
import com.example.android.architecture.blueprints.todoapp.TodoScreens.vetteS_SCREEN

/**
 * Screens used in [TodoDestinations]
 */
private object TodoScreens {
    const val TASKS_SCREEN = "tasks"
    const val vetteS_SCREEN = "vegetables"
    const val legueS_SCREEN = "legumes"
    const val tigreS_SCREEN = "grains"
    const val chitasS_SCREEN = "groceries"
    const val STATISTICS_SCREEN = "statistics"
    const val state_SCREEN = "state"
    const val sta_SCREEN = "start"
    const val TASK_DETAIL_SCREEN = "task"
    const val ADD_EDIT_TASK_SCREEN = "addEditTask"
}

/**
 * Arguments used in [TodoDestinations] routes
 */
object TodoDestinationsArgs {
    const val USER_MESSAGE_ARG = "userMessage"
    const val TASK_ID_ARG = "taskId"
    const val TITLE_ARG = "title"
}

/**
 * Destinations used in the [TodoActivity]
 */
object TodoDestinations {
    const val TASKS_ROUTE = "$TASKS_SCREEN?$USER_MESSAGE_ARG={$USER_MESSAGE_ARG}"
    const val vegetteS_ROUTE = "$vetteS_SCREEN?$USER_MESSAGE_ARG={$USER_MESSAGE_ARG}"
    const val legueS_ROUTE = "$legueS_SCREEN?$USER_MESSAGE_ARG={$USER_MESSAGE_ARG}"
    const val tigreS_ROUTE = "$tigreS_SCREEN?$USER_MESSAGE_ARG={$USER_MESSAGE_ARG}"
    const val chitasS_ROUTE = "$chitasS_SCREEN?$USER_MESSAGE_ARG={$USER_MESSAGE_ARG}"
    const val STATISTICS_ROUTE = STATISTICS_SCREEN
    const val state_ROUTE = state_SCREEN
    const val sta_ROUTE = sta_SCREEN
    const val TASK_DETAIL_ROUTE = "$TASK_DETAIL_SCREEN/{$TASK_ID_ARG}"
    const val ADD_EDIT_TASK_ROUTE = "$ADD_EDIT_TASK_SCREEN/{$TITLE_ARG}?$TASK_ID_ARG={$TASK_ID_ARG}"
}

/**
 * Models the navigation actions in the app.
 */
class TodoNavigationActions(private val navController: NavHostController) {

    fun navigateToTasks(userMessage: Int = 0) {
        val navigatesFromDrawer = userMessage == 0
        navController.navigate(
            TASKS_SCREEN.let {
                if (userMessage != 0) "$it?$USER_MESSAGE_ARG=$userMessage" else it
            }
        ) {
            popUpTo(navController.graph.findStartDestination().id) {
                inclusive = !navigatesFromDrawer
                saveState = navigatesFromDrawer
            }
            launchSingleTop = true
            restoreState = navigatesFromDrawer
        }
    }


    fun navigateToA(userMessage: Int = 1) {
        val navigatesFromDrawer = userMessage == 1
        navController.navigate(
            legueS_SCREEN.let {
                if (userMessage != 1) "$it?$USER_MESSAGE_ARG=$userMessage" else it
            }
        ) {
            popUpTo(navController.graph.findStartDestination().id) {
                inclusive = !navigatesFromDrawer
                saveState = navigatesFromDrawer
            }
            launchSingleTop = true
            restoreState = navigatesFromDrawer
        }
    }



    fun navigateToB(userMessage: Int = 2) {
        val navigatesFromDrawer = userMessage == 2
        navController.navigate(
            legueS_SCREEN.let {
                if (userMessage != 2) "$it?$USER_MESSAGE_ARG=$userMessage" else it
            }
        ) {
            popUpTo(navController.graph.findStartDestination().id) {
                inclusive = !navigatesFromDrawer
                saveState = navigatesFromDrawer
            }
            launchSingleTop = true
            restoreState = navigatesFromDrawer
        }
    }



    fun navigateToC(userMessage: Int = 3) {
        val navigatesFromDrawer = userMessage == 3
        navController.navigate(
            legueS_SCREEN.let {
                if (userMessage != 3) "$it?$USER_MESSAGE_ARG=$userMessage" else it
            }
        ) {
            popUpTo(navController.graph.findStartDestination().id) {
                inclusive = !navigatesFromDrawer
                saveState = navigatesFromDrawer
            }
            launchSingleTop = true
            restoreState = navigatesFromDrawer
        }
    }


    fun navigateToSta() {
        navController.navigate(TodoDestinations.state_ROUTE) {
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }
    }
    fun navigateTo1() {
        navController.navigate(TodoDestinations.TASKS_ROUTE) {
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }
    }


    fun navigateTo2() {
        navController.navigate(TodoDestinations.STATISTICS_ROUTE) {
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }
    }



    fun navigateToStatistics() {
        navController.navigate(TodoDestinations.STATISTICS_ROUTE) {
            // Pop up to the start destination of the graph to
            // avoid building up a large stack of destinations
            // on the back stack as users select items
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            // Avoid multiple copies of the same destination when
            // reselecting the same item
            launchSingleTop = true
            // Restore state when reselecting a previously selected item
            restoreState = true
        }
    }

    fun navigateToTaskDetail(taskId: String) {
        navController.navigate("$TASK_DETAIL_SCREEN/$taskId")
    }

    fun navigateToAddEditTask(title: Int, taskId: String?) {
        navController.navigate(
            "$ADD_EDIT_TASK_SCREEN/$title".let {
                if (taskId != null) "$it?$TASK_ID_ARG=$taskId" else it
            }
        )
    }
}
