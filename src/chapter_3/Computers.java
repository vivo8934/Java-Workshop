package chapter_3;

public class Computers {

    private int cpuSpeed;

    Computers(){
        cpuSpeed = 0;
    }

    public void setCpuSpeed(int cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public int getCpuSpeed() {
        return cpuSpeed;
    }

    public static void main(String[] args) {
        Tablet myTab = new Tablet();
        myTab.setCpuSpeed(34);
        myTab.setScreenSize(63.2);
        System.out.println(myTab.getCpuSpeed());
        System.out.println(myTab.getScreenSize());
    }
}

class Tablet extends Computers{
    private double screenSize;

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public double getScreenSize() {
        return screenSize;
    }
}
