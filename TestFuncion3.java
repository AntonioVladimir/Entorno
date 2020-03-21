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

		 int contpruebas = 0;
		 Funciones func = null;

		@BeforeAll
		void prepararPruebas() {
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
		 void terminarPruebas() {
			contpruebas = 0;
			func = null;
			System.out.println("Se han terminado de ejecutar todas las pruebas");
		}

		@Test//Aqui comienza las pruebas de Jose Manuel
		@DisplayName("Test de Caja Negra Comprobación divisible x y rango de y")
		void testTrue() {


			assertEquals(0,func.Funcion3(350));//Tiene que salir un numero que es el resultado

		}

		@Test
		@DisplayName("Test de Caja Negra Comprobación divisible x y rango de y")
		void testTrue2() {


			//Tiene que salir un numero que es el resultado
			assertEquals(0,func.Funcion3(7));


		}
		@Test
		@DisplayName("Test de Caja Negra Comprobación divisible x y rango de y")
		void testFalse() {

			////Tiene que salir 0 ya que no es difisible
			assertEquals(0,func.Funcion3(1));

		}

	}


