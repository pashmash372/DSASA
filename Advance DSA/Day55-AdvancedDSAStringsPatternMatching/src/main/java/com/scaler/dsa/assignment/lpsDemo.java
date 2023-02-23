package com.scaler.dsa.assignment;

public class lpsDemo {
    public static void main(String[] args) {
        String s = "acccbaaacccbaac";
        int ans = lps(s);
        System.out.println(ans);
    }

    static int lps(String s) {
        int ans=0;
        int n = s.length();
        int lps[]=new int[n];
        lps[0] = 0;
        int l = 0, i = 1;
        while (i < n) {

            if (s.charAt(i) == s.charAt(l)) {
                lps[i] = l + 1;
                ans = Math.max(ans,lps[i]);
                i++;
                l++;
            } else {
                if (l > 0) {
                    l = lps[l - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }

        }
        return ans;
    }

}
