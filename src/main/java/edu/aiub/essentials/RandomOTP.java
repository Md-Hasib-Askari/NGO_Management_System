package edu.aiub.essentials;

import java.util.Random;

public class RandomOTP {
    public static int generateOTP(int m) {
        int min = (int) Math.pow(10, m-1);
        int max = (int) Math.pow(10, m) - 1;

        Random random = new Random();
        int randNum = random.nextInt(max - min + 1) + min;
        return randNum;
    }
}
