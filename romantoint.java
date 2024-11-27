import java.util.Scanner;
class Solution {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    System.out.println(romanToInt(s));
}

    public static int romanToInt(String s) {
       int a=0;
        int x=0;
                
        for(int i=s.length()-1;i>=0;i--)
        {
            int add=0;
            char c=s.charAt(i);
            if(c=='I')
            {
                add=1;
            }
            else if(c=='V')
            {
                add=5;
            }
            else if(c=='X')
            {
                add=10;
            }
            else if(c=='L')
            {
                add=50;
            }
            else if(c=='C')
            {
                add=100;
            }
            else if(c=='D')
            {
                add=500;
            }
            else if(c=='M')
            {
                add=1000;
            }
            if(add<a)
            {
                x-=add;
            }
            else
            {
                x+=add;
            }
            a=add;
        }
        return x;
    }


}
