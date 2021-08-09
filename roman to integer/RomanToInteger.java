class RomanToInteger {
    public int romanToInt(String s) {
        int sum = 0;
        char [] charr = s.toCharArray();
        for(int i = 0; i< s.length();i++){
            switch(charr[i]){
                case 'I':
                    
                    if(i != s.length()-1 && (charr[i+1]=='V' || charr[i+1]=='X')) sum-=1;
                    else sum+=1;
                    break;
                case 'V':
                    sum+=5;
                    break;
                case 'X':
                    if(i!= s.length()-1 && (charr[i+1]=='L' || charr[i+1]=='C')) sum -=10;
                    else sum+=10;
                    break;
                case 'L':
                    sum+=50;
                    break;
                case 'C':
                    if(i!= s.length()-1 && (charr[i+1]=='D' || charr[i+1]=='M')) sum -=100;
                    else sum+=100;
                    break;
                case 'D':
                    sum+=500;
                    break;
                case 'M':
                    sum+=1000;
                    break;
            }
        }
        return sum;
    }
}