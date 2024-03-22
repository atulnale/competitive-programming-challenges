package org.aryannale.challenge1.problem3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t >0) {
            int n = sc.nextInt();
            int zeros = 0;
            int ones = 0;
            sc.nextLine();
            String str = sc.nextLine();
            for(char ch : str.toCharArray()){
                if(ch == '0'){
                    zeros++;
                } else {
                    ones++;
                }
            }
            int half = (n+ 1) /2;
            int pos = 0;
            int happy = ones;
            if(happy >= half){
                pos = 0;
            }
            for (int i = 0; i < n; i++) {
                if(str.charAt(i) == '0'){
                    happy++;
                } else {
                    happy--;
                }
                if(happy >= half){
                    if(Math.abs(half - (i+1)) < Math.abs(half - pos)){
                        pos = i+1;
                    }
                }
            }
            System.out.println(pos);
            t--;
        }
    }
}
