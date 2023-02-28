package Assign6;

import java.util.Scanner;

public class Prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans=0,pw=1;
        while(num2>0){
            ans+=(num2%2)*pw;
            num2/=10;
            pw*=2;
        }
        System.out.println(ans+num1);
    }
}
