public class Chocolate extends DecoradorBebida {
    public Chocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Chocolate";
    }

    @Override
    public double getCosto() {
        return bebida.getCosto() + 2.00;
    }
}
