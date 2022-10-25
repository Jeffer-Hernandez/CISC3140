## Lab2 Reflections

### Instructions
1. To run the *Java* program, in the terminal from within our directory (CISC3140):
- sh build.sh      

2. To run the `Dates` *Bash* Script
- sh lab2.sh

3. To run an individual *AWK* script:
- ./ScriptName.awk Squirrel_Census.csv   

`Example:`
```
./Q4Script.awk Squirrel_Census.csv   
```

### Java vs. Bash
> The `Java`  program itself was difficult enough for me, I had trouble wrapping my head around the required type conversions that needed to take place to match the specificaitons. The `Bash` script seems to be easier to work with than `Java` since it is less verbose, although I was not able to get a one of my `Bash` functions working. I do see alot of potential for using `Bash` scripts in the future for simple repeatitive tasks involving multiple files.

> There are not many similiarities between the two languages. Syntax is way different, different treatment of tabs and spaces, as well as the fact that `Bash` is interpreted (so the order of my functions matters), whereas `Java` is compiled. 

Both languages have the all the same pillars as other languages for workflow. If statements, loops, case statements, and function calling. It was not tough to understand `Bash` scripts once I started looking them up, although I had not worked with them before.

> Using `Java` I needed at least 2 lines of code to be able to recieve user input. Whereas `Bash` is able to use this functionality much more simply, with nothing to import.

>
```
import java.time.*;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
```
I used these imports to complete my `Java` program. I suppose it is possible to implement my solution from scratch, but it would have added another layer of complexity and **a lot more** time.

### Bash vs Make

> The differences between `Bash` and `Make` are mostly in their syntax. With `Bash` script, it is more like writing code, and following a workflow with a given set of variables and control structures. Whereas `Make` seems to be more of form that needs filling out. We use the built-in functions to tell the file what we want to do, and the files and functions we will use to do it, in a pretty straight forward way. It seems easier to use `Make` although I read on several forums that it is not usually used with `Java`.

> The fact that we are able to compile and run seperate programs with relatively little code and a lot of autonomy as to when or how a program should be run, makes these two tools/languages very similar to use.

> I believe it is easy to compile and run files using both tools. However, `Bash` seems to be a more versatile tool to operate on variables, loop through arrays, and other functional tasks. I personally didn't see any documentation for writing functions in a `Makefile`.

### AWK Exercise

> The AWK assignment was challenging yet interesting. I learned about alot tools that VSCode offers to filter CSV files. You can enter a command to filter  the data before including it in your scriptto get a feedback a bit quicker. I initially wanted to use JSON since I have had experience using it in web development. However, there seemed to be more setup time and code complexity increased as well. 

> I opend my CSV file in my VSCode window, and typed commands to filter the data so that I could get a sense of what my script would look like. I had to learn about AWK's built in functions and workflow to get my program working. Since I had a CSV file, I used the "," as a field seperator. Each of my scripts, loops through all the data for some operation on each row, so I would first test my loop to see if I was looking in the correct column. 

> After establishing the correct column I would declare variables that would hold values of interst to my program. Then search for the value i wanted in each row, and operate on my current value, etc.

>Finally printing my output to the terminal so that the user has some sense of confirmation, as well as providing the information that queried.

### Sample while loop for getting specific values from the data in each row.
```
do {
    if ($8 ~ /Adult/) a++;
    if ($8 ~ /Juvenile/) j++;
}
while(getline != 0)
```