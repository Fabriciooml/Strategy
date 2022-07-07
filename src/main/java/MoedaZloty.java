public class MoedaZloty implements Moeda {
    @Override
    public float converter(float dinheiro) {
        return dinheiro * 0.86f;
    }
}