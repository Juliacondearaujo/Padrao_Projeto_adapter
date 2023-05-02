package padroesestruturais_exercicios.adapter;

import padroesestruturais.adapter.AvaliacaoAdapter;
import padroesestruturais.adapter.AvaliacaoConceito;
import padroesestruturais.adapter.IAvaliacao;

public class Temperatura {

    IConversao conversao;
    ConversaoAdapter persistencia;

    public Temperatura() {
        conversao = new ConversaoFahrenheit();
        persistencia = new ConversaoAdapter(conversao);
    }

    public void setConversao(float fahrenheit) {
        conversao.setConversao(fahrenheit);
        persistencia.salvarConversao();
    }

    public float getConversao() {
        return persistencia.recuperarConversao();
    }

    // Método apenas para mostrar que está convertendo conceito para nota através do adaptador
    public float getCelsius() {
        return persistencia.getCelsius();
    }

}
