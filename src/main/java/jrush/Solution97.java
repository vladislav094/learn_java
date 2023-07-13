package jrush;

public class Solution97 {
    public static void main(String[] args) {
        Cow cow = new Whale();
        System.out.println(cow instanceof Whale);
        Whale whale = (Whale) cow;
    }
}
class Cow
{
    public void printColor ()
    {
        System.out.println("Я — белая");
    }

    public void printName()
    {
        System.out.println("Я — корова");
    }
}

class Whale extends Cow
{
    public void printName()
    {
        System.out.println("Я — кит");
    }
}