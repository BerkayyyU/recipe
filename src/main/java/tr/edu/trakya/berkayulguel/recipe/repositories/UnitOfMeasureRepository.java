package tr.edu.trakya.berkayulguel.recipe.repositories;

import org.springframework.data.repository.CrudRepository;
import tr.edu.trakya.berkayulguel.recipe.models.UnitOfMeasure;

//Veriye erişimde kullanılacak olan arayüz gibi
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure,Long> {
}
