public class Phone {
    public static void main(String args[]) {
        String numbers[][] = {
                {"Tom", "555-3322"},
                {"Marry", "444-3115"},
                {"John", "333-3322"},
                {"Rachel", "222-1622"},
        };
        int i;
        if(args.length != 1)
            System.out.println("Использование: java Phone <Имя>");
        else {
            for(i=0; i <numbers.length; i++) {
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] + ": " +
                                       numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length)
                System.out.println("Имя не найдено.");;
        }
    }
}
