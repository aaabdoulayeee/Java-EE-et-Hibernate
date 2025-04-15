package fr.esaip.ir4.ad;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
        EntityManager em = emf.createEntityManager();

        try {
            Livre livre = em.find(Livre.class, 1L); // ID = 1
            if (livre != null) {
                System.out.println("Livre trouvé : ID = " + livre.getId());
                System.out.println("Livre trouvé : Titre = " + livre.getTitre());
                System.out.println("Livre trouvé : Auteur = " + livre.getAuteur());

            } else {
                System.out.println("Aucun livre avec cet ID.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
    }
