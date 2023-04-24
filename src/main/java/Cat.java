public class Cat extends animal {
    private String name;
    private int age;


    //constructor
    public Cat(String name, int age) {
        super(name, age);
        this.name=name;
    }




    @Override
    public void play(){
        System.out.println( "Cat "  + name +  " jumps on the table ");

    }

    @Override
    public void play(Toy toy){
        System.out.println( "Cat " +  " " + name + " " + " is playing with the toy " + toy);

    }
}

