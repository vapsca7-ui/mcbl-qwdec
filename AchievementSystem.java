public class AchievementSystem {
    private Set<String> unlockedAchievements = new HashSet<>();
    
    public void unlockAchievement(String achievementId) {
        if (!unlockedAchievements.contains(achievementId)) {
            unlockedAchievements.add(achievementId);
            // Логика награды
        }
    }
    
    public boolean hasAchievement(String achievementId) {
        return unlockedAchievements.contains(achievementId);
    }
}
