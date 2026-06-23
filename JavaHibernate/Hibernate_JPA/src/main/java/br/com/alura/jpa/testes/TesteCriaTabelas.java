package br.com.alura.jpa.testes;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class TesteCriaTabelas {

   public static  void main(String [] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("conta");

        EntityManager createEntityManager = emf.createEntityManager();
        emf.close();

    }

}
