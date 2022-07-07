public class MoedaLibraEsterlina implements Moeda{
    @Override
    public float converter(float dinheiro) {
        return dinheiro * 0.15f;
    }
}