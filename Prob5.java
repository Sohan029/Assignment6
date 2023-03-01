package Assign6;

import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        int pre = sc.nextInt();
        int sam = (int) num;
        int ans=0,pw=1;
        while(sam>0){
            ans += (sam%2)*pw;
            sam/=2;
            pw*=10;
        }

        System.out.print(ans);
        System.out.print('.');
        num=num-(int)num;
        double ans1;
        while(pre>0 && num!=0){
            ans1=num*2;
            System.out.print((int) ans1);
            num=ans1 -(int)ans1;
            pre--;
        }
    }
}
