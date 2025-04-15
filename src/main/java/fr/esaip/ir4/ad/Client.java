package fr.esaip.ir4.ad;
import jakarta.persistence.*;

import java.util.List;


@Entity
@Table(name="Client")
public class Client {

    @Id
    private int id;

    @Column(name="NOM")
    private String nom;

    @Column(name="PRENOM")
    private String prénom;

    @OneToMany(mappedBy = "idClient")
    private List<Emprunt> Emprunt;


    //getter setter
    public String getNom() { return nom; }
    public void setTitre(String titre) { this.nom = nom; }

    public String getPrénom() { return prénom; }
    public void setAuteur(String auteur) { this.prénom = prénom; }

    public List<Emprunt> getEmprunts() {return Emprunt;}
    public void setEmprunts(List<Emprunt> emprunts){this.Emprunt=emprunts;}


}
