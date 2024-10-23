public class Leche extends DecoradorBebida {
    public Leche(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Leche";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 1.50;
    }
}
