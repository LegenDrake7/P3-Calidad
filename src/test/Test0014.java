package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class Test0014 {

	static Cuenta cuenta12345;
	static Cuenta cuenta67890;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		cuenta12345 = new Cuenta(50d, "12345","Cuenta 12345");
		cuenta67890 = new Cuenta(0d, "67890", "Cuenta 67890");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test0014() {
		cuenta12345.Retirar(200);
		cuenta67890.Retirar(350);
		cuenta12345.Ingresar(100);
		cuenta67890.Retirar(200);
		cuenta67890.Retirar(150);
		cuenta12345.Retirar(200);
		cuenta67890.Ingresar(50);
		cuenta67890.Retirar(100);
		
		System.out.println("Cuenta 12345: " +cuenta12345.getSaldo());
		System.out.println("Cuenta 67890: " +cuenta67890.getSaldo());
		
		assertEquals(-250d, cuenta12345.getSaldo());
		assertEquals(-450d, cuenta67890.getSaldo());
	}

}
