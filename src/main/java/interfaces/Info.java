package interfaces;

public interface Info {
    public void showInfo();

    default String saySome(){
        return "Hello World";
    }

    public static void abv(){
        System.out.println("Static method in interfaces");
    }
}
