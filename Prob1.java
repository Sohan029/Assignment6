package Assign6;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        int pw =1;
        int ans=0;
        while(num>0){
            ans += (num%2)*pw;
            num/=2;
            pw*=10;
        }
        System.out.println(ans);
    }
}
