package Test_Night_020;

public class c2_returnTopic {
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

     */

    // return method (without parameters)
    // return method (with parameters)

    public static void minNum(int i1, int i2){
        if (i1<i2){
            System.out.println("Small number is : " + i1);
        }else {
            System.out.println("Small number is : " + i2);
        }
    }
    // void means any data type
    // you don't need to use return statement

    public static void main(String[] args) {

        minNum(20,30);

        int result = division(10,2);
        System.out.println(result);

        int result2 = division(100,25); // 4
        System.out.println(result2);
        result2 = result2 + 10; // 14
        System.out.println(result2);

    //    int result3 = minNum(8,9); this method return type void not int you can't store in int

        int result3 = addition(10,20);
        System.out.println(result3);
    }

    public static int division(int number1, int number2){
        // return type is int
        // at the emd you need to return int from this method

        System.out.println("Hello this is division method");
        System.out.println("divisin of : " + number1 + "," + number2);

        // return "asdas";
        //  you always need to have return statement that will return your result depends on your method type
        return number1/number2;

    }

    // create a return method that will print addition of 2 number

    public static int addition(int number1, int number2){
        System.out.println("Addition of : " + number1 + "," + number2);

        return number1+number2;
    }

}
