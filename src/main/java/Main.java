public class Main {
    public static void main(String[] args) {
        System.out.println("hello");

        Cat catone= new Cat("cold",14);
        Dog dogone= new Dog("henry" , 14, "faiz");
        Rabbit snowball= new Rabbit("snowball", 15, "blue");
        Toy curiousgeorge= new Toy("your mama corporations");
        Toy legotruck = new Toy("legotruck");



        Action[] animals= new Action[]{catone, dogone, snowball, curiousgeorge};

        for(Action freind: animals){
            freind.play(legotruck);
        }



    }
}
