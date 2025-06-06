package testes;

import jakarta.persistence.*;
import models.EstoqueRoupa;
import models.Usuario;

public class TesteCriaTabela {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("taskhubPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

//        Usuario u = new Usuario();
//        u.setNome("Teste2");
//        u.setEmail("teste2@email.com");
//        u.setSenha("1234567");

        EstoqueRoupa er = new EstoqueRoupa();
        er.setNomePeca("Camisa Polo");
        er.setQuantidade(10);
        er.setPrecoUnitario(25.99);
        er.setCategoria("Camisa");
        er.setCor("Preto");
        er.setTamanho("P");

        em.persist(er);

        em.getTransaction().commit();
        em.close();
        emf.close();

        System.out.println("Item salvo com sucesso!");
    }
}
