package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getBucketCount(2,2,4,1));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        } else {
            // calculate number of buckets
            double area = width * height;
             return (int) Math.ceil(area/areaPerBucket - extraBuckets);
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if((area <= 0)|| (areaPerBucket <= 0)){
            return -1;
        }
        else {
            return (int) Math.ceil(area / areaPerBucket);
        }
    }

}
