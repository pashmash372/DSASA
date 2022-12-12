package com.scaler.dsa.homework;

public class DistinctPrimes {
}
/*#define ll long long int
const int mn = 1e5 + 5;
vector<int> primes[mn];

void pre_compute() {
    if(!primes[2].empty()) return;
    for(ll i = 2; i < mn; i += 1) {
        if(primes[i].empty()) {
            primes[i].push_back((int)i);
            for(ll j = i+i; j < mn; j += i) {
                primes[j].push_back((int)i);
            }
        }
    }
}

int Solution::solve(vector<int> &A) {
    pre_compute();
    set<int> G;
    for(auto &a : A) {
        for(auto &p : primes[a]) {
            G.insert(p);
        }
    }
    return G.size();
}
*/

/*Q4. Distinct Primes
Solved
character backgroundcharacter
Stuck somewhere?
Ask for help from a TA and get it resolved.
Get help from TA.
You have given an array A having N integers. Let say G is the product of all elements of A.

You have to find the number of distinct prime divisors of G.



Input Format

The first argument given is an Array A, having N integers.
Output Format

Return an Integer, i.e number of distinct prime divisors of G.
Constraints

1 <= N <= 1e5
1 <= A[i] <= 1e5
For Example

Input:
    A = [1, 2, 3, 4]
Output:
     2

Explanation:
    here G = 1 * 2 * 3 * 4 = 24
    and distinct prime divisors of G are [2, 3]
See Expected Output*/

/*You just have to find the prime divisors of each element of an array and count the distinct prime divisors.
You can use any data structure like set to store distinct elements.*/