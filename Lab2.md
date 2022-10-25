## Lab2 exercises!

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

> The AWK assignment was challenging yet interesting. I learned about alot tools that VSCode offers
to filter CSV files. You can enter a command to filter the data before including it in your script
to get a feedback a bit quicker.


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