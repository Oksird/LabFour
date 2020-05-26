public class LabFour {
    public static void main(String[] args) {
        Plane plane = new Plane();
        Train train = new Train();
        Car car = new Car();
        Helicopter helicopter = new Helicopter();
        FlyingMachine flyingMachine = new FlyingMachine();
        System.out.println(plane.getTime());
        System.out.println(train.getTime());
        System.out.println(car.getTime());

    }
}

abstract class passengerCarriers{
    protected int value;
    protected int time;
    protected int getValue() {
        return value;
    }

    public int getTime() {
        return time;
    }
}

class Plane extends passengerCarriers{
    Plane(){
        value = 500;
        time = 2;
    }
}

class Train extends passengerCarriers{
    Train(){
        value = 150;
        time = 10;
    }
}

class Car extends passengerCarriers{
    Car(){
        value = 200;
        time = 6;
    }
}

class Helicopter extends passengerCarriers{
    Helicopter(){
        value = 400;
        time = 3;
    }
}

class FlyingMachine extends passengerCarriers{
    FlyingMachine(){
        value = 1000;
        time = 1;
    }
}