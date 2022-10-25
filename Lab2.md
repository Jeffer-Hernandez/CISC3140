## Lab3 exercises!

### Java vs. Bash
> What are the differences between int, long, long long,
and short? Between an unsigned and a signed type? Between a float and
a double?

C++ guarantees `short` and `int` is **at least** 16 bits, `long` **at least** 32 bits, `long long` **at least** 64 bits.

The `signed` can represent positive numbers, negative numbers and zero, while `unsigned` can only represent numbers no less than zero.

### Shell Script vs Makefile
>To calculate a mortgage payment, what types would you use
for the rate, principal, and payment? Explain why you selected each type.

I would use `double` or `float`. I would use a double or a float. Rates, payments, and figures relating to money, usually have decimal points.

### AWK Exercise

> What output will the following code produce?
```cpp
unsigned u = 10, u2 = 42;
std::cout << u2 - u << std::endl;
std::cout << u - u2 << std::endl;
int i = 10, i2 = 42;
std::cout << i2 - i << std::endl;
std::cout << i - i2 << std::endl;
std::cout << i - u << std::endl;
std::cout << u - i << std::endl;
```

Output(g++ 4.8):

```
32
4294967264
32
-32
0
0
```
## Exercise 2.10
>What are the initial values, if any, of each of the following variables?
```cpp
std::string global_str;
int global_int;
int main()
{
    int local_int;
    std::string local_str;
}
```
- `global_str` is a global variable, so the value is empty string.
- `global_int` is a global variable, so the value is zero.
- `local_int` is a local variable which is uninitialized, so it has a undefined value.
- `local_str` is also a local variable which is uninitialized, but it has a value that is defined by the class. So it is an empty string.

## Exercise 2.12
>Which, if any, of the following names are invalid?
- (a) int double = 3.14;
- (b) int _;
- (c) int catch-22;
- (d) int 1_or_2 = 1;
- (e) double Double = 3.14;

`a`, `c`, `d` are invalid.


## Exercise 2.13
>What is the value of j in the following program?
```cpp
int i = 42;
int main()
{
    int i = 100;
    int j = i;
}
```

`100`

## Exercise 2.14
>Is the following program legal? If so, what values are printed?
```cpp
    int i = 100, sum = 0;
    for (int i = 0; i != 10; ++i)
        sum += i;
    std::cout << i << " " << sum << std::endl;
```

Output:

```100 45```


## Exercise 2.17
>What does the following code print?
```cpp
int i, &ri = i;
i = 5; ri = 10;
std::cout << i << " " << ri << std::endl;
```

`10 10`

## Exercise 2.27
> Which of the following initializations are legal? Explain why.

```cpp
int i = -1, &r = 0;         // illegal, r must refer to an object.
int *const p2 = &i2;        // legal.
const int i = -1, &r = 0;   // legal.
const int *const p3 = &i2;  // legal.
const int *p1 = &i2;        // legal
const int &const r2;        // illegal, r2 is a reference that cannot be const.
const int i2 = i, &r = i;   // legal.
```

## Exercise 2.28
>Explain the following definitions. Identify any that are illegal.

```cpp
int i, *const cp;       // illegal, cp must initialize.
int *p1, *const p2;     // illegal, p2 must initialize.
const int ic, &r = ic;  // illegal, ic must initialize.
const int *const p3;    // illegal, p3 must initialize.
const int *p;           // legal. a pointer to const int.
```

## Ongoing Command list
Record a terminal session 
```script -r script-mac-$(date +%F).log```

show modified files in working directory, staged for your next commit 
```git status```

add a file as it looks now to your next commit (stage) 
```git add [file]```

commit your staged content as a new commit snapshot 
```git commit -m "[descriptive message]"```

create a new branch at the current commit 
```git branch [branch name]```

switch to another branch and chekc it out into your working directory 
```git checkout```

merge the specified branch's history into the current one 
```git merge [branch]```

fetch and merge any commits from the tracking remote branch 
```git pull```

Transmit local branch commits to the remote repository branch 
```git push [alias] [branch]```
