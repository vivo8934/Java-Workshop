package chapter_3;

class Computer{
    double cpuSpeed;
    Computer(){
        cpuSpeed = 0;
    }

    public void setCpuSpeed(double cpuSpeed) {
        this.cpuSpeed = cpuSpeed;
    }

    public double getCpuSpeed() {
        return cpuSpeed;
    }
}



public class Example_1 {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setCpuSpeed(3.5);
        System.out.println(computer.getCpuSpeed());
    }
}
