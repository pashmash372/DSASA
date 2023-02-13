package com.scaler.dsa.assignment;


import java.util.ArrayList;

public class RearrangeArray {
    public void arrange(ArrayList<Integer> A) {
        int n = A.size();
        for (int i = 0; i < n; i++) A.set(i, A.get(i) + (A.get(A.get(i)) % n) * n);
        for (int i = 0; i < n; i++) A.set(i, A.get(i) / n);
    }
}

class RearrangeArray1 {
    /*
        approach: store initial value and result in the same element.
        / by n will give the initial value
        % by n will give the final result.

        {4, 0, 2, 1, 3} -> {3, 4, 2, 0, 1}
        n = 5;

        Step I:
        20, 0, 10, 5, 15 -> / by 5 gives back the original 4, 0, 2, 1, 3

        Step II: Include result in the element
        i = 0
        arr[i] = 20 but actual value is arr[i]/5 = 4 -> Index
        arr[Index] = 15 but actual value is arr[Index]/5 = 3 -> result
        arr[i]+3 = 23 -> 23%5 = 3 -> result, 23/5 = 4 -> Initial value

        {23, 0, 10, 5, 15}

        i = 1
        arr[i] = 0 but actual value is arr[i]/5 = 0 -> Index
        arr[Index] = 23 but actual value is arr[Index]/5 = 4 -> result
        arr[i]+4 = 4 -> 4%5 = 4 -> result, 4/5 = 0 -> Initial value

        {23, 4, 10, 5, 15}

        i = 2
        arr[i] = 10 but actual value is arr[i]/5 = 2 -> Index
        arr[Index] = 10 but actual value is arr[Index]/5 = 2 -> result
        arr[i]+2 = 12 -> 12%5 = 2 -> result, 12/5 = 2 -> Initial value

        {23, 4, 12, 5, 15}

        i = 3
        arr[i] = 5 but actual value is arr[i]/5 = 1 -> Index
        arr[Index] = 4 but actual value is arr[Index]/5 = 0 -> result
        arr[i]+0 = 5 -> 5%5 = 0 -> result, 5/5 = 1 -> Initial value

        {23, 4, 12, 5, 15}

        i = 4
        arr[i] = 15 but actual value is arr[i]/5 = 3 -> Index
        arr[Index] = 5 but actual value is arr[Index]/5 = 1 -> result
        arr[i]+1 = 16 -> 16%5 = 1 -> result, 16/5 = 3 -> Initial value

        {23, 4, 12, 5, 16}

        Step III: %5 of each element will be the final result {3, 4, 2, 0, 1}


    */
    public void arrange(ArrayList<Integer> a) {
        int n = a.size();
        for (int i = 0; i < n; i++) {
            a.set(i, a.get(i) * n);
        }

        //step 2: include the actual value in the element.
        for (int i = 0; i < n; i++) {
            int initialvalue = a.get(i) / n; //arr[i]
            int result = a.get(initialvalue) / n; //arr[arr[i]]

            //embed the result in the element
            a.set(i, a.get(i) + result);
        }

        //System.out.println(a);

        //Step III
        for (int i = 0; i < n; i++) {
            a.set(i, a.get(i) % n);
        }

    }
}

/*Solution with approach TC:O(N) TC:O(1)*/

class RearrangeArray2 {
    public void arrange(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            a[i] = a[i] * n;
        }
        for (int i = 0; i < n; i++) {
            int initialvalue = a[i] / n;
            int result = a[initialvalue] / n;
            a[i] = a[i] + result;
        }
        for (int i = 0; i < n; i++) {
            a[i] = a[i] % n;
        }
    }
}



/*Q1. Rearrange Array
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
Given an array A of size N. Rearrange the given array so that A[i] becomes A[A[i]] with O(1) extra space.

Constraints:

1 <= N <= 5×104

0 <= A[i] <= N - 1

The elements of A are distinct

Input Format

The argument A is an array of integers

Example 1:

Input : [1, 0]
Return : [0, 1]
Example 2:

Input : [0, 2, 1, 3]
Return : [0, 1, 2, 3]*/

/*If you had extra space to do it, the problem will be very easy.
Store a copy of Arr in B.

And then for every element, do Arr[i] = B[B[i]]

Lets restate what we just said for extra space :

If we could somehow store 2 numbers in every index ( that is, Arr[i] can contain the old value and the new value somehow ), then the problem becomes very easy.
NewValue of Arr[i] = OldValue of Arr[OldValue of Arr[i]]

Now, we will do a slight trick to encode 2 numbers in one index.
This trick assumes that N * N does not overflow.

1) Increase every Array element Arr[i] by (Arr[Arr[i]] % n)*n.
2) Divide every element by N.
Given a number as

   A = B + C * N   if ( B, C < N )
   A % N = B
   A / N = C
We use this fact to encode 2 numbers into each element of Arr.*/