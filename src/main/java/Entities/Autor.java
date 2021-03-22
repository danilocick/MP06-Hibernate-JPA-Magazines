package Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table( name = "autors" )
public class Autor implements Serializable {
    @Id
    @Column(name = "id_autor")
    private  int id_autor;
    @Column(name = "nom")
    private  String nom;
    @Column(name = "nacionalitat")
    private  String nacionalitat;
    @Column(name = "any_naixement")
    private  String any_naixement;
    @Column(name = "actiu")
    private  boolean actiu;


    public Autor( int id_autor,  String nom, String nacionalitat , String any_naixement,
                  boolean actiu) {
        super();
        this.any_naixement = any_naixement;
        this.nom = nom;
        this.nacionalitat = nacionalitat;
        this.actiu = actiu;
        this.id_autor = id_autor;
    }
    public Autor(){

    }
    public int getId_autor() {
        return id_autor;
    }
    public void setId_autor(int id_autor) {
        this.id_autor = id_autor;
    }
    public String getAny_naixement() {
        return any_naixement;
    }
    public void setAny_naixement(String any_naixement) {
        this.any_naixement = any_naixement;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getNacionalitat() {
        return nacionalitat;
    }
    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }
    public boolean isActiu() {
        return actiu;
    }
    public void setActiu(boolean actiu) {
        this.actiu = actiu;
    }
    @Override
    public String toString() {
        return "Entities.Autor [id_autor=" + id_autor + ", nom=" + nom+ ", any_naixement=" + any_naixement
                + ", nacionalitat=" + nacionalitat + ", actiu=" + actiu
                + "]";
    }


}