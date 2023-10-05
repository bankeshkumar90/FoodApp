package com.amplebloom.foodordering.ui.viewmodel

import com.amplebloom.foodordering.data.model.Meal

sealed class RecipeViewState {
    object Loading: RecipeViewState()
    data class Success(val recipes: List<Meal>): RecipeViewState()
    data class Error(val message: String): RecipeViewState()
}
