package sec02.exam04;

import sec02.exam02.Bus;
import sec02.exam02.Vehicle;

public class Driver {
    public void drive(Vehicle vehicle) { // Vehicle에는 Bus객체와 Taxi객체 있음
        if(vehicle instanceof Bus) {
            Bus bus = (Bus) vehicle; // Bus 객체일 경우 안전하게 강제 타입 변환
            bus.checkFare(); // Bus 타입으로 강제 타입 변환을 하는 이유
        }
        vehicle.run();
    }
}
