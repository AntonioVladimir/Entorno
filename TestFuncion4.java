import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.*;


class TestFuncion4 {

	static int contpruebas = 0;
	static Funciones func = null;

	@BeforeAll
	static void prepararPruebas() {
		System.out.println("Empezamos las Pruebas.");
		func = new Funciones();
	}

	@BeforeEach
	private void contador() {
		contpruebas++;
		System.out.println("Vamos a realizar la prueba "+contpruebas);
	}

	@AfterEach
	private void vecespruebas() {
		System.out.println("Se a realizado "+ contpruebas +" Pruebas.");
	}

	@AfterAll
	static void terminarPruebas() {
		contpruebas = 0;
		func = null;
		System.out.println("Se han terminado de ejecutar todas las pruebas");
	}
	
	//	Tests realizados por Antonio Vladimir Ortega Chinchilla
	@Test
	@DisplayName("Test de Caja Negra Valores Vacios")
	void testConCadenaVacia() {
		
		String [] CadenaNombres = {"","","",""};
		assertEquals("---", func.Funcion4(CadenaNombres));

	}
	
	@Test
	@DisplayName("Prueba con nuestros nombres concatenados, separados con - ")
	void testConNuestrosNombres() {
		
		String [] CadenaNombres = {"Antonio","Rafael","Jose","Berny"};
		assertEquals("ntn-fl-s-rny", func.Funcion4(CadenaNombres));
	}
	
	@Test
	@DisplayName("Prueba con elemento nulo")
	void testElementosNulos(){
		assertNull(null,null);
		
	}

}
