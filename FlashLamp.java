public class FlashLamp {
    private boolean status;
    private Battery battery;
    public FlashLamp(){
        status=false;
    }
    public void setBattery(Battery battery){
        this.battery=battery;
    }
    public int getBatteryInfo(){
        return battery.getEnergy();
    }
    public void light(){
        if (status=true&&battery!=null&&battery.getEnergy()>0){
            battery.descreaseEnergy();
        }
    }
    public void turnOn(){
        if(battery!=null&&battery.getEnergy()>0){
            status=true;
        }
    }
    public void turnOff(){
        status=false;
    }

}
