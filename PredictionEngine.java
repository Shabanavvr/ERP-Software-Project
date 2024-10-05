package com.example;



import java.util.Random;

public class PredictionEngine {
    public int predictFutureOrders() {
        Random random = new Random();
        int prediction = random.nextInt(100); // Simulated prediction
        System.out.println("Predicted future orders: " + prediction);
        return prediction;
    }
}
