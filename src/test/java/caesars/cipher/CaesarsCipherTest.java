package caesars.cipher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CaesarsCipherTest {
	
	CaesarsCipher caesarsChipher = new CaesarsCipher();

	@Test
	void testCaesarCipheredMessageWithOffsetOf12() {
		assertEquals("tai mdq kag pauzs fapmk", caesarsChipher.cipher("how are you doing today", 12));
		
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", caesarsChipher.cipher("", 12));
		
	}
	
	@Test
	void testCaesarCipheredMessageWithIncorrectOffset() {
		assertNotEquals("tai mdq kag pauzs fapmk", caesarsChipher.cipher("how are you doing today", 11));
		
	}

}
