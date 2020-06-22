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
*********************************************************************************************************************

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
*************************************************************************************************************************
 */

/*
Data type in Java:
java is strongly typed programming language.
In java, every variable, every expression has a some type. each & every data type is a clearly defined. every assignment should be
checked by compiler for type compatibility. because of, we can conclude that java language is strongly typed programming language.
type checking is very strong.
Is java is pure OOP language or not? - based on context,yes & no both answer would be correct.
why?- yes, java has more object oriented nature,
 No, consider java alone-java is not pure object oriented language because java has some
limitations, several concept & several feature are not supported by Java- like multiple inheritance, operator overloading.
based on the relative perception java is OOP but not perfect. what would be right answer then-->> No, Java is not yet pure object oriented
programming language because several features are not satisfied by Java( like operator overloading, multiple inheritance etc), moreover, we are
depending on primitive data types which are none objects. But Java is purely strong typed language but not pure OOP language.

Primitive data type(8): two types - Numerical & non-numerical data types
Numerical Data types: Integral & Floating data type
Non-numerical data types: char , Boolean
Integral data type:byte, short , int, long
Floating data type: float, double

except boolean & char, remaining data types considered signed data type. because we can represent both positive & negative numbers.

lets explain all data types:
byte>>>> 8 bits, max value: 127 min Value:-128
Do i understood how to calculate bit? 1-1-1-1-1-1-1-1, first 1 has 0 value, next 7 bit has value- 2 power o to 2 power 6
how much total = 64+32+16+8+4+2+1 = 127 max value, minimum value = -128( first 1 value will add for negative value)

         byte b = 127 ( maximum range & valid)
         byte b = 128 (PLP found! int required, invalid)
         byte b = 10.5 (plp found! double required, invalid)
         byte b = true; (compatible type found, boolean required, invalid)


Conclusion:
the most significant bit excess sign bit, 0 means positive number & 1 means negative number, positive numbers will be represented in
directly in the memory whereas to negative numbers will be represented in to is compatible of form.

Question: what is the range of byte?
Question: How many data types we have? explain all?
possible loss of precision: “Possible loss of precision” occurs when more information is assigned to a variable than it can hold.
If this happens, pieces will be thrown out. If this is fine, then the code needs to explicitly declare the variable as a new type.
A “possible loss of precision” error commonly occurs when:
Trying to assign a real number to a variable with an integer data type.
Trying to assign a double to a variable with an integer data type.

Short data type: Short is most rarely uses data type in java. size: 2 bytes- 8 bits, Range: -2 power 15 to 2 power 15 -1 {-32768 to 32767}
example: short s = 32767 ( maximum range & valid)
         short s = 32768 (PLP found! int required,invalid)
         short s = 10.5 (plp found! double required, invalid)
         short s = true; (compatible type found, boolean required, invalid)

>>>> when expected form & provided form, read & write operation is very efficient, short datatype was popular in old time but its outdated data type.

int Data type: int is most common used data type in java. size: 4 bytes(32 bits), range: -2 power 31 to 2 power 31[-2147483648 to 2147483647]
  int x = 2147483647; ( valid, max)
  int x = 2147483647; ( invalid, PLP- error integer number too large)
  int x = 2147483648L; (L is lang value- error- PLP found , lang required:int)
  int x = true; (compatible types found: boolean required:int)

long data type: 8 bytes, 64 bits = 2 power 63 == ???


  easy to remember>> byte 8 bits, as first bit is negative then rest of 7 bit will multiple by 2 ( 2 power 7 = 128) like 2*2*2*2*2*2*2
                     short 16 bits ( so 2 power 15= 32768)2*2*2*2*2*2*2*2*2*2*2*2*2*2*2 = 32768
                     int 32 bits ( 2 power 31)= 2147483647
                     long 64 bits (2 power 63)=
      when int, may not enough hold a value, we should go for long data type.
      the number of character present in big file, may exit length of size but not int.

all the above data type ( byte, short, int , long) has integral values, represent exact number.
if we want to represent floating point or decimal values then we should go for floating point data types.
floating point data type: float & double
how can we define float & double? --
>>>if we want 5 to 6 decimal place go for float & if we want 15 to 16 gor for double
>>>float is single precision or less accuracy but float is double precision or right accuracy
>>> float is 4 bytes but double 8 bytes
>>>float range (-3.4e38 to 3.4e38 but double range -1.7e308 to 1.7e308

Char & Boolean:
in Java, size of boolean is not applicable. range not applicable but allowed values are true or false.
boolean b = true; ( right)
boolean b = 0; ( invalid- error: incompatible types found: required boolean
boolean b = True(invalid-error:cannot find a symbol)
boolean b = "true" ( invalid- incompatible type, can't be string)
Boolean default value in java is false.

Char: size 2 bytes. as java is unicode base language, ASCII range = 0 to 65536
old language  like c/c++ ASCII code base, under the number of allowed ASCII are lesser than 256 characters to represent.
the size of char is old language is one byte but Java is unicode base, under the number of different of unicode are
greater then 256 bits & lesser then 65536, to present this many characters 8 bits may not enough compiler should go 16 bit.
hence java bit 2 bits. range 0 to 65535.
summary- java primitive data types

all data types default value is 0 except Boolean is false in Java.
null is default value object type.

lets accumulate & rewind all questions regarding Identifiers, reserve words & data types.
Data types(8) ended here-----
************************************************************************************************************************
 */
