package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Laboratoires {
    private String id;
    private String nom;
    private String adresse;
    private String ville;
    private String regionId;

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
    @Column(name = "nom", nullable = false, length = 150)
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "adresse", nullable = false, length = 255)
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "ville", nullable = false, length = 255)
    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Basic
    @Column(name = "region_id", nullable = false, length = 10)
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laboratoires that = (Laboratoires) o;
        return Objects.equals(id, that.id) && Objects.equals(nom, that.nom) && Objects.equals(adresse, that.adresse) && Objects.equals(ville, that.ville) && Objects.equals(regionId, that.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nom, adresse, ville, regionId);
    }
}
