package jrush;

public class Solution100 {
    public static void main(String[] args) {
        Two two = new Two();
//        two.getWeight();
        System.out.println(two.getWeight());
        System.out.println(two.getName());
    }
}

class One {
    public String getName() {
        return "Василий";
    }
}

interface HasName {
    String getName();

    int getWeight();
}

class Two extends One implements HasName {
    @Override
    public int getWeight() {
        return 155;
    }

}
