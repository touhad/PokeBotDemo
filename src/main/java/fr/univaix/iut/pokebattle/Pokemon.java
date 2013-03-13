package fr.univaix.iut.pokebattle;

public class Pokemon {
	
	private String Nom, Type, Caractere, Couleur;
	// Pour pikachu son evolution sera Raichu et sa prevolution Pichu.
	private int Num, Experience, Niveau, evolution, prevolution ;
	private float Taille, Poid;
	
	
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
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
	public int getEvolution() {
		return evolution;
	}
	public void setEvolution(int evolution) {
		this.evolution = evolution;
	}
	public int getPrevolution() {
		return prevolution;
	}
	public void setPrevolution(int prevolution) {
		this.prevolution = prevolution;
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
	
}
