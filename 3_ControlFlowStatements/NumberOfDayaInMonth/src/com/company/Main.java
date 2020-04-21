package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(getDaysInMonth(1,2020));
    }

        public static boolean isLeapYear(int year) {
            if ((year >= 1 && year <= 9999 && year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
                return true;
            }
            return false;
        }


        public static int getDaysInMonth(int month, int year) {
            if ((month > 0 && month < 13) && (year > 0 && year < 10000)) {
                if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
                    return 31;
                } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                    return 30;
                } else if (month == 2 && isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            }
            return -1;
        }
    }
