/*
Java interview questions & analysis concept---------------------
Java language fundamentals:
1.	Identifiers
2.	Reserve words
3.	Data types
4.	Literals
5.	Arrays
6.	Types & variables
7.	Var-argument methods
8.	Main method
9.	Command line arguments
10.	Java coding standards

Identifiers:
####Identifiers using for identification purpose. A name in java program is by default called Identifier.
Which can be used for identification purpose.
It’s can be method name, variable name, class name.
For example:
class test {
     public static void main (String[]arg){
     int x = 10;
     System-----------
     how many Identifiers are there?
      Answer is: 1. test, 2. main 3. String 4. Arg 5. x
     while defining java identifiers we need to follow some rules--- (a to z) (A to Z) (0 to 9) ($) (-) the only allowed characters in java identifiers
     are as above, other than any sign will get compile time error.
     -Identifiers should not start with digit or number.
     -java identifiers are case sensitive
     -maximum character allow ? - there is no length limit for java identifiers but for good practice keep in one-word.

     Questions:
         How many rules for Java Identifiers in total---??

####Reserve words: In every language has reserve words
we cant use reserve word as identifiers like if abstract, if , void , final ----------(more)-----!!
but all pre-defined java class names or interface names we can use as java identifiers.
like String & Runnable.
example: int String = 888;
int Runnable = 999;
we can use this way but its not good coding practice, its reduces readability & creates confusion.


**what happens if we use a reserve word? - Instead of compiling, the Java program will instead give the following  error: Expected
**How many reserve words in Java? - total 53
**how many types of reserve words in java? - keywords & reserve literals
**how many keywords & what types?- total 50, two types -used keywords 48 (if else------ & unused keywords 2 (goto & Const)
**what is reserve literals?- true, false & null>>> true & false boolean data types & null default value for object reference.
**what is the difference between keyword & reserve words?
-- if the reserve word associated with functionality that is called keyword,
if the reserve word only show value but not functionality then its called reserved word.
**why delete keyword is not in java? - There is no delete in java, and all objects are created on the heap.
The JVM has a garbage collector that relies on reference counts. Once there are no more references to an object,
it becomes available for collection by the garbage collector.


Keywords for data types: byte, short,int, long, float, double, boolean , char ( total 8)
keywords for flow control: if, else, switch,const, default, while, do, for, continue, break, return(11 totals)
keywords for Modifiers: public, private, protected, static, final, abstract, synchronized, native,  strictFp(1.2 version), transient , volatile(11)
keywords for exception handling: try, catch, finally,throw, throws, assert(6)
class related keywords: class, interface, extends, implements, package, import(6)
object related keywords: new, instanceof, super, this (4)
****return type keyword: void (1)- if method don't return anything that's called void. In java return type is mandatory,
 if a method wont return anything then we have declare that method with void return type.
 in C language return type is optional & default return type is int

 Un-used keywords: goto & Const ( some people banned this keywords in java) - by using this keywords we will get compile error.
 (1)- enum>>
 *Enumerations serve the purpose of representing a group of named constants in a programming language.
 *Enums are used when we know all possible values at compile time
 *Enum declaration can be done outside a Class or inside a Class but not inside a Method
 *The main objective of enum is to define our own data types(Enumerated Data Types).
 *According to Java naming conventions, it is recommended that we name constant with all capital letters

 Lets come to conclusion about keywords:
 - all keywords start with small case alphabet symbols
 - no delete key word
 - some keywords not using that much
 - new keywords coming in the need of java
 \just for better reminder -strictfp not strictFp, instanceof but not instanceOf, synchronized but not synchronize
 extends but not extend, implements but not implement, import but not imports, const but not constant/

 question for exams can be --
 1. which of the following list contains only java reserved words? - answers should be tricky, check spell & capital letters





 */
