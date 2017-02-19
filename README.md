# Calculator

This is a basic calculator program which takes input in the form of add(2,let(a,let(b,10,mul(b,2)),add(a,a))) and evaluates it to number.

Implemented operators are

1. add
2. mul
3. div
4. let

This program will take two arguments as input

1. Log level
2. Expression


#Assumptions/Limitations

1. Main limitation with this project is it did not considered the overflow while doing calulation. We have to replace BigDecimal with double in the code to implement this.
2. While running this from commandprompt you can not give spaces in the expression as java is going to take them as different arguments
