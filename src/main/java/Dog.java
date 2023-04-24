public class Dog extends animal {

    private String owner;

    public Dog(String name, int age, String owner) {
        super(name, age);
        this.owner = owner;
    }

    @Override

    public void play(){
        System.out.println("Dog " + name + " is chasing their tail");

    }
    @Override
    public void play(Toy toy){
        System.out.println("Dog " + name + " is playing with the toy " + toy);
    }
}

