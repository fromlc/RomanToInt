import java.util.HashMap;

public class RomanToInt {
    private HashMap<String, Integer> map;

    public static void main(String[] args) throws Exception {
        RomanToInt r2i = new RomanToInt();

        System.out.println("\nRoman Numeral String to Integer");
        System.out.println();
        System.out.println("I: " + r2i.romanToInt("I"));
        System.out.println("V: " + r2i.romanToInt("V"));
        System.out.println("IV: " + r2i.romanToInt("IV"));
        System.out.println("IX: " + r2i.romanToInt("IX"));
        System.out.println("XL: " + r2i.romanToInt("XL"));
        System.out.println("XC: " + r2i.romanToInt("XC"));
        System.out.println("CMXL: " + r2i.romanToInt("CMXL"));
        System.out.println("CMXLIII: " + r2i.romanToInt("CMXLIII"));
        System.out.println("MCMDIV: " + r2i.romanToInt("MCMDIV"));
    }

    public RomanToInt() {
        map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        map.put("IV", 4);
        map.put("IX", 9);
        map.put("XL", 40);
        map.put("XC", 90);
        map.put("CD", 400);
        map.put("CM", 900);
    }

    public int romanToInt(String roman) {
        int i = 0;
        int romanInt = 0;
        int len = roman.length();

        Object value;
        while (i < len) {
            if (len - i >= 2) {
                value = map.get(roman.substring(i, i + 2));

                if (value != null) {
                    romanInt += (int) value;
                    i += 2;
                    continue;
                }
            }

            value = map.get(roman.substring(i, i + 1));
            if (value != null) {
                romanInt += (int) value;
                i += 1;
            }
        }
        return romanInt;
    }
}
