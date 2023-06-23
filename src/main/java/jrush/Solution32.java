package jrush;

public class Solution32 {
    public static void main(String[] args) {
        String[] urls = {"https://javarush.ru", "https://google.com", "http://wikipedia.org", "facebook.com", "https://instagram", "codegym.cc"};
        for (String url : urls) {
            String protocol = checkProtocol(url);
            String domain = checkDomain(url);

            System.out.println("У URL-адреса - " + url + ", сетевой протокол - " + protocol + ", домен - " + domain);
        }
    }

    public static String checkProtocol(String url) {
        //напишите тут ваш
        String https = "https";
        String http = "http";
        if (url.startsWith(https)) return https;
        else if (url.startsWith(http)) {
            return http;
        } else return "неизвестный";
    }

    public static String checkDomain(String url) {
        //напишите тут ваш код
        String[] domains = {"com", "net", "org", "ru"};
        for (int i = 0; i < domains.length; i++) {
            if (url.endsWith(domains[i])) return domains[i];
        }
        return "неизвестный";
    }
}
