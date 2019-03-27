package JosephDqs.KhollePGL;

import java.util.ArrayList;

public class Pizza {
	private final String Nom;
	private final String Sauce; 
	private final ArrayList<Garniture> Top; // (Garniture)
	
	public static class Builder {
			//required parameters
				private final String Nom;
				private final String Sauce; 
						
			//Optional parameters
				private ArrayList<Garniture> Top = new ArrayList<Garniture>();
				
				public Builder(String Nom, String Sauce) {
					this.Nom = Nom;
					this.Sauce = Sauce;				
				}
				public Builder addTop(Garniture G){
					this.Top.add(G);
					return this;
				}
				
				public Pizza build() {
					return new Pizza(this);
				}
	}
	
	private Pizza(Builder builder)
	{
		//required parameters
		this.Nom = builder.Nom;
		this.Sauce = builder.Sauce;
		this.Top = new ArrayList<Garniture>(builder.Top);
	}

	public String getNom() {
		return Nom;
	}

	public String getSauce() {
		return Sauce;
	}
	
	public float getCout() {
		float sum = 0;
		for(Garniture garniture : Top ){
			sum += garniture.getCout();
		}
		return sum;
	}
	
	public ArrayList<Garniture> getList(){
		return Top;
	}
}
