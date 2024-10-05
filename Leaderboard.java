package com.example;



import java.util.*;

public class Leaderboard {
    private Map<String, Integer> userScores = new HashMap<>();

    public void addUserScore(String user, int score) {
        userScores.put(user, userScores.getOrDefault(user, 0) + score);
    }


    public void displayLeaderboard() {
        System.out.println("Leaderboard:");
        userScores.entrySet()
                  .stream()
                  .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                  .forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue() + " points"));
    }

    public Map<String, Integer> getUserScores() {
        return userScores;
    }

    public void setUserScores(Map<String, Integer> userScores) {
        this.userScores = userScores;
    }
}
