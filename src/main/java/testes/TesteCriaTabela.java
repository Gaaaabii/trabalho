package testes;

import jakarta.persistence.*;
import models.Usuario;

public class TesteCriaTabela {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("taskhubPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

        Usuario u = new Usuario();
        u.setNome("Teste2");
        u.setEmail("teste2@email.com");
        u.setSenha("1234567");

        em.persist(u);

        em.getTransaction().commit();
        em.close();
        emf.close();

        System.out.println("Usuário salvo com sucesso!");
    }
}
