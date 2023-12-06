class NormalTask{
    public static void main(String[] args) {
        Dog task = new Dog();
        task.printVariables(2);
        task.printVariables("i am hero");
        task.displayInformation();
        task.eatOwn();
        task.eatParent();
        
    }
}

class Animal{
    int a =20;
    String name = "This is a Animal";
    void eat(){
        System.out.println("Animal eat food");
    }

//     Animal(){
//         System.out.println("Animal is created");
//     }
}
class Dog extends Animal{
    int a =100;
    String name = "This is a Dog";
    void printVariables(int a ) {
        System.out.println(a);
        System.out.println(this.a);
        System.out.println(super.a);
    }
    void printVariables(String name){
        System.out.println(super.name);
        System.out.println(this.name);
        System.out.println(name);
    }
    void eat(int amount){
        System.out.println("Dog eat bone"+amount);
    }
    void displayInformation(){
        this.eat(1000);
        super.eat();
    }
    void eatOwn(){
        this.eat(4000);
    }
    void eatParent(){
        super.eat();
    }

    // Dog(){
    //     super();
    //     System.out.println("dog is created");
    // }
}