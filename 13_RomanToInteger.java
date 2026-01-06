//Roman to Integer
// Roman number are read left to right 
// If  currennt value >= next value we add it to the result
// else we subtract it from the result

class Solution{
    public int romantoInt(String s){
        int n = s.length();
        int sum = 0; 
        for(int i =  0; i < n ; i ++){
            int value = getvalue(s.charAt(i));
            if(i < n-1 && value <  getvalue(s.charAt(i + 1))){
                sum = sum - value;
            }else{
                sum = sum + value;
            }
        }
        return sum;
    }
    
    int getvalue(char c){
        switch (c) {
            case 'I' : return 1;
            case 'v' : return 5;
            case 'X' : return 10;
            case 'L' : return 50;
            case 'C' : return 100;
            case 'D' : return 500;
            case 'M' : return 1000;
        }
        return 0;
    }

}