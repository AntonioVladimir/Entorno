import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFuncion3 {

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

	@Test//Aqui comienza las pruebas de Jose Manuel
	@DisplayName("Test de Caja Negra Comprobación la salida no es nula")
	void testNoNulo() {

		//Estamo comprobando que la salida del metodo no se nula
		assertNotNull(func.Funcion3(1));

	}
	
	@Test
	@DisplayName("Test de Caja Negra Comprobación la salida se correcta")
	void testEsCero() {

		//Estamo comprobando que la salida salga 0, ya que no es divisible entre 7
		assertEquals(0,func.Funcion3(4));

	}

	//Pruebas realizadas por Rafael Oliva Ramirez
	@Test
	@DisplayName("Test de Caja Negra Comprobación no es 0")
	void testNotSame() {

		//Estamo comprobando que la salida no se 0, ya que es divisible entre 7
		assertNotSame(0,func.Funcion3(21));

	}
		
	//Test realizado por Antonio Vladimir Ortega Chinchilla 
	@Test
	@DisplayName("Test de Caja Negra Erroneo")
	void testValorSuperior() {
		
		assertEquals(0,func.Funcion3(5));

	}

	//Pruebas realizadas por Berny Jimenez Sanchez 
		@Test
		@DisplayName("Test de Caja Negra Comprobación no es 0")
		void testSame() {

			//Estamo comprobando que la salida es 0, ya que es divisible entre 7
			assertSame(0,func.Funcion3(20));

		}

}
