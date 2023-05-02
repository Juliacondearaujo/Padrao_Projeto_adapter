package padroesestruturais_exercicios.adapter;

public class ConversaoFahrenheit implements IConversao{

    private float fahrenheit;

    @Override
    public float getConversao() {
        return this.fahrenheit;
    }

    @Override
    public void setConversao(float fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

}
