package JosephDqs.KhollePGL;


public class Ingredient implements Garniture{
	private String Nom;
	private float Cout;

	public Ingredient(){
		this.Nom = "default";
		this.Cout = 0;
	}
	
	public Ingredient(String Nom){
		this.Nom = Nom;
		this.Cout = 0;
	}
	
	public Ingredient(String Nom,float Cout){
		this.Nom = Nom;
		this.Cout = Cout;
	}
	
	public Ingredient(float Cout){
		this.Nom = "default";
		this.Cout = Cout;
	}
	
	public String getNom() {
		return Nom;
	}
	public void setNom(String nom) {
		Nom = nom;
	}
	@Override
	public float getCout() {
		return Cout;
	}
	public void setCout(float cout) {
		Cout = cout;
	}
	
	@Override
	public String toString() {
		String tmp = this.Nom +"  "+this.Cout;
		return tmp;
	}
	@Override
	public void Affiche() {
		String tmp = this.toString();
		System.out.print(tmp + "\n");
	}
}
