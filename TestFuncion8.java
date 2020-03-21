import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TestFuncion8 {


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
			@Test
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

}

