package tr.edu.trakya.berkayulguel.recipe.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;


}
