package dao;

import jakarta.persistence.*;
import models.EstoqueRoupa;
import java.util.List;

public class EstoqueRoupaDAO {

    private EntityManagerFactory emf;

    public EstoqueRoupaDAO() {
        this.emf = Persistence.createEntityManagerFactory("taskhubPU");
    }

    public void salvar(EstoqueRoupa roupa) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.persist(roupa);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public List<EstoqueRoupa> listarTodos() {
        EntityManager em = emf.createEntityManager();
        try {
            return em.createQuery("FROM EstoqueRoupa", EstoqueRoupa.class).getResultList();
        } finally {
            em.close();
        }
    }

    public EstoqueRoupa buscarPorId(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            return em.find(EstoqueRoupa.class, id);
        } finally {
            em.close();
        }
    }

    public void atualizar(EstoqueRoupa roupa) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            em.merge(roupa);
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }

    public void remover(int id) {
        EntityManager em = emf.createEntityManager();
        try {
            EstoqueRoupa roupa = em.find(EstoqueRoupa.class, id);
            if (roupa != null) {
                em.getTransaction().begin();
                em.remove(roupa);
                em.getTransaction().commit();
            }
        } finally {
            em.close();
        }
    }
}