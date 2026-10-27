import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraNotasTest {

    @Test
    void mediaDeTresNotas() {
        double resultado = CalculadoraNota.calcularMedia(6, 8, 10);
        assertEquals(8.0, resultado, 0.0001);
    }

    @Test
    void notaFinalCorrecta() {
        double resultado = CalculadoraNota.calcularNotaFinal(7, 9);
        assertEquals(7.8, resultado, 0.0001);
    }

    @Test
    void notaFinalSinPracticas() {
        double resultado = CalculadoraNota.calcularNotaFinal(10, 0);
        assertEquals(6.0, resultado, 0.0001);
    }

    @Test
    void notaFinalSinExamen() {
        double resultado = CalculadoraNota.calcularNotaFinal(0, 10);
        assertEquals(4.0, resultado, 0.0001);
    }

    @Test
    void pruebaANotasIguales() {
        double resultado = CalculadoraNota.calcularMedia(5, 5, 5);
        assertEquals(5.0, resultado, 0.0001);
    }

    @Test
    void pruebaBTodasNotasCero() {
        double resultado = CalculadoraNota.calcularMedia(0, 0, 0);
        assertEquals(0.0, resultado, 0.0001);
    }

    // Reto opcional: Examen 10 y Prácticas 10 -> (10 * 0.6) + (10 * 0.4) = 6.0 + 4.0 = 10.0
    @Test
    void retoNotaFinalMaxima() {
        double resultado = CalculadoraNota.calcularNotaFinal(10, 10);
        assertEquals(10.0, resultado, 0.0001);
    }
}
