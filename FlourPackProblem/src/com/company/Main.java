package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1,0,5));
    }

    public static boolean canPack(int bigCount, int smallCount,  int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        boolean result = false;
        int totalBigWeight = bigCount * 5;
        int totalSmallWeight = smallCount * 1;
        int remaining = goal % 5;
        if (totalBigWeight >= goal) {
            if (totalSmallWeight >= remaining) {
                result = true;
            }
        } else {
            if (totalSmallWeight >=  goal - totalBigWeight) {
                result = true;
            }
        }
        return result;
    }
}
