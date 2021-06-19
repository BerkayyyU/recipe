package tr.edu.trakya.berkayulguel.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.berkayulguel.recipe.models.Category;

public interface CategoryRepository extends CrudRepository<Category,Long> {
}
