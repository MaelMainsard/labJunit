package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculatrice {

	@Test
	void testSomme() {
		Calculatrice c = new Calculatrice();
		assertEquals(c.somme(5, 5),10);
	}
	
	@Test
	void testProduit() {
		Calculatrice c = new Calculatrice();
		assertEquals(c.produit(1, 5),5);
	}

}
