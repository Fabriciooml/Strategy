public class CasaDeCambio {
    private float dinheiro;

    public CasaDeCambio(float dinheiro) {
        this.dinheiro = dinheiro;
    }

    public float converter(Moeda moeda) {
        return moeda.converter(dinheiro);
    }
}
