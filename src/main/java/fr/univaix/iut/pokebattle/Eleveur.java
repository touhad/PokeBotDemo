package fr.univaix.iut.pokebattle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
        @NamedQuery(name = Eleveur.FIND_ALL, query = "SELECT e FROM Eleveur e"),
        @NamedQuery(name = Eleveur.FIND_BY_NOM, query = "SELECT e FROM Eleveur e WHERE e.Nom = :fnom")})
public class Eleveur {

    public static final String FIND_BY_NOM = "findEleveurByNom";
    public static final String FIND_ALL = "findAllEleveur";

    // Pts sont l'experience aquise par le dresseur.
    @Id
    private int Num;
    
    private String Nom;
    private int Pts;

    // Constructeur Eleveur
    public Eleveur(String nom) {
        Nom = nom;
    }
    
    public Eleveur () {};
    
    public Eleveur(String nom, int num, int pts) {
        Nom = nom;
        Num = num;
        Pts = pts;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public int getPts() {
        return Pts;
    }

    public void setPts(int pts) {
        Pts = pts;
    }

    @Override
    public String toString() {
        return "Eleveur [Nom=" + Nom + ", Num=" + Num + ", Pts=" + Pts + "]";
    }

}
