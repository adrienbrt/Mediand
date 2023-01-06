package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Role {
    private String id;
    private String libelle;
    private int num;

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
    @Column(name = "libelle", nullable = false, length = 50)
    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @Basic
    @Column(name = "num", nullable = false)
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return num == role.num && Objects.equals(id, role.id) && Objects.equals(libelle, role.libelle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, libelle, num);
    }
}
