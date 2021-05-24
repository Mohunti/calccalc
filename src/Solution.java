import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String vvod = scanner.nextLine();
        scanner.close();
        Pattern p = Pattern.compile("[-+*/]");
        Matcher m = p.matcher(vvod);
        m.find();
        String oper = vvod.substring(m.start(), m.end());
        int index1 = vvod.indexOf(oper);
        String one = vvod.substring(0, index1);
        String two = vvod.substring(index1 + 1);

        if (vvod.contains("I") || vvod.contains("V") || vvod.contains("X")) {
            int a = RomanAndArab.convertRomanToArab(one.trim());
            int b = RomanAndArab.convertRomanToArab(two.trim());
            try {
                if (a == 0 || b == 0 ) {
                    throw new Exception("Калькулятор принимает данные одного формата");
                }
            } catch (Exception ex) {
                ex.printStackTrace();
                System.exit(0);
            }

            int res = Brain.keepScore(a, b, oper);
            RomanAndArab.convertArabToRoman(res);
        } else {
            int a = Integer.parseInt(one.trim());
            int b = Integer.parseInt(two.trim());
            System.out.println(Brain.keepScore(a, b, oper));
        }
    }
}