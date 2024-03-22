public class FlashlightDemo {
    public static void main(String[] args) {
        Battery battery = new Battery();
        FlashLamp flashLamp = new FlashLamp();
        for (int i = 0; i < 101; i++) {
            flashLamp.turnOn();
            System.out.println("Flashlight is on.");
            battery.descreaseEnergy();
            System.out.println("Battery power remaining: " + battery.getEnergy());
            flashLamp.turnOff();
            System.out.println("Flashlight is off.");
        }
    }
}