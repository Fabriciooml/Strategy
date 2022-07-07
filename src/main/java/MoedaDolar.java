public class MoedaDolar implements Moeda{
    @Override
    public float converter(float dinheiro) {
        return dinheiro * 0.19f;
    }
}
