public class MoedaEuro implements Moeda{
    @Override
    public float converter(float dinheiro) {
        return dinheiro * 0.18f;
    }
}
