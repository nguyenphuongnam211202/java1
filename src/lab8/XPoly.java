package lab8;

public final class XPoly {

    private XPoly() {}

    public static double sum(double... nums) {
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        return sum;
    }

    public static double min(double... nums) {
        double min = nums[0];
        for (double num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static double max(double... nums) {
        double max = nums[0];
        for (double num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static String toUpperFirstChar(String s) {
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            char firstChar = words[i].charAt(0);
            String upperFirstChar = String.valueOf(firstChar).toUpperCase();
            words[i] = upperFirstChar + words[i].substring(1);
        }
        return String.join(" ", words);
    }
}

