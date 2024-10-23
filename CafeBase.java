public class CafeBase implements Bebida {
    @Override
    public String getDescripcion() {
        return "Café simple";
    }

    @Override
    public double getCosto() {
        return 5.00;
    }
}
