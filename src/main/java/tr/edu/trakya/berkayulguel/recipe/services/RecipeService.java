package tr.edu.trakya.berkayulguel.recipe.services;

import tr.edu.trakya.berkayulguel.recipe.models.Recipe;

import java.util.Set;

public interface RecipeService {
    Set<Recipe> getRecipes();
}
