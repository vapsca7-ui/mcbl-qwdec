public class Statistics {
    private int totalClicks = 0;
    private long playTime = 0;
    private int sessions = 0;
    
    public void addClick() {
        totalClicks++;
    }
    
    public void addPlayTime(long time) {
        playTime += time;
    }
    
    public void newSession() {
        sessions++;
    }
    
    // Геттеры
    public int getTotalClicks() { return totalClicks; }
    public long getPlayTime() { return playTime; }
    public int getSessions() { return sessions; }
}
