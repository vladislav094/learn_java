package interfaces;

public class Animal implements Info{
    public int id;

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println(id + " Is id");
    }

    public void sleep(){
        System.out.println("i am sleeping");
    }
}
