# ASSIGNMENT

## Q1. DSA - 01

```
An algorithm consists of two independent piece of code, having complexities f(n) and g(n) respectively. What would be the complexity of the complete algorithm
```

MAX( f(n), g(n) )


## Q2. NESTED_CMPL

```
int a = 0, b = 0;    
for (i = 0; i < N; i++) {
    for (j = 0; j < N; j++) {
        a = a + j;
    }
}
for (k = 0; k < N; k++) {
    b = b + k;
}
```

O(N * N) time, O(1) space




## Q3. NESTED_CMPL3

```

int count = 0;
for (int i = N; i > 0; i /= 2) {
    for (int j = 0; j < i; j++) {
        count += 1;
    }
}
```

O(N)

## Q4. NESTED_CMPL2


```
int a = 0;
for (i = 0; i < N; i++) {
    for (j = N; j > i; j--) {
        a = a + i + j;
    }
}
```

O(N*N)

## Q5. Time-Complexity-7

```
To measure Time complexity of an algorithm Big O notation is used which:
```

describes limiting behaviour of the function

characterises a function based on growth of function

upper bound on growth rate of the function
 


# HOMEWORK

## Q1. Time Complexity - 10

```
for (int i = 3 ; i < n / 3  ;  i += 3) {
    for(int j = 2 ; j < n / 2 ; j += 2){
        // O(1) operation  
    }
}
```
O ( n ^ 2)

## Q2. Time Complexity - 3B

``` 
public void solve() {
    int i = 1;
    while (i < n) {
        int x = i;
        while (x--> 0) {
            //O(1) operation
        }
        i++;
    }
}
```

O(n^2)

## Q3. Time Complexity - 9

``` 
int i = 0;
while(i*i <= N){
   for(int j = 0; j <= N; j++){
      for(int k = 0; k <= N; k++,i++){
         //O(1) operation
      }
   }
   i++;
}
```

O(N^2)

## Q4. Time Complexity-iii

``` 
for(int i = 0; i < n; i++){

    for(int j = i - 1; j >= 0; j++){

            ans += i + j ;

    }

}

```

Code will run indefinitely

## Q5. Time Complexity Easy 02

``` 
for (i = 0; i < N; i++) { 
  for (j = i; j < N; j++) { 
     break; 
  }
}
```
O(N)

## Q6. Time Complexity Easy 01

``` 
int count =0;
while(N > 0){
    count++;
    N/=3;
}
```

O(log(N)) {Base 3}



## Q7. Time Complexity - M4

```
public void solve(int N) {
    for(int i = 0; i < Math.pow(2,N); i++) {
        int j = i;
        while(j > 0){
            j -= 1;
        }
    }
}

```

O(4^N)

## Q8. Time Complexity Loops 1


``` 
public static void fun(int n) {
    int i, j;
    for (i = 1; i * i <= n; i++) {
        for (j = 1; j * j <= i; j += i) {
            //O(1) operation
        }
    }
}
 
```

O(√n)