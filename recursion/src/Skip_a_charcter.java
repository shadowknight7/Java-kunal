import java.lang.String;
public class Skip_a_charcter {
    public static void main(String[] args) {
        String up="baccad";
        String p=" ";
        System.out.println(skip2("baccad"));
        System.out.println(skipAPPnotapple("bcappledcae"));


    }
    static void skip(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }
        else{
            skip(p+ch,up.substring(1));
        }
    }
    static String skip2(String up){
        if(up.isEmpty()){
            return "";
        }
        char ch=up.charAt(0);
        if(ch=='a') {
            return skip2(up.substring(1));
        }
        else {
            return ch + skip2(up.substring(1));
        }
    }
    static String skipapple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")) {
            return skipapple(up.substring(5));
        }
        else {
            return up.charAt(0) + skipapple(up.substring(1));
        }
    }
    static String skipAPPnotapple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")) {
            return skipAPPnotapple(up.substring(5));
        }
        else {
            return up.charAt(0) + skipAPPnotapple(up.substring(1));
        }
    }


}
