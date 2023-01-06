package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Medicaments {
    private String id;
    private String nom;
    private String forme;
    private String description;
    private String ingredientId;

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false, length = 10)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "nom", nullable = false, length = 200)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "forme", nullable = true, length = 100)
    public String getForme() {
        return forme;
    }

    public void setForme(String forme) {
        this.forme = forme;
    }

    @Basic
    @Column(name = "description", nullable = true, length = 100)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "ingredient_id", nullable = true, length = 10)
    public String getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(String ingredientId) {
        this.ingredientId = ingredientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medicaments that = (Medicaments) o;
        return Objects.equals(id, that.id) && Objects.equals(nom, that.nom) && Objects.equals(forme, that.forme) && Objects.equals(description, that.description) && Objects.equals(ingredientId, that.ingredientId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, forme, description, ingredientId);
    }
}
