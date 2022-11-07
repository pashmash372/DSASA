# ASSIGNMENT

## Q1. Time-Complexity-2

```
void solve(int n){
    for(int i = 0; i < n; i++){
        for(int j=0; j < i / 2; j++){
            // O(1) operation
        }
    }
}
```

O(N*N)

## Q2. Time-Complexity-3

```

k = 0
for i in range(n//2, n+1):
    j = 2
    while j<=n:
         k = k + n//2
         j = j * 2

```

O(nLogn)

## Q3. Time-Complexity-5

```

What is the time complexity of following code:
 
int a = 0, i = N; 
while (i > 0) { 
    a += i; 
    i /= 2; 
}

```

O(log N)

## Q4. Time-Complexity-6

```

The complexity of Binary search algorithm is

```

O(log n)

## Q5. Time-Complexity-8

```
If for an algorithm time complexity is given by O(1) then complexityof it is:
```

constant

## Q6. Time-Complexity-9

```

If for an algorithm time complexity is given by O(log2n) then complexity will:

```

none of the mentioned

## Q7. Time-Complexity-10

```
If for an algorithm time complexity is given by O(n) then complexityof it is:
```

linear

## Q8. Time-Complexity-12

```
If for an algorithm time complexity is given by O((3/2)^n) then complexity will:

```

exponential

# HOMEWORK

## Q1. Time Complexity - 1.0

```

public void solve(int n){
    int i = n;
    while(i > 0){
        if(i%2 == 0){
            for(int j = 1; j <= n * n; j += 2){
                // O(1) operation
            }
        }
        i /= 2;
    }
}

```

O(n^2 logn)

## Q2. Time Complexity - 3.0

```

public void solve(){
    int i = 1;
    while(i < n){
        int x = i;
        while(x-- > 0){
            // O(1) operation
        }
        i++;
    }
}

```

O(n^2)