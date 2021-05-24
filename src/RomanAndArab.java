import java.util.ArrayList;

public class RomanAndArab {
    public static int convertRomanToArab(String Roman) {

        return switch (Roman) {
            case "I" -> 1;
            case "II" -> 2;
            case "III" -> 3;
            case "IV" -> 4;
            case "V" -> 5;
            case "VI" -> 6;
            case "VII" -> 7;
            case "VIII" -> 8;
            case "IX" -> 9;
            case "X" -> 10;
            default -> 0;
        };
    }
        static void convertArabToRoman ( int res){
            ArrayList<String> Roman = new ArrayList<>();
            Roman.add("I");
            Roman.add("II");
            Roman.add("III");
            Roman.add("IV");
            Roman.add("V");
            Roman.add("VI");
            Roman.add("VII");
            Roman.add("VIII");
            Roman.add("IX");
            Roman.add("X");
            Roman.add("XI");
            Roman.add("XII");
            Roman.add("XIII");
            Roman.add("XIV");
            Roman.add("XV");
            Roman.add("XVI");
            Roman.add("XVII");
            Roman.add("XVIII");
            Roman.add("XIX");
            Roman.add("XX");
            Roman.add("XXI");
            Roman.add("XXII");
            Roman.add("XXIII");
            Roman.add("XXIV");
            Roman.add("XXV");
            Roman.add("XXVI");
            Roman.add("XXVII");
            Roman.add("XXVIII");
            Roman.add("XXIX");
            Roman.add("XXX");
            Roman.add("XXXI");
            Roman.add("XXXII");
            Roman.add("XXXIII");
            Roman.add("XXXIV");
            Roman.add("XXXV");
            Roman.add("XXXVI");
            Roman.add("XXXVII");
            Roman.add("XXXVIII");
            Roman.add("XXXIX");
            Roman.add("XL");
            Roman.add("XLI");
            Roman.add("XLII");
            Roman.add("XLIII");
            Roman.add("XLIV");
            Roman.add("XLV");
            Roman.add("XLVI");
            Roman.add("XLVII");
            Roman.add("XLVIII");
            Roman.add("XLIX");
            Roman.add("L");
            Roman.add("LI");
            Roman.add("LII");
            Roman.add("LIII");
            Roman.add("LIV");
            Roman.add("LV");
            Roman.add("LVI");
            Roman.add("LVII");
            Roman.add("LVIII");
            Roman.add("LIX");
            Roman.add("LX");
            Roman.add("LXI   ");
            Roman.add("LXII");
            Roman.add("LXIII");
            Roman.add("LXIV");
            Roman.add("LXV");
            Roman.add("LXVI");
            Roman.add("LXVII");
            Roman.add("LXVIII");
            Roman.add("LXIX");
            Roman.add("LXX");
            Roman.add("LXXI");
            Roman.add("LXXII");
            Roman.add("LXXIII");
            Roman.add("LXXIV");
            Roman.add("LXXV");
            Roman.add("LXXVI");
            Roman.add("LXXVII");
            Roman.add("LXXVIII");
            Roman.add("LXXIX");
            Roman.add("LXXX");
            Roman.add("LXXXI");
            Roman.add("LXXXII");
            Roman.add("LXXXIII");
            Roman.add("LXXXIV");
            Roman.add("LXXXV");
            Roman.add("LXXXVI");
            Roman.add("LXXXVII");
            Roman.add("LXXXVIII");
            Roman.add("LXXXIX");
            Roman.add("XC");
            Roman.add("XCI");
            Roman.add("XCII");
            Roman.add("XCIII");
            Roman.add("XCIV");
            Roman.add("XCV");
            Roman.add("XCVI");
            Roman.add("XCVII");
            Roman.add("XCVIII");
            Roman.add("XCIX");
            Roman.add("C");
            System.out.println(Roman.get(res - 1));
        }
    }
