package Test_Night_029.TaskCar;

public class CarObject {
    public static void main(String[] args) {
        Merco merco = new Merco();
        merco.startCar();

        BMW bmw = new BMW();
        bmw.startCar();

        Toyota toyota = new Toyota();
        toyota.startCar();

        toyota.stopCar();
        merco.stopCar();
    }


}
