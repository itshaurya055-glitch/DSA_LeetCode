// Roman numerals are taking the largest possible value first, then moving forward (Greedy algorithm).
// We predefine all valid Roman values, include subtractive ones.
// store value and symbol in descending order 
// for each value:
//      while num > = value
//      append symbol
//      subtract value from num
// return the final string

class Solution {
    public String IntToRoman(int num){
        int[] value = { 1000 , 900 , 500 , 400 , 100 , 90 , 50 , 40 , 10 , 9 , 5 , 4 , 3, 2 , 1};
        String[] symbol = { "M" , "CM" , "D" , "CD" , "C" , "XC" , "IX" , "V" , "IV" , "I"};
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < value.length ; i++){
            while(num >= value[i]){
                result.append(symbol[i]);
                num -= value[i];
            }
        }
        return result.toString();
    }
}
