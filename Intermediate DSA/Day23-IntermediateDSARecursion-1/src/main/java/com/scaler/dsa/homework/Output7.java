package com.scaler.dsa.homework;

public class Output7 {
    public int fun(int x, int n) {
        if (n == 0)
            return 1;
        else if (n % 2 == 0)
            return fun(x * x, n / 2);
        else
            return x * fun(x * x, (n - 1) / 2);
    }
    public void main() {
        int ans = fun(2, 10);
        System.out.println(ans);
    }
}

/*The recursive function is using the binary representation of n.*/

/*The above function performs binary exponentation which returns xn, hence the answer is 210 = 1024.*/


/*1024*/


