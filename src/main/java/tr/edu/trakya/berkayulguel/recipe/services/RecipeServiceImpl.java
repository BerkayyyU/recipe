package tr.edu.trakya.berkayulguel.recipe.services;

import org.springframework.stereotype.Service;
import tr.edu.trakya.berkayulguel.recipe.models.Recipe;
import tr.edu.trakya.berkayulguel.recipe.repositories.RecipeRepository;

import java.util.HashSet;
import java.util.Set;

@Service
public class RecipeServiceImpl implements RecipeService{

    private final RecipeRepository recipeRepository;

    public RecipeServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public Set<Recipe> getRecipes() {
        Set<Recipe> recipeSet = new HashSet<>();
        recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
        return recipeSet;
    }
}
