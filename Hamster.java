public class Hamster {
    private String name;
    private float diggingSpeed;
    private boolean isWorking;
    
    public Hamster(String name, float diggingSpeed) {
        this.name = name;
        this.diggingSpeed = diggingSpeed;
    }
    
    public void startDigging() {
        isWorking = true;
    }
    
    public void stopDigging() {
        isWorking = false;
    }
    
    public float getDiggingSpeed() { return diggingSpeed; }
    public boolean isWorking() { return isWorking; }
    public String getName() { return name; }
}
