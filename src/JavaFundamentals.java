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
 Literals: any constant value which can be assigned to the variable , is called literal.
 int x =10; here int is data type or keywords, x is identifiers or name of variable & 10 constant value or literals.
 integral literals: for integral data types- byte, short, int , long we can specify litarel value in the following base;
  which one is integral data types: byte, short, int, long
 1. decimal literals: x = 10 ( here 10 is decimal value)- allowed digit are 0 to 9
 2. int x =010; ( octal form)- base 8 ( o to 7), literal value should be prefix 0
 3. Hexa decimal form( base 16, allowed digit are 0 to 9 - for extra digit (a to f, we can use both lower case & upper case
 characters, this is one of very few areas where java is not case sensitive)- this are possible way to represent literals
 for integral value.

 Question:    which of the following declarations are valid?
           int x= 10; ( valid)
           int x = 0786; ( error)- integer number too large.
           int x = 0777;(valid)-
           int x = 0XFace; ( valid)
           int x = oBeef;(valid)
           int x = oXBeer; ( valid)

programmer can get value like regular math but JVM calculate different way.
every integral value by default int.
by default, every integral literal is of int type but we can specify explicitly is long type by suffix ( small letter or
capital letter)

*************************************************************************************************************************
Java Array :
1. Introduction
2. Array Declaration
3. Array Creation
4. Array Initialization
5. Array declaration, creation & initialization in a single line
6. length VS length()
7. Anonymous Arrays
8. Array element assignments
9. Array variable assignments

this is the 9 topics i will cover step by step.

1. Introduction:
what is an array?
an Array is a indexed collection of, fixed number of , homo-genius data elements , the main advantage of arrays is we can
represent huge number of values by using single variable so that readability of the code will be improved, but main disadvantage
of arrays is fixed in size that once we creates an array there is no chance of increasing are decreasing the size based on our requirement.
hence to use arrays concept, compulsory we should know the size in advance, which may not possible always.

2.How to declare an array?
one dimensional array declaration:
here is example int[] x; / int []x; / int x[]; -- all are valid but which one is recommended? - int []  x; because name is clearly
separated from type.
at the time declaration, we cant specify the size otherwise we will get compile time error(int[6] x;)-not valid.

two dimensional array declaration: int [][] x;
if i want to declare dimension before the variable that facility is applicable only for first variable in a declaration.
if we trying to apply for remaining variables we will get compile time error ( int[]  []a []b []c - here a is right but b & c is not valid)

three dimensional array declaration: int [][][]  x;
we can write array multiple way but for coding readability , need to follow above style.

question : how many types of array in java?

3. Array Creation: every array in java is an object only hence we can create arrays by using new operator.
like int[] a = new int [3]; - so its an object. usually we are creating object for class, if not class there how can we can create object?
every array type has a corresponding classes are available, under this classes are part of java language but not available to the programmer level.
for example: int []  a = new int [3];
system.out.println( a. getClass().getName()); >>> result is [I -so this is the corresponding class.

lets come to more details about array type & corresponding class name--

int[] >>>>> [I
int [][]>>>>[[I
double[]>>>[D
short[] >>> [s
byte[] >>> [B
boolean[] >>>> [z
this all class available in java language but not for programmer.
here are some java creation loopholes:
int []  x = new int [] - not valid/ce
in [] x = new int [3] - valid, why?
at the time declaration we can not specify the size but at the time of creation we should specify size otherwise we will get compile error.

important note - it is legal to have an array with the size 0 in java int []  x = new int [0] -- valid but int [] x = new int [-3] at this point we will not get compiler error.
because compiler job is finding value for int its either negative or zero. compiler will do job right but run time JVM saying "negative array size exception"

note 2: to specify array size the allowed data types are byte , short, char & int . if we are trying to specify any other type then we will get compile time error.

when we should go for arrays?
any such time limitations? yes.
what is the maximum array size in java? - 2147483647 , more than this number CE - integer number too large!
>>> the maximum allowed array size in java is 2147483647 which is the maximum value of int data type.
>>>>even in the first case we may get run time exception if the sufficient memory not available.

what is array of arrays approach? / two dimensional array creation
-- In java two dimensional array not implemented by using matrix style, some people followed arrays of array approach for multi-dimensional creation.
 the main advantage of the approach is memory utilization would be improved. for 3-4-5 in any dimension we can use array of arrays approach.
 example 1:
 int [][] x = new int[2][];
     x[0] = new int [2];
     x[1] = new int [3];

  example 2 : 3 level arrays.
  int [][][]  x = new int [2][][];
   x[0] = new int  [3][];
   x [0][0] = new int [1];
   x[0][1] = new int [2];
   x[0][2] = new int [3];
   x[1] = new int [2] [2];

   Question: which of the following array declarations are valid?

Array Initialization: once we creates in array, every array  element by default initializer with default values.
whenever we are trying to print , any reference variable internally two string method will be called which is implemented by default to return the string in the following form.
  (classname@hashcode_in_hexadecimal form)

  1.if we are trying any operation on null, we will get run time exception saying null point are exception.
  2. once we creates an array, every array element by default initializer with default values, if we not satisfied with the default value ,
   we can override with this values with our customizer values.
   3. logical mistake runtime error & syntax mistake compiler error.
   4. if we are trying to access in array element with out of range index (either positive or negative int value) then we will get run-time exception saying array index out of exception.


Array declaration, creation & initialization in a single line:

we can declare, create & initialise in array in a single line (short cut representation)

int[] x ; >>> this is declaration
x= new int [3] >>> this is creation
x[0] =10;
x[1] =20; // this is initializer
x[2] =30;

int [] x = { 10,20,30}                    // for int
char[] ch = { 'a', 'e', 'i', 'o', 'u'};  // for char
String [] s = {"A", "AA", "AAA'};        // for String

this, same approach we can use for all dimensional array.
we can extend this shortcut even for multi-dimensional array also\

int [][] x = { {10,20} {30,40,50} }; // two-dimension
int [][][] x = {  {{10,20,30}, {40,50,60}} {{70,80} {90,100,110}}  } // three dimension
if we don't decorate arrays in single line or divide in multiple line, will get compile error: illegal start of expression.

length VS lengths:

length is a final variable , applicable for arrays - length variable represents the size of the array

example 1:
int [] x = new int [6]
sout ( x.length()); //CE: cannot find symbol: method length() location class int []
sout (x.length); // valid, output is 6.

example 2:
String s = "Mohsin";
sout (s.length); // not valid, CE: can not find symbol
sout (s.lenght()); // valid, output 5

length method is a final method, applicable for String object, length method returns number of characters present in the string.
length variable applicable for arrays but not for String objects whereas length method applicable for string object but not for arrays.
in multi-dimensional arrays length variables represents only base size but not total size like--

int [][] x = new int [6][3];
sout (x.length); // answer is 6 only base not total.

there is not direct way to specify total length of multi-dimensional array, indirectly we can find as follows---

x[0].length + x[1].length + x[2].length + ---------------------
length variable applicable for Arrays but lengths variable applicable for String method of array.


Anonymous array:
Sometimes, we cam declare an array without name , such type of nameless arrays are called anonymous arrays.
the main purpose of Anonymous array is just for instant use(one time usage), we can create anonymous array as follows

new int[] {10,20,30,40}; // we cant specify the size for anonymous array.
we can create A.array as follows-----

class test{
p s v main(String[] args) {
sum(new int[] {10,20,30,40})  // this one time use or A.array, just calling for SUM method we use this line as an A.array
}
p s v sum(int[] x )  {          // sum method represent Int
int total = 0;
for (int x1 : x ){
 total = total + x1 ;          // loop here

}
System.out.println ("the sum : " + total);

}

In the above example, just a call SUM method , we required an array but after completing SUM method, we not using SUM anymore hence for this
ont time requirement A.array is the best choice.

while creating anonymous , we cant specify the size otherwise we will get compile time error.
we can create anonymous multi-dimensional also. for this one time requirement, anonymous array is best choice.

new [][] { {10,20},{30,40,50} } // two dimensional array

based on our requirement , we can give the name for A. array then it is no longer Anonymous. like--

new int [] {10,20,30} // this is Anonymous now
int [] x = paste first line; // we gave A array an identity based on requirement.

What is Anonymous array? how we an use Anonymous Array?

ARRAY ELEMENT ASSIGNMENT: In the case of primitive type arrays as array elements we can provide any type which can be implicitly promoted to declared type

int[] x = new int [5];
x[0] = 10;
x[1] = 'a';

byte b = 20;                             // byte, short, char & int allowed , other data type will give error:PLP
x[2] = 'b';                               // in the case of float types array byte, short, char , int , float allowed

short s = 30;
x[3] = s;

but if the object type array, whats behavior will show up?----

 object[] a = new object[];
 a[0] = new object()
 a[1] = new String("durga");
 a[2] = new Integer(10);       /// all are valid

In the case of object types arrays as array elements we can provide either declared type object or its a child class objects.

lets make a quiz:
Runnable [] r = new runnable [10]; // Is it a valid or invalid?
YES. valid-as we know , we cant object in runnable interface but here we are not creating object but array. interface type of array are using thread only, any other data
type will give CE error-incompatible types found.
So, for interface types array, as array elements , its implementation class-object are allowed.

array type VS allowed element types:
 1. PRIMITIVE array >>>>>>> any type which can be implicitly promoted to declared type
 2. OBJECT array >>>>>>>either declared type or its child class objects
 3. ABSTRACT array >>>>> its a child class object are allowed
 4. INTERFACE array>>>>> its a implementation class objects are allowed.

 Which Array Type allowed element types?

 ARRAY VARIABLE ASSIGNMENT:

 Case 1 for Variable assignment:

 int[] x = {10,20,30,40}; we can promote to int [] b = x;
 but,
 char [] ch = {'a', 'b', 'c', 'd'}; we can not promote to int [] c = ch; invalid: CE-compatible types found
 because element level promotions are not applicable at array level, for example - char element can be promoted to int type whereas char array can not be promoted to int array.

ELEMENT PROMOTION:
char >> int                   ---valid, char can be promoted in object level
char[] >> int []              --- not valid , char cant be promoted in array
int >> double                 ---valid
int [] >> double []           ---not valid
float >> int                  --- not valid
float[] >> int []             --- not valid
String >> object              ---valid
String[] >> object[]          ---valid

but in the case of object type arrays, child class type array can be promoted to parent class type array.
 example : String s = {"A", "B", "C", "D" };
           Object a = s ;

Case 2 :
int [] a = {10,20,30,40,50,60 };
int [] b = 70, 80};
 So,
  a = b               // Is it valid?
  b = a               // is it valid?

YES. both are valid. because whenever we are assigning one array to another array , internal elements wont be copied, just a reference variables will be re-assigned.


Case 3 :

int [][] a = new int [3][];
a [0] = new int [4][3]; // CE: incompatible types found: int [][] required: int[]
a [0] = 10;             // CE: incompatible types found: int [][] required: int[]
a [0] = new int [2];    // valid

whenever we are assigning one array to another array, the dimension must be matched. for example- in the place of one-dimensional int array we should provide one dimensional array only.
if we are trying to provide any other dimension, then we will get compile time error.

whenever we are assigning one array to another array , both dimensions and types must be match but sizes are not required to match.

this is officially all arrays concept************************* covered.

Questions: (source Durga sir class- array part:4)
 int [][] a = new int [4][3];  // this line has 5 objects, how?
 a [0] = new int [4];          // this line created 1 object , how?
 a [1] = new int [2];          // this line created 1 objects , how?
 a = new int [3][2];           // this line created 4 objects, how?
  Is it valid code?
  total how many objects are created? 11 objects
  total how many objects eligible for Garbage collection? 7 objects

  *******************************************************************************************************************************************************************************************







































































































































































































































































































 */
