
public class Runner {
        public static void main(String[] args) {
            System.out.println(icyHot( 30, 60));
            System.out.println(helloName("Matthew"));
            int[] x = {1, 2, 4, 6, 9};
            System.out.println(swapEnds(x));
            System.out.println(squirrelPlay( 100, true));
            System.out.println(countXX("xxbruh23"));
            System.out.println(roundSum( 31, 64, 22));
            System.out.println(prefixAgain( "abacadababa", 3));
            System.out.println(maxBlock( "ssunddeeeo"));
        }
    //(1)Warmup
    public static boolean icyHot ( int temp1, int temp2){
        if ((temp1 > 100 && temp2 < 0) || (temp2 > 100 && temp1 < 0)) {
            return true;
        } else {
            return false;
        }
    }

            //(2)String

    public static String helloName(String name) {
        String greeting = "Hello ";
        String ending = "!";
        return greeting + name + ending;
    }

    //(3)Array
    public static int[] swapEnds(int[] nums) {
        int firstValue = nums[0];
        int lastValue = nums[nums.length - 1];
        nums[0] = lastValue;
        nums[nums.length - 1] = firstValue;
        return nums;
    }

    //(4)Logic
    public static boolean squirrelPlay(int temp, boolean isSummer) {
        if (isSummer) {
            if (temp <= 100 && temp >= 60) {
                return true;
            } else {
                return false;
            }
        } else {
            if (temp <= 90 && temp >= 60) {
                return true;
            } else {
                return false;
            }
        }
    }

    //(5)Warmup-2
    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.substring(i, i + 2).equals("xx")) {
                count++;
            }
        }
        return count;
    }

    //(6)Logic-2
    public static int roundSum(int a, int b, int c) {
        int a1 = round(a);
        int b1 = round(b);
        int c1 = round(c);
        return a1 + b1 + c1;
    }

    private static int round(int num) {
        if (num - 5 >= (Math.round(num / 10) * 10)) {
            return (Math.round((num / 10) + 1) * 10);
        }
        return (Math.round(num / 10) * 10);
    }

    //(7)String-2
    public static boolean prefixAgain(String str, int n) {
        boolean prefix = false;
        String firstLetters = str.substring(0, n);
        for (int i = n; i <= str.length() - n; i++) {
            if (str.substring(i, i + n).equals(firstLetters)) {
                prefix = true;
            }
        }
        return prefix;
    }

    //(8)String-3
    public static int maxBlock(String str) {
        int count = 0;
        int altCount = 1;
        if (str.length() == 0) {
            return 0;
        }
        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                altCount++;
            } else {
                altCount = 1;
            }
            if (altCount >= count) {
                count = altCount;
            }
        }
        return count;
    }
}