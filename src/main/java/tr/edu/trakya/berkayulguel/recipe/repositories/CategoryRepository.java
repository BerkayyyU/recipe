package tr.edu.trakya.berkayulguel.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.berkayulguel.recipe.models.Category;

import java.util.Optional;

public interface CategoryRepository extends CrudRepository<Category,Long> {
    Optional<Category> findByDescription(String description); //JpaQuery methods
}
