package jrush;

import java.util.ArrayList;

interface Voice {
    public void voice();
}
public class Solution99 {
    public static void main(String[] args) {
        ArrayList pets = new ArrayList();
        pets.add(new Cats());
        pets.add(new Dogs());

        for (Object pet: pets) {
            if (pet instanceof Voice) {
                Voice scream = (Voice) pet;
                scream.voice();
            }
        }
    }
}

class Dogs implements Voice {

    public void voice(){
        System.out.println("GAF");
    }
}
class Cats implements Voice {

    public void voice(){
        System.out.println("Miy");
    }
}