public class Encode {
    public static void main(String[] args){
        String msg = "This is a test text";
        String encmsg = "";
        String decmsg = "";
        String key = "abcdefgi";
        int j;

        System.out.println("Source text: ");
        System.out.println(msg);

        j = 0;
        for(int i = 0; i < msg.length(); i ++) {
            encmsg = encmsg + (char) (msg.charAt(i) ^ key.charAt(j));
            j++;
            if(j == 8) j = 0;
        }

        System.out.print("Crypt text: ");
        System.out.println(encmsg);

        j = 0;
        for(int i = 0; i < msg.length(); i++) {
            decmsg = decmsg + (char) (encmsg.charAt(i) ^ key.charAt(j));
            j++;
            if(j == 8) j =0;
        }
        System.out.print("Decrypt text: ");
        System.out.println(decmsg);
    }
}
