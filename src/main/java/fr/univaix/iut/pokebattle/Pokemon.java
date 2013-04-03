package fr.univaix.iut.pokebattle;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;



@Entity
@NamedQueries({
        @NamedQuery(name = Pokemon.FIND_ALL, query = "SELECT p FROM Pokemon p"),
        @NamedQuery(name = Pokemon.FIND_BY_TYPE, query = "SELECT p FROM Pokemon p WHERE p.type1 = :ftype"),
        @NamedQuery(name = Eleveur.FIND_BY_NOM, query = "SELECT p FROM Pokemon p WHERE p.Nom = :fnom")
})
public class Pokemon {

    public static final String FIND_BY_TYPE = "findPokemonByType";
    public static final String FIND_ALL = "findAllPokemon";
    public static final String FIND_BY_NOM = "findPokemonByNom";

    // Pour pikachu son evolution sera Raichu et sa prevolution Pichu.
    @Id
    private String Nom;

    @Enumerated(EnumType.STRING)
    private String Type1;

    @Enumerated(EnumType.STRING)
    private String Type2;

    private String Caractere;
    private String Couleur;
    private String Eleveur;
    private String Evolution;
    private String Prevolution;
    private String Cri;

    private int Num;
    private int Experience;
    private int Niveau;
    private int VieMax;
    private int VieActuel;
    private int Attaque;


    private float Taille;
    private float Poid;
    
    


    public Pokemon(String nom, String type1, String type2, String caractere, String couleur, String eleveur, String evolution,
                   String prevolution, String cri, int num, int experience, int niveau, int vieMax, int vieActuel, int attaque,
                   float taille, float poid) {


        Nom = nom;
        Type1 = type1;
        Type2 = type2;
        Caractere = caractere;
        Couleur = couleur;
        Eleveur = eleveur;
        Evolution = evolution;
        Prevolution = prevolution;
        Cri = cri;
        Num = num;
        Experience = experience;
        Niveau = niveau;
        VieMax = vieMax;
        VieActuel = vieActuel;
        Attaque = attaque;
        Taille = taille;
        Poid = poid;
    }

    public Pokemon() {
       
    }
    public Pokemon(String name) 
    {
        
    }

    // Fonction qui renvoie vrai si le pokemon n'a pas de maître.
    public boolean IsSauvage(Pokemon pokemon) {

        if (pokemon.getEleveur() == null)
            return true;
        return false;
    }//IsSauvage


    // Getteurs & Setteurs
    public int getAttaque() {
        return Attaque;
    }

    public void setAttaque(int attaque) {
        Attaque = attaque;
    }


    public String getCri() {
        return Cri;
    }

    public void setCri(String cri) {
        this.Cri = cri;
    }

    public String getEleveur() {
        return Eleveur;
    }

    public void setEleveur(String Eleveur) {
        this.Eleveur = Eleveur;
    }

    public int getVieMax() {
        return VieMax;
    }

    public void setVieMax(int vieMax) {
        VieMax = vieMax;
    }

    public int getVieActuel() {
        return VieActuel;
    }

    public void setVieActuel(int vieActuel) {
        VieActuel = vieActuel;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }

    public String getType() {
        return Type1;
    }

    public void setType(String type) {
        Type1 = type;
    }

    public String getCaractere() {
        return Caractere;
    }

    public void setCaractere(String caractere) {
        Caractere = caractere;
    }

    public String getCouleur() {
        return Couleur;
    }

    public void setCouleur(String couleur) {
        Couleur = couleur;
    }

    public int getNum() {
        return Num;
    }

    public void setNum(int num) {
        Num = num;
    }

    public int getExperience() {
        return Experience;
    }

    public void setExperience(int experience) {
        Experience = experience;
    }

    public int getNiveau() {
        return Niveau;
    }

    public void setNiveau(int niveau) {
        Niveau = niveau;
    }

    public String getEvolution() {
        return Evolution;
    }

    public void setEvolution(String evolution) {
        this.Evolution = evolution;
    }

    public String getPrevolution() {
        return Prevolution;
    }

    public void setPrevolution(String prevolution) {
        this.Prevolution = prevolution;
    }

    public float getTaille() {
        return Taille;
    }

    public void setTaille(float taille) {
        Taille = taille;
    }

    public float getPoid() {
        return Poid;
    }

    public void setPoid(float poid) {
        Poid = poid;
    }

    @Override
    public String toString() {
        return "Pokemon [Nom=" + Nom + ", Type1=" + Type1 + ", Type2=" + Type2
                + ", Caractere=" + Caractere + ", Couleur=" + Couleur
                + ", Eleveur=" + Eleveur + ", Evolution=" + Evolution
                + ", Prevolution=" + Prevolution + ", Cri=" + Cri + ", Num="
                + Num + ", Experience=" + Experience + ", Niveau=" + Niveau
                + ", VieMax=" + VieMax + ", VieActuel=" + VieActuel
                + ", Attaque=" + Attaque + ", Taille=" + Taille + ", Poid="
                + Poid + "]";
    }

}
