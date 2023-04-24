public abstract class animal implements Action {
    protected String name;
    protected int age;

    public animal(String name, int age){
        this.name=name;
        this.age=age;
    }
}