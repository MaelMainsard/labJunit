package labJunit.app;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCompteBancaire {

	@Test
	void testDebit1() {
		CompteBancaire cb = new CompteBancaire(1000);
		assertEquals(cb.debiterSolde(900),100);
	}
	
	@Test
	void testDebit2(){
		CompteBancaire cb = new CompteBancaire(1000);
		assertThrows(Error.class, () -> {
            cb.debiterSolde(-900);
            fail("L'appel à debiterSolde n'a pas levé d'erreur");
        });
		
	}
	
	@Test
	void testCredit1() {
		CompteBancaire cb = new CompteBancaire(1000);
		assertEquals(cb.crediterSolde(200),1200);
		
	}
	
	@Test
	void testCredit2() {
		CompteBancaire cb = new CompteBancaire(1000);
		assertThrows(Error.class, () -> {
            cb.crediterSolde(-200);
            fail("L'appel à debiterSolde n'a pas levé d'erreur");
        });
	}

}
