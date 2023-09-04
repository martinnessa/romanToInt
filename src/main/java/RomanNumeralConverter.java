import java.util.HashMap;
import java.util.Map;

public class RomanNumeralConverter {
    public String IntToNumeral (int num){
        int [] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String [] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "Xl", "X", "IX", "V", "IV", "I"};

        StringBuilder roman = new StringBuilder();

        for(int i=0; i < values.length; i++){
            while (num >= values[i]){
                num = num - values[i];
                roman.append(romanNumerals[i]);
            }
        }
        return roman.toString();
    }

    public int romanToInt(String romanString){
        HashMap<Character, Integer> numbersMap = new HashMap<>();
        numbersMap.put('I',1);
        numbersMap.put('V',5);
        numbersMap.put('X',10);
        numbersMap.put('L',50);
        numbersMap.put('C',100);
        numbersMap.put('D',500);
        numbersMap.put('M',1000);

        int result = 0;

        for(int i=0; i < romanString.length(); i++){
            char ch = romanString.charAt(i);

            if (i > 0 && numbersMap.get(ch) > numbersMap.get(romanString.charAt(i-1))){
                result += numbersMap.get(ch) - 2*numbersMap.get(romanString.charAt(i-1));
            }else result += numbersMap.get(ch);
        }
        return result;
    }
}
