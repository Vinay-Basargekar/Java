interface Vehicle 
{
    void changeGear(int gear);
    void speedUp(int speedUp);
    void applyBrakes(int decrement);
}

class Bicycle implements Vehicle 
{
    int speed;
    int gear;

    @Override
    public void changeGear(int gear) 
    {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increment) 
    {
        speed =speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) 
    {
        speed =speed - decrement;
    }

    public void printStatus() 
    {
        System.out.println("---Bicycle--- \nSpeed : " + speed + "\nGear : " + gear);
    }
}

class Bike implements Vehicle 
{
    int speed;
    int gear;

    @Override
    public void changeGear(int gear) 
    {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increment) 
    {
        speed =speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) 
    {
        speed =speed - decrement;
    }

    public void printStatus() 
    {
        System.out.println("\n---Bike--- \nSpeed : " + speed + "\nGear : " + gear);
    }
}

class Car implements Vehicle 
{
    int speed;
    int gear;

    @Override
    public void changeGear(int gear) 
    {
        this.gear = gear;
    }

    @Override
    public void speedUp(int increment) 
    {
        speed =speed + increment;
    }

    @Override
    public void applyBrakes(int decrement) 
    {
        speed =speed - decrement;
    }

    public void printStatus() 
    {
        System.out.println("\n---Car--- \nSpeed : " + speed + "\nGear : " + gear);
    }
}

public class VehicleTest
{
    public static void main(String[] args) 
    {
        Bicycle b = new Bicycle();
        Bike bi = new Bike();
        Car c = new Car();

        b.changeGear(1);
        b.speedUp(10);
        b.applyBrakes(5);
        b.printStatus();

        bi.changeGear(2);
        bi.speedUp(20);
        bi.applyBrakes(10);
        bi.printStatus();

        c.changeGear(3);
        c.speedUp(30);
        c.applyBrakes(15);
        c.printStatus();
    }
}

