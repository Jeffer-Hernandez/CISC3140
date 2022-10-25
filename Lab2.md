## Lab2 exercises!

### Java vs. Bash
> Were you successful in recreating the same program features as before? Why or why not?

The `Java`  program itself was difficult enough for me, I had trouble wrapping my head around the required type conversions that needed to take place to match the specificaitons. The `Bash` script seems to be easier to work with than `Java` since it is less verbose. Because of this I was able to recreate my (not to spec) `Java` program with out much grief.

>What was similar between the two languages (bash script, Java source code) in their syntax or handling of concepts? What was different?

There are not many similiarities between the two languages. Syntax is way different, different treatment of tabs and spaces, as well as the fact that `Bash` is interpreted (so the order of my functions matters), whereas `Java` is compiled. 

Both languages have the all the same pillars as other languages for workflow. If statements, loops, case statements, and function calling. It was not tough to understand `Bash` scripts once I started looking them up, although I had not worked with them before.

>How many lines of code did you need to write to accept user input? To compute arithmetic? To display output? Do you prefer one over the other?

Using `Java` I needed at least 2 lines of code to be able to recieve user input. Whereas `Bash` is able to use this functionality much more simply, with nothing to import.

>What libraries did you have to import to complete your program? Could you have completed your program without importing? Why or why not?
```
import java.time.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
```
I used these imports to complete my `Java` program. I suppose it is possible to implement my solution from scratch, but it would have added another layer of complexity and **a lot more** time.
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