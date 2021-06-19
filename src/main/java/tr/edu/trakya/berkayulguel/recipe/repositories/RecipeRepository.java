package tr.edu.trakya.berkayulguel.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.berkayulguel.recipe.models.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe,Long> {
}
