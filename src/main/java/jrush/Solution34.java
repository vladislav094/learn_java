package jrush;

public class Solution34 {
    public static void main(String[] args) {
        String path = "/usr/java/jdk1.8/bin/";

        String jdk13 = "jdk-13";
        System.out.println(changePath(path, jdk13));
    }

    public static String changePath(String path, String jdk) {
        //напишите тут ваш код
        int indexJdk = path.indexOf("jdk");
        String symbol = String.valueOf(path.charAt(indexJdk-1));
        int indexFirstSlashAfterIndexJdk = path.indexOf(symbol, indexJdk);
        return path.substring(0, indexJdk) + jdk + path.substring(indexFirstSlashAfterIndexJdk, path.length());
    }
}
