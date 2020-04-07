public class EqualSumChecker {

//    Write a method hasEqualSum with 3 parameters of type int.
//    The method should return boolean and it needs to return true if sum of first and second parameter is equal to third parameter. Otherwise return false.

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if (num1 + num2 == num3) {
            return true;
        } else {
            return false;
        }
    }

}