package com.example;

import java.util.ArrayList;
// import java.util.Date;
// import java.util.GregorianCalendar;
import java.util.List;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author marian.benner
 */
@ManagedBean()
@ApplicationScoped
public class Shop {

  // private List<Artikel> sortiment = new ArrayList<Artikel>();
  private List<Benutzer> benutzer = new ArrayList<Benutzer>();
  private static Shop instance = new Shop();
  private final static EntityManagerFactory emf = Persistence.createEntityManagerFactory("onlineshop");

  public Shop() {

    // sortiment.add(new Artikel(1000, "Pantoffeln \"Rudolph\"",
    //         "Wunderschöne Filzpantoffeln", "filzschuhe.jpg", (new GregorianCalendar(2012, 11, 23).getTime())));
    // sortiment.add(new Artikel(2000, "Handtasche \"Cosmopolita\"",
    //         "Modische Filz-Handtasche mit praktischer Cocktailglas-Halterung",
    //         "handtasche.jpg", (new GregorianCalendar(2010, 10, 3).getTime())));
    // sortiment.add(new Artikel(3000, "Filz-Hasen \"Moe & Joe\"",
    //         "Zwei putzige Hasen aus Filz zur Dekoration", "hasen.png", (new GregorianCalendar(2013, 11, 31).getTime())));
    benutzer.add(new Benutzer("koch", "123"));
    benutzer.add(new Benutzer("zander", "123"));
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

  public List<Artikel> getSortiment() {
    EntityManager em = emf.createEntityManager();
    Query q = em.createQuery("select a from Artikel a");
    List<Artikel> artikel = q.getResultList();
    System.out.print(artikel);
    return artikel;
    // return sortiment;
  }

  public List<Benutzer> getBenutzer() {
    return benutzer;
  }

  public static Shop getInstance(){
      return instance;
  }
}
