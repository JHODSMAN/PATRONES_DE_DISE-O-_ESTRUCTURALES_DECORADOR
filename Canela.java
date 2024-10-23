public class Canela extends DecoradorBebida {
    public Canela(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Canela";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 0.75;
    }
}
