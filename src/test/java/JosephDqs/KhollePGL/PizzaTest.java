package JosephDqs.KhollePGL;

import static org.junit.Assert.*;


import org.junit.Test;

import JosephDqs.KhollePGL.Ingredient;

public class PizzaTest {

	@Test
	public void a() {
		Ingredient I = new Ingredient("Mozza",4);
		Pizza P = new Pizza
				.Builder("Margarita","Sauce Tomate")
				.addTop(I)
				.build();
		assertNotNull(P); 
	}

	@Test
	public void b() {
		Ingredient I = new Ingredient("Mozza",4);
		Preparation Prep = new Preparation("Reine");
		Ingredient M = new Ingredient("Mozza",4);
		Ingredient C = new Ingredient("Champignons",5);
		Prep.add(M);Prep.add(C);		
		Pizza P = new Pizza
				.Builder("Margarita","Sauce Tomate")
				.addTop(I)
				.addTop(Prep)
				.build();
		assertEquals(P.getCout(),13,0.01); 
	}
}
