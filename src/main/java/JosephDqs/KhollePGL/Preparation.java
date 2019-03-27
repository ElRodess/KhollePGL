package JosephDqs.KhollePGL;

import java.util.ArrayList;


public class Preparation implements Garniture{
	public ArrayList<Garniture> childGarniture ;
	private String Nom ;
	
	public Preparation(String Nom) {
		this.Nom = Nom;
		this.childGarniture = new ArrayList<Garniture>();
	}
	@Override
	public String toString() {
		String temp = "";
		for(int i = 0; i < this.childGarniture.size();i = i+1) {
			temp += this.childGarniture.get(i).toString() + "\n";
		}
		return temp;
	}

	@Override
	public void Affiche() {
		for (Garniture garniture : childGarniture) {
			garniture.Affiche();
		}	
	}
	
	public ArrayList<Garniture> getList()
	{
		return this.childGarniture ;
	}
	
	public boolean add(Garniture G) {	
		if(this != G)
		{
		this.childGarniture.add(G);
		return true;
		}
		else {
			System.out.print("erreur Ajout d'un objet dans lui même \n");
			return false;
		}
	}
	
	public void remove(Garniture G) {
		this.childGarniture.remove(G);
	}

	@Override
	public float getCout() {
		float sum = 0;
		for(int i = 0; i < this.childGarniture.size();i = i+1) {
			sum += this.childGarniture.get(i).getCout();
		}
		return sum;
	}

	public String getNom() {
		return Nom;
	}

	public void setNom(String nom) {
		Nom = nom;
	}
	
	/*private boolean FileEstDescendant(Garniture G){
        pere = this.pere;
        File tmpFile = file;
        while(pere != null){
            if (pere == file){
                return true;
            }
            tmpFile = tmpFile.pere;
            pere = tmpFile.pere;
        }
        return false;
    }*/
}




	

