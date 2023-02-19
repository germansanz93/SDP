public class Main {
    public static void main(String[] args) {
        BugattiVeyron bugattiVeyron = new BugattiVeyron();
        MovableAdapter adapter = new MovableAdapterImpl(bugattiVeyron);
        System.out.printf("Max speed for bugatti veyron is: %.2f MPH  |  %.2f KMPH", bugattiVeyron.getSpeed(), adapter.getSpeed());
    }
}