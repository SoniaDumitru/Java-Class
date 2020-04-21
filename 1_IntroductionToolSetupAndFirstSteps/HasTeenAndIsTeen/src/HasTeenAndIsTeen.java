public class HasTeenAndIsTeen {

    public static boolean hasTeen(int num1, int num2, int num3) {
        if (num1 <= 19 && num1 >= 13) {
            return true;
        } if (num2 <= 19 && num2 >= 13) {
            return true;
        } if (num3 <= 19 && num3 >= 13) {
            return true;
        }
        return false;
    }

    public static boolean isTeen(int num) {
        if (num <= 19 && num >= 13) {
            return true;
        } else {
            return false;
        }
    }
}
