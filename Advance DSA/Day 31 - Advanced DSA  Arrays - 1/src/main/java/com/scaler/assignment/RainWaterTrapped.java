package com.scaler.assignment;

public class RainWaterTrapped {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int trap(final int[] A) {
        int n = A.length;
        int left = 0;
        int right = n - 1;
        int res = 0;
        int maxleft = 0, maxright = 0;
        while(left <= right){
            // When height of left side is lower, calculate height of water trapped in left bin else calculate for right bin
            if(A[left] <= A[right]){
                if(A[left] >= maxleft)
                    maxleft = A[left]; //This index wont store any water as there is no index towards the left whose height is greater than this.
                else
                    res += maxleft - A[left];
                left++;
            }
            else{
                if(A[right] >= maxright)
                    maxright = A[right]; //This index wont store any water as there is no index towards the right whose height is greater than this.
                else
                    res += maxright - A[right];
                right--;
            }
        }
        return res;
    }
}