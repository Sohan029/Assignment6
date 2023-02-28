package Assign6;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bin = sc.nextInt();
        int ans =0,pw=1;
        while(bin>0){
            ans+=(bin%2)*pw;
            bin/=10;
            pw*=2;
        }
        System.out.println(ans);
    }
}
