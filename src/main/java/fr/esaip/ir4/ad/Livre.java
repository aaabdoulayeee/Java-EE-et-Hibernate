package fr.esaip.ir4.ad;

import jakarta.persistence.*;


@Entity
@Table(name="livre")
public class Livre {

    @Id
    private int id;
    private String titre;
    private String auteur;

    // Getters & Setters
    public int getId() {
        return id;
    }

    public int setId(int id) {
        this.id = id;
        return id;
    }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getAuteur() { return auteur; }
    public void setAuteur(String auteur) { this.auteur = auteur; }

}