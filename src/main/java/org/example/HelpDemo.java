package org.example;

class HelpAnotherOne {
    void helpon(int what) {
        switch (what) {
            case '1':
                System.out.println("Инструкция IF:\n");
                System.out.println("IF (условие) инструкция;");
                System.out.println("ELSE инструкция;");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность инструкций");
                System.out.println(" break;");
                System.out.println(" // ...");
                System.out.println("}");
                break;
            case '3':
                System.out.println("Цикл for:\n");
                System.out.print("for(инициализация; условие; итерация");
                break;
            case '4':
                System.out.println("Цикл while:\n");
                System.out.print("while(условие) инструкция;");
                break;
            case '6':
                System.out.println("Instruction break:\n");
                break;
            case '7':
                System.out.println("Instruction continue:\n");
                break;
        }
    }
    void showMenu() {
        System.out.println("Справка:");
        System.out.println("    1. if");
        System.out.println("    2. switch");
        System.out.println("    3. for");
        System.out.println("    4. while");
        System.out.println("    5. do-while");
        System.out.println("    6. break");
        System.out.println("    6. continue\n");
        System.out.print("Выберите: (q - выход)");
    }
    boolean isvalid(int ch) {
        if (ch < '1' | ch > '7' & ch != 'q') return false;
        else return true;
    }
}

class HelpDemo {
    public static void main(String args[])
        throws java.io.IOException {
        char choice, ignore;
        HelpAnotherOne hlpobj = new HelpAnotherOne();

        for(;;){
            do {
                hlpobj.showMenu();
                choice = (char) System.in.read();

                do{
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (!hlpobj.isvalid(choice));
            if(choice == 'q') break;
            System.out.println('\n');
            hlpobj.helpon(choice);
        }
    }
}