package fr.univaix.iut.pokebattle;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
        @NamedQuery(name = Juge.FIND_ALL, query = "SELECT j FROM Juge j"),
        @NamedQuery(name = Juge.FIND_BY_NOM, query = "SELECT j FROM Juge j WHERE j.Nom = :fnom")})



public class Juge {
	
    public static final String FIND_BY_NOM = "findJugeByNom";
    public static final String FIND_ALL = "findAllJuge";
    
	@Id
	private int Num;
	
    private String Nom;
    
 

	public int getNum() {
		return Num;
	}


	public void setNum(int num) {
		Num = num;
	}


	void TraiteAttaque(Pokemon pokemonA, Pokemon pokemonD) {
        /* TO-DO
         *
		 * -On se connecte à la base et on récupére les deux pokemons.
		 * -On récupére l'attaque utilisé du poka (et la vie actuel de pokb).
		 * -On retire la vie de pokb selon l'attaque de poka.
		 * -Modifie la base pour changer la nouvelle valeur de vie de pokb
		 * - Voir modifier aussi les pp de poka ?
		 */
    }


    public String getNom() {
        return Nom;
    }

    public void setNom(String nom) {
        Nom = nom;
    }
    
    @Override
	public String toString() {
		return "Juge [Num=" + Num + ", Nom=" + Nom + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Nom == null) ? 0 : Nom.hashCode());
		result = prime * result + Num;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Juge other = (Juge) obj;
		if (Nom == null) {
			if (other.Nom != null)
				return false;
		} else if (!Nom.equals(other.Nom))
			return false;
		if (Num != other.Num)
			return false;
		return true;
	}

}