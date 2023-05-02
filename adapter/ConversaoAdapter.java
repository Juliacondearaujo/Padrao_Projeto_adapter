package padroesestruturais_exercicios.adapter;

public class ConversaoAdapter extends ConversaoCelsius{

    private IConversao conversaoFahrenheit;

    public ConversaoAdapter (IConversao conversaoFahrenheit){
        this.conversaoFahrenheit = conversaoFahrenheit;}

    public float recuperarConversao() {
        float resultado = ((this.getCelsius() * 9 / 5) + 32);
        conversaoFahrenheit.setConversao(resultado);
        return conversaoFahrenheit.getConversao();
    }

    public void salvarConversao() {
        float resultado2 = (float) ((conversaoFahrenheit.getConversao()-32)/1.8);
        this.setCelsius(resultado2);
    }


}
