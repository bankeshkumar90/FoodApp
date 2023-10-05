package com.amplebloom.foodordering

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.amplebloom.foodordering.ui.screens.HomeScreen
import com.amplebloom.foodordering.ui.theme.Food_OrderingTheme
import com.amplebloom.foodordering.ui.viewmodel.RecipeViewModel

class MainActivity : ComponentActivity() {
    private val recipeViewModel:RecipeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Food_OrderingTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   HomeScreen(recipeViewModel = recipeViewModel)
                }
            }
        }
    }
}
