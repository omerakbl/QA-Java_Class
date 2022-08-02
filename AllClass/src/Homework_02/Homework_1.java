package Homework_02;

public class Homework_1 {
    public static void main(String[] args) {

        String pra1 = "  hello my name is Omer .";
        String pra2 = "       i am 25 years old.";
        String pra3 = "  i live in Mardin .";
        String pra4 = "   I have been in IT industry for about 6 years.";
        String pra5 = " I STarted as MAnual TESter and NOW I am doiNG AuTomaTion Testing.";
        String pra6 = " I have experience in EducatION, energy,finance and some manY Other AREAs.";
        String pra7 = " i HAve scrum master and Oracle java Programmer certificates.";
        String pra8 = "   i love JaVA.";
        String pra9 = "   I designed and DEVELoped many automation test cases using BDD FRamework.";


        String Sent1 = pra1.toLowerCase() .replaceFirst("h", "H") .replace("o","O") .trim()  ;
        String Sent2 = pra2.toLowerCase() .replaceFirst("i", "I") .trim()  ;
        String Sent3 = pra3.toLowerCase() .replaceFirst("i", "I") .replace("m", "M") .trim()  ;
        String Sent4 = pra4.trim()  ;
        String Sent5 = pra5.toLowerCase() .replaceFirst("i", "I")  .trim()  ;
        String Sent6 = pra6.toLowerCase() .replaceFirst("i", "I")  .trim()  ;
        String Sent7 = pra7.toLowerCase() .replaceFirst("i", "I")  .trim()  ;
        String Sent8 = pra8.toLowerCase() .replaceFirst("i", "I") .replace("j", "J")  .trim()  ;
        String Sent9 = pra9.toLowerCase() .replaceFirst("i", "I")  .trim()  ;

        System.out.println(pra1.length());
        System.out.println(pra2.length());
        System.out.println(pra3.length());
        System.out.println(pra4.length());
        System.out.println(pra5.length());
        System.out.println(pra6.length());
        System.out.println(pra7.length());
        System.out.println(pra8.length());
        System.out.println(pra9.length());


        System.out.println( Sent1.charAt(1) + " " + Sent1.charAt(4) + " " +  Sent1.charAt(5) );
        System.out.println( Sent2.charAt(1) + " " + Sent2.charAt(4) + " " +  Sent2.charAt(5) );
        System.out.println( Sent3.charAt(1) + " " + Sent3.charAt(4) + " " +  Sent3.charAt(5) );
        System.out.println( Sent4.charAt(1) + " " + Sent4.charAt(4) + " " +  Sent4.charAt(5) );
        System.out.println( Sent5.charAt(1) + " " + Sent5.charAt(4) + " " +  Sent5.charAt(5) );
        System.out.println( Sent6.charAt(1) + " " + Sent6.charAt(4) + " " +  Sent6.charAt(5) );
        System.out.println( Sent7.charAt(1) + " " + Sent7.charAt(4) + " " +  Sent7.charAt(5) );
        System.out.println( Sent8.charAt(1) + " " + Sent8.charAt(4) + " " +  Sent8.charAt(5) );
        System.out.println( Sent9.charAt(1) + " " + Sent9.charAt(4) + " " +  Sent9.charAt(5) );

        String result = Sent1 + Sent2 + Sent3 + Sent4 + Sent5 + Sent6 + Sent7 + Sent8 + Sent9;

        System.out.println(result);

    }
}
