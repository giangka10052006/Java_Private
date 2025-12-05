package service;

import constant.Constants;
import domain.Car;

public class RaceService {
    public void startRace(){
        Thread car1 = new Thread(new Car("Lamborghini",350.0));
        Thread car2 = new Thread(new Car("Ferrari",300.0));
        Thread car3 = new Thread(new Car("Honda",250.5));

        System.out.println(Constants.SuccessMessage.CAR_START_SUCCESS);

        car1.start();
        car2.start();
        car3.start();
    }
}
