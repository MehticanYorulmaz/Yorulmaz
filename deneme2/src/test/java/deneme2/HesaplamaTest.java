package deneme2;

import  org.junit.*;

import org.junit.Test;

public class HesaplamaTest {

	@Test
	public void testTopla() {
			String sayi1 ="100";
			String sayi2 ="42";
			String sonuc = Hesaplama.topla(sayi1, sayi2);
			
			Assert.assertEquals("142",sonuc);
		
	}
	  
	@Test
	public void testyanlis() {
			String sayi1 ="100x";
			String sayi2 ="42";
			String sonuc = Hesaplama.topla(sayi1, sayi2);
			
			Assert.assertEquals("142",sonuc);
		
	}
	
	
}
