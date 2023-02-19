public class MovableAdapterImpl implements MovableAdapter{
    private Movable luxuryCars;

    public MovableAdapterImpl(Movable luxuryCars) {
        this.luxuryCars = luxuryCars;
    }

    @Override
    public Double getSpeed() {
        return convertMPHtoKMPH(luxuryCars.getSpeed());
    }

    private Double convertMPHtoKMPH(Double mph) {
        return mph * 1.60934;
    }
}
