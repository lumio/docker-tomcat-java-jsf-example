package com.example;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class ArtikelDAO {
  private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("onlineshop");

  public List<Artikel> findAll() {
    EntityManager em = emf.createEntityManager();
    Query q = em.createQuery("select a from Artikel a");
    List<Artikel> artikel = q.getResultList();
    em.close();
    return artikel;
  }

  public void saveArtikel(Artikel neuerArtikel) {
    EntityManager em = emf.createEntityManager();
    EntityTransaction t = em.getTransaction();
    t.begin();
    em.merge(neuerArtikel);
    t.commit();
    em.close();
  }

  public void saveRatingForArticle(Bewertung bewertung, Artikel artikel) {
    artikel.getBewertungen().add(bewertung);
    EntityManager em = emf.createEntityManager();
    EntityTransaction t = em.getTransaction();
    t.begin();
    em.persist(bewertung);;
    em.merge(artikel);
    t.commit();
  }

  public void removeRatingForArticle(Bewertung rating, Artikel artikel) {
    EntityManager em = emf.createEntityManager();
    EntityTransaction t = em.getTransaction();
    t.begin();
    artikel = em.merge(artikel);
    rating = em.merge(rating);
    t.commit();

    artikel.getBewertungen().remove(rating);

    t.begin();
    em.merge(artikel);
    em.remove(rating);
    t.commit();

    em.close();
  }
}
