class VolcanoRobot {
    String status;
    int speed;
    float temperature;
    static int VolcanoRobotCount = 0;
    VolcanoRobot(String status, int speed, float temperature){
        this.status=status;
        this.speed=speed;
        this.temperature=temperature;
        VolcanoRobotCount++;
    }

    VolcanoRobot(){
        VolcanoRobotCount++;
    }
    void checkTemperature() {
        if (temperature > 660) {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);
    }
    public static void main(String args[]){
        VolcanoRobot one = new VolcanoRobot("Exploring", 15, 700 );
        VolcanoRobot two =  new VolcanoRobot();
        System.out.println("There are " + VolcanoRobot.VolcanoRobotCount + " VolcanoRobot Objects.");

    }
}
