package Test_Night_017;

public class c2_Method {
    public static void main(String[] args) { //  Main method

        /*
         declaration of the method
         public                   static               void                 main                (String[] args){
         Access-modifier          specifier            return-type         method-Name          (parameter)
         statements , code
         }
         you have to have the return type, name,(),{}

         Access-Modifier : public,protected,default,private
         specifier       : static, final, abstract, synchronized
         return type     : void, any datatype (int,string,char,int[]..........)
         some method has parameters some don't have parameter

         create method that will print java 10 times


         public ---> The public access modifier is specifies using the keyword public.
         They are accessible from everywhere in the program. There is no restriction on the scope of public data members.


         protected ---> The protected access modifier is specified using the keyword protected.
         The method are accessible within the same package or subclasses in different packages.


         private ---> The private access modifier is specified using the keyword private.
         They are accessible only within the class in which they are declared.
         Any other class of the same package will not b e able to access the members.


         default ---> When no access modifier is specified for a class, method, or data member - It is said to be having the default access modifier by default
         The method which are not declared using ant access modifier, They have default access modifier, which means only access

         */
        hello();
        printJava10();
        hello();
        evenNumbers100();


    }
    public static void hello(){
        System.out.println("Hello");
    }

    // Create a method that will print java 10 times
    public static void printJava10(){
        for (int i = 1; i <= 10; i++) {

            System.out.println("Java");

        }
    }

    // create a method that will print even numbers between 1 to 100
    // Make the method name evenNumbers100
    public static void evenNumbers100(){

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0){
                System.out.print(i + " , ");
            }

        }

    }

    // void method (without parameter)
    // void method (with parameters)
    // return method (without parameters)
    // return method (with parameters)

    // you can use above methods with different access modifier and specifier


}
