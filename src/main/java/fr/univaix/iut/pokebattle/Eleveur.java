package fr.univaix.iut.pokebattle;

@Entity
@NamedQueries({
    @NamedQuery(name = Eleveur.FIND_ALL, query = "SELECT e FROM Eleveur e"),
    @NamedQuery(name = Eleveur.FIND_BY_NOM, query = "SELECT e FROM Eleveur e WHERE e.nom = :fnom")
})

public class Eleveur {

	public static final String FIND_BY_NOM = "findEleveurByNom";
    public static final String FIND_ALL = "findAllEleveur";
	
	// Les points sont l'experience aquise par le dresseur.
	private String Nom;	
	private int Num, Pts;

	// Constructeur Eleveur
	public Eleveur (String nom) {
		Nom = nom;
	} 
	
	public Eleveur (String nom, int num, int pts) {
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
