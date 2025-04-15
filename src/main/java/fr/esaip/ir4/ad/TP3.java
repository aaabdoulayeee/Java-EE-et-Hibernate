package fr.esaip.ir4.ad;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TP3 {
        public static void main(String[] args) {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("default");
            EntityManager em = emf.createEntityManager();

            try {
                Emprunt emprunt = em.find(Emprunt.class, 1L); // ID = 1
                if (emprunt != null) {
                    System.out.println("Emprunt trouvé : ID = " + emprunt.getId());
                    for (Livre livre : emprunt.getLivres()) {
                        System.out.println("Livre : " + livre.getTitre());
                    }

                } else {
                    System.out.println("❌ Aucun Emprunt avec cet ID.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                Client client = em.find(Client.class, 1L); // ID = 1
                if (client != null) {
                    System.out.println("Client : "+ client.getPrénom()+" "+client.getNom());
                    for (Emprunt emprunt : client.getEmprunts()) {
                        System.out.println("Emprunt Client : " + emprunt.getId());
                    }

                } else {
                    System.out.println("❌ Aucun Client avec cet ID.");
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                em.close();
                emf.close();
            }


        }
}


