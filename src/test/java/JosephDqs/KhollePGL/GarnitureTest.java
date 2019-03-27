package JosephDqs.KhollePGL;

import static org.junit.Assert.*;

import org.junit.Test;

public class GarnitureTest {

	@Test
	public void a() {
		Ingredient I = new Ingredient("Mozza",4);
		assertNotNull(I);
	}
	/*@Test
	public void aNom() {
		Ingredient I = new Ingredient("Mozza",4);
		assertEquals(I.getNom(),"Mozza");
	}
	
	@Test
	public void aCout() {
		Ingredient I = new Ingredient("Mozza",4);
		assertEquals(4,I.getCout(),0.01);	// le dernier parametre est la precision.	
	}
*/
	@Test
	public void b() {
		Preparation P = new Preparation("Reine");
		Ingredient M = new Ingredient("Mozza",4);
		Ingredient C = new Ingredient("Champignons",5);
		P.add(M);P.add(C);
		assertNotNull(P);
	}
	
	@Test
	public void c() {
		Preparation P = new Preparation("Reine");
		Ingredient M = new Ingredient("Mozza",4);
		Ingredient C = new Ingredient("Champignons",5);
		P.add(M);P.add(C);
		assertEquals(9,P.getCout(),0.01);
	}
	
	@Test
	public void d() {
		Preparation P = new Preparation("Reine");
		Ingredient M = new Ingredient("Mozza",4);
		Ingredient C = new Ingredient("Champignons",5);
		P.add(M);P.add(C);		
		assertFalse(P.add(P));
	}
	
	/*@Test
	public void e() {
		
	}
	On utilise cette méthode avec les files : 
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
    }
    J'ai pas réussis à implementer un parametre pere à tous
    */
	

}
