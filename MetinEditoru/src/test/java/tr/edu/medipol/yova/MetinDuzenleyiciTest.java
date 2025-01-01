package tr.edu.medipol.yova;


import org.junit.Test;


import static org.junit.Assert.*; //assert sınıfının içindeki tüm static metotları import et anlamına gelio.
//yani normalde biz sadece sınıfı import ediyorduk şimdi sınıfın metotlarını import ediyoruz.


public class MetinDuzenleyiciTest {
    
		
	@Test
	public void bosluklariTemizlemeli() {
		
	// GIVEN - ON KOSULLAR
	
	String orijinal= "   Y   A Z I L I M ";
		
	// WHEN - BU AKSİYON GERCEKLESTİGİNDE
		
	String sonuc =MetinDuzenleyici.bosluklariTemizle(orijinal);
		
	// THEN - BUNLAR OLMALI
		assertEquals("Hata beklenmedik sonuc","YAZILIM", sonuc);
		}
	
	
	//hocanın dersteki örneği 
	@Test
	public void boslukVarsaOnlariTemizlemeli() {
		
	// GIVEN - ON KOSULLAR
	
	String orijinal= "   Y   A Z I L I M ";
		
	// WHEN - BU AKSİYON GERCEKLESTİGİNDE
		
	String sonuc =MetinDuzenleyici.bosluklariTemizle(orijinal);
		
	// THEN - BUNLAR OLMALI
		assertEquals("Hata beklenmedik sonuc","YAZILIM", sonuc);
		
	}
	
	//hocanın dersteki örneği 
	@Test
	public void boslukYoksaAyniSonucuVermeli() {
		
	// GIVEN - ON KOSULLAR
	
	String orijinal= "DENEME";
		
	// WHEN - BU AKSİYON GERCEKLESTİGİNDE
		
	String sonuc =MetinDuzenleyici.bosluklariTemizle(orijinal);
		
	// THEN - BUNLAR OLMALI
		assertEquals("Hata beklenmedik sonuc",orijinal, sonuc);
		
	}
	
	//hocanın dersteki örneği 
	@Test
	public void bosMetinVarsaBosSonucDonmeli() {
		
	// GIVEN - ON KOSULLAR
	
	String orijinal= "                ";
		
	// WHEN - BU AKSİYON GERCEKLESTİGİNDE
		
	String sonuc =MetinDuzenleyici.bosluklariTemizle(orijinal);
		
	// THEN - BUNLAR OLMALI
		assertEquals("Hata beklenmedik sonuc","", sonuc);
		
	}
	
	//amacım beni ters köşeye düşürecek koşulları kontrol etmek.
		
	//hocanın dersteki örneği 
	
	@Test
	public void kisaltVeBuyukHarfeCevir_test1() {
	
        String orijinal="YAZILIM ORTAM VE ARACLARI" ;
		
		String sonuc=MetinDuzenleyici.kisaltveBuyukHarfeCevir(orijinal);
		
		assertEquals("YAZILIM OR. ARACLARI", sonuc);
		
	}
	
   
	
	
	
	
	   
	
 }
	
	
	


	
