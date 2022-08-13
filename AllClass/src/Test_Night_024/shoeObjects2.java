package Test_Night_024;

public class shoeObjects2 {

    public static void main(String[] args) {

        Shoe shoe = new Shoe();

        shoe.getShoeInfo();

        // lets set information shoe without calling instance variables

        shoe.setShoeInfo("Nike",9,"YELLOW");

        shoe.getShoeInfo();


        //shoe.color =...
        //shoe.size =...
        //shoe.brand =...

        Shoe shoe1 = new Shoe();
        shoe1.setShoeInfo("Converse", 12, "Black");

        Shoe [] allShoes = {shoe,shoe1};

        System.out.println("***************************");

        for (int i = 0; i < allShoes.length; i++) {
            allShoes[i].wear();
            allShoes[i].getShoeInfo();

        }
        System.out.println("*************************");
        System.out.println(shoe); // [LTest_Night_024.Shoe;@1b6d3586 this will be printed if you don't have toString method.




    }


}
