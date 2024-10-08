package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test0014 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
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
		cuenta12345.retirar(200);
		cuenta67890.retirar(350);
		cuenta12345.ingresar(100);
		cuenta67890.retirar(200);
		cuenta67890.retirar(150);
		cuenta12345.retirar(200);
		cuenta67890.ingrear(50);
		cuenta67890.retirar(100);
		
		System.out.println("Cuenta 12345: " +cuenta12345.getSaldo());
		System.out.println("Cuenta 67890: " +cuenta67890.getSaldo());
		
		assertEquals(-250d, cuenta12345.getSaldo());
		assertEquals(-450d, cuenta67890.getSaldo());
	}

}
