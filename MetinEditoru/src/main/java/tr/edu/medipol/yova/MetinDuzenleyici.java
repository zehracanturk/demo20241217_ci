package tr.edu.medipol.yova;

import org.apache.commons.lang3.StringUtils;

public final class MetinDuzenleyici {

	public static String bosluklariTemizle(String orjinal) {
		
		return StringUtils.deleteWhitespace(orjinal); 
	}
	
	public static String kisaltveBuyukHarfeCevir(String orijinal) {
		return StringUtils.abbreviateMiddle(orijinal,"." ,20).toUpperCase();
	}
	
	
	
	
	
}
