package fr.univaix.iut.pokebattle;

public class Pokemon {
	
	// Pour pikachu son evolution sera Raichu et sa prevolution Pichu.
	private String Nom, Type, Caractere, Couleur, Eleveur, Evolution, Prevolution, Cri;	

	private int Num, Experience, Niveau, VieMax, VieActuel;
	private float Taille, Poid;
	
	// Constructeur Pokemon
	public Pokemon (String nom) {
		Nom = nom;
	} 
	
	// Fonction qui renvoie vrai si le pokemon n'a pas de maître.
	public boolean IsSauvage (Pokemon pokemon) {
		
		if (pokemon.getEleveur() == null)
			return true;
		return false;		
	}//IsSauvage
	

	// Getteurs & Setteurs	
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
	
}
