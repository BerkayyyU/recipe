package tr.edu.trakya.berkayulguel.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.berkayulguel.recipe.models.UnitOfMeasure;

import java.util.Optional;

//Veriye erişimde kullanılacak olan arayüz gibi
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
