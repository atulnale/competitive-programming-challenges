package org.aryannale.challenge1.problem2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t >0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long m = sc.nextLong();
            long ans = 0;
            m++;
            long aMod = m % a;
            if(aMod >0) ans++;
            ans += m/a;
            long bMod = m % b;
            if(bMod > 0) ans++;
            ans += m/b;
            System.out.println(ans);
            t--;
        }
    }
}
