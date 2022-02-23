package com.senai.debug.debugStore;

import java.math.BigDecimal;

import com.senai.debug.debugStore.modelo.Categoria;
import com.senai.debug.debugStore.modelo.Produto;
import org.junit.Before;
import org.junit.Test;

public class EfetuarComparTest {
	
	@Before
	public void configurarCompra(){
		Categoria categoria = new Categoria("PERFUMARIA");
		Produto produto = new Produto("212 Blue", new BigDecimal("30.00"), categoria);
		
	}
	
	@Test
	public void comprarPerfume(){
		
	}

}
