
Objectives for Lab #1:
---------------------
   * Practice using abstraction by creating an Abstract super class and
     choosing an appropriate class name (should be a noun).
   * Practice identifying common properties and behaviors (methods) and placing
     those things in the super class
   * In the files provided many mistakes have been made with regard to proper
     encapsulation (declaring properties private, etc.) and placement of
     common members. You may have to move some things around, remove things
     and/or create new things to make this work better.
   * Practice deciding which super class methods should be abstract, if any,
     and which super class methods should be fully implemented, if any.
     (TIP: implement (concrete) methods that should not change and declare them 
     final; if a method has the potential for being overridden in the 
     sub-class, declare that method abstract)
   * Can you think of any other ways to improve on this design?

Instructions for Lab #1:
----------------------
1. Create an abstract super class that contains COMMON properties and methods
   to be inherited by the sub-classes that are provided.

2. Modify your sub-classes to take advantage of this inheritance. Will you
   need to re-implement and/or override methods? Will you need to re-declare all
   properties? What methods should be abstract, if any?

3. Fix any and all encapsulation problems.
4. Create a driver class to test your code. In this driver class create and
   use at least one instance of each sub-class.
5. In the driver class, document what you think is good or bad about this
   architecture from the perspective of using abstraction and inheritance.
   (Remember, a driver class must have a main method)
6. When declaring variables in your driver class consider using the 
   Liskov Substitution principle. This is where you declare a variable using
   it's abstract type. For example, you could do this:

   MyAbstractSuperClass course = new AdvancedJavaCourse();

   instead of this:

   AdvancedJavaCourse course = new AdvancedJavaCourse();

   Consider when this is advantageous and when it isn't. Provide a comment
   that explains your position.




From the "Comparison Grid (Interfaces vs. Abstract Classes)"
document we can revisit the Abstract Class
and then consider how that may apply to this project.

Partial abstraction (concrete methods allowed), may
have implementation details resulting in sub classes
being dependent on those details

>>OK could apply to this project

May use any combination of any type of property
and any type of method, abstract or concrete

>>OK

May add concrete methods at any time without
breaking sub classes; adding abstract methods,
however, will break sub classes

>>OK

Does not support multiple inheritance

>> This maybe important for a course catalog
>> may want to add new fields of study to the school

May only be used in one class hierarchy within a
single application

>> ok

Risk of inheriting poor quality code

>>OK

Sub class authors must research and understand all
inherited methods to be useful. This is not easy
because the methods are inherited invisibly and the
compiler will not help you. If you are inheriting a
large number of methods it’s unlikely you will
know and understand all of them

>>OK

Sub class authors do risk overriding an inherited
concrete method’s behavior in an inappropriate
way, unless the methods are declared final

>>OK

Sub class authors risk inheriting inappropriate
default method implementations

>>OK

Sub class authors do not need to re-declare inherited
concrete methods, saving time and effort. However,
abstract classes may also have abstract methods, and
in this case, there’s just as much extra work as with
interfaces

>>OK

With Abstract classes you risk much, unless you
stick to abstract methods

>>OK [good point to remember]

Sub class that inherit from Abstract classes must
pass the “is a” rule 100% of the time

>>OK

Abstract classes rigidly enforce behavioral contracts
with implementation details

>>OK

Abstract classes that have implementation details
are more rigid, more fragile and less portable than
Interfaces

>>OK

Abstract methods may be a better choice when code
reuse is needed in a tightly controlled environment

>>OK








