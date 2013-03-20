package fr.univaix.iut.pokebattle;

public class Pokemon {
	
	// Pour pikachu son evolution sera Raichu et sa prevolution Pichu.
	private String Nom, Type, Caractere, Couleur, maitre, evolution, prevolution, cri;	

	private int Num, Experience, Niveau;
	private float Taille, Poid;
	
	// Constructeur Pokemon
	Pokemon (String nom) {
		Nom = nom;
	} 
	
	// Fonction qui renvoie vrai si le pokemon n'a pas de maître.
	boolean IsSauvage (Pokemon pokemon) {
		
		if (pokemon.getMaitre() == null)
			return true;
		return false;		
	}//IsSauvage
	

	// Getteurs & Setteurs	
	public String getCri() {
		return cri;
	}

	public void setCri(String cri) {
		this.cri = cri;
	}
	public String getMaitre() {
		return maitre;
	}

	public void setMaitre(String maitre) {
		this.maitre = maitre;
	}

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
	public String getEvolution() {
		return evolution;
	}
	public void setEvolution(String evolution) {
		this.evolution = evolution;
	}
	public String getPrevolution() {
		return prevolution;
	}
	public void setPrevolution(String prevolution) {
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
