package com.ai.assistance.operit.ui.features.toolbox.screens.speechtotext

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.ai.assistance.operit.ui.components.CustomScaffold

/** Speech-to-text screen wrapper used to display SpeechToTextScreen in the router */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SpeechToTextToolScreen(navController: NavController) {
    CustomScaffold { paddingValues ->
        Box(modifier = Modifier.padding(paddingValues)) {
            SpeechToTextScreen(navController = navController)
        }
    }
} 
