public class Rabbit extends animal {
    private String eyecolor;

    public Rabbit(String name, int age, String eyecolor) {
        super(name, age);

        this.eyecolor = eyecolor;

    }

    public void play() {
        System.out.println("rabbit " + name +  " with " + eyecolor + " eyes +  goes hop");
    }



    public void play(Toy toy) {
        System.out.println("rabbit " + name +  " with " + eyecolor + " eyes +  is playing again with the toy " + toy);
    }
}
