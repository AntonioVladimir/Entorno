import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFuncion8 {


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

			@Test//Pruebas realizadas por Jose Manuel
			@DisplayName("Test de Caja Negra Comprobación de Rango.")
			void testFalse() {//suma los tiempos

				//
				String[] alumnos = { "Antonio", "Gabri", "Jorge", "Azahara" };
				int[][] tiemposDeTrabajo = {{5,6,7,8},{1,2,3,4}} ;


				//Nos saldra False ya que la suma es mayor a 500
				assertFalse(func.Funcion8(alumnos, tiemposDeTrabajo));
			}

			@Test
			@DisplayName("Test de Caja Negra Comprobación suma tiempo")
			void testTrue() {//suma los tiempo 

				//Nos saldra true ya que la suma es mayor a 500
				String[] alumnos = { "Antonio", "Gabri", "Jorge", "Azahara" };
				int[][] tiemposDeTrabajo = {{500,650,720,800},{100,200,350,490}};

				assertTrue(func.Funcion8(alumnos, tiemposDeTrabajo));	
		}

	//Pruebas realizadas por Rafael Oliva Ramirez
		@Test
		@DisplayName("Test de Caja Negra Comprobación salida no nula")
		void testNotNull() {

			String [] alumnos = {"Rafael","Jose","Vladi","Berny"};
	        int[][] tiemposDeTrabajos = {{1,2,3,4} , {54,65,89,78}};

			assertNotNull(func.Funcion8(alumnos, tiemposDeTrabajos));	
		}

}


