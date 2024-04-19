interface Animal{
    // Constant field eat (implicitly public, static, and final)
    int eat = 2;
    void makeSound();
}

interface Animal1 extends Animal{
    void eats();
}

class Dog implements Animal{
    public void makeSound(){
        System.out.println("Dog barks.");
    }
    public void eats() {
        System.out.println("Dog eats in kg: "+eat);
    }
}

class Cat implements Animal{
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class Interface_simple{
    public static void main(String args[]){
        Dog myDog = new Dog();
        Cat myCat = new Cat();
        
        myDog.makeSound();
        myDog.eats(); 
        myCat.makeSound();
    }
}
