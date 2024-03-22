package org.aryannale.challenge1.problem1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t >0) {
            int intro = sc.nextInt();
            int ext = sc.nextInt();
            int uni = sc.nextInt();

            int ans = intro;

            int extAdditional = ext % 3;
            if( extAdditional != 0){
                int rem =  3 - extAdditional;
                if(uni < rem) {
                    System.out.println(-1);
                    t--;
                    continue;
                }
                uni -= rem;
                ans++;


            }
            if(uni %3 != 0){
                ans++;
            }
            ans += uni /3;
            ans += ext /3 ;

            System.out.println(ans);
            t--;
        }
    }
}
