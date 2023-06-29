package jrush;
enum JavarushQuest {
    JAVA_SYNTAX,
    JAVA_CORE,
    JAVA_MULTITHREADING,
    JAVA_COLLECTIONS,
    CS_50,
    ANDROID,
    GAMES
}

public class Solution58 {
    public static void main(String[] args) {
        //напишите тут ваш код
        JavarushQuest[] jr = JavarushQuest.values();
        for (JavarushQuest temp : jr) {
            System.out.println(temp.ordinal());
        }
    }
}
