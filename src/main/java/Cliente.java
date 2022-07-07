
public class Cliente {

    private float dinheiro;


    public double getDinheiro() {
        double dinheiro = Math.round(this.dinheiro * 100.0) / 100.0;
        return dinheiro;
    }

    public void converterDolar(float dinheiro) {
        CasaDeCambio casaDeCambio = new CasaDeCambio(dinheiro);
        this.dinheiro = casaDeCambio.converter(new MoedaDolar());
    }

    public void converterEuro(float dinheiro) {
        CasaDeCambio casaDeCambio = new CasaDeCambio(dinheiro);
        this.dinheiro = casaDeCambio.converter(new MoedaEuro());
    }

    public void converterLibraEsterlina(float dinheiro) {
        CasaDeCambio casaDeCambio = new CasaDeCambio(dinheiro);
        this.dinheiro = casaDeCambio.converter(new MoedaLibraEsterlina());
    }

    public void converterZloty(float dinheiro) {
        CasaDeCambio casaDeCambio = new CasaDeCambio(dinheiro);
        this.dinheiro = casaDeCambio.converter(new MoedaZloty());
    }
}
