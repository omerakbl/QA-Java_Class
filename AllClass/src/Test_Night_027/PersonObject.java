package Test_Night_027;

public class PersonObject {
    public static void main(String[] args) {
        FemalePerson person1 = new FemalePerson();
        person1.name = "name";
        person1.age = 20;
        System.out.println("FemalePerson.isHuman = " + FemalePerson.isHuman);
        System.out.println("FemalePerson.gender = " + FemalePerson.gender);

        if (FemalePerson.gender == 'F' && FemalePerson.isHuman){

            System.out.println("person1.name = " + person1.name);

        }

        FemalePerson person2 = new FemalePerson();

        person2.name = "name2";
        person2.age = 21;

        // since you are in same package with female person class you will be able to call default and public variable
    }
}
