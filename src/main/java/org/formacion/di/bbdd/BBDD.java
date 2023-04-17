package org.formacion.di.bbdd;

import java.util.HashMap;
import java.util.Map;

public class BBDD {

	// ----- esta es nuestra "base de datos" -----
	public final static Map<String, Map<String, Integer>> stocs = new HashMap<>();
	
    private BBDD() {};
    
	static {
		final Map<String, Integer> stocTiendaNorte = new HashMap<>();
		stocTiendaNorte.put("lampara",600);
		stocTiendaNorte.put("mesa",500);
		
		stocs.put("tienda norte", stocTiendaNorte);
	}

}
