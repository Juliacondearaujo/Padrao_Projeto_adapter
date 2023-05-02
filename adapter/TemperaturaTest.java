package padroesestruturais_exercicios.adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperaturaTest {

    @Test
    void deveRetornarTemperaturaFarenheit() {
        Temperatura temperatura = new Temperatura();
        temperatura.setConversao(32);

        assertEquals(32, temperatura.getConversao());
    }

    @Test
    void deveRetornarTemperaturaCelsius() {
        Temperatura temperatura = new Temperatura();
        temperatura.setConversao(32);

        assertEquals(0, temperatura.getCelsius());
    }
}
