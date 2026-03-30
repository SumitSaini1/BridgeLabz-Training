public class DefangIP {

    public static String defangIPaddr(String address) {

        return address.replace(".", "[.]");
    }

    public static void main(String[] args) {

        String ip = "1.1.1.1";

        String result = defangIPaddr(ip);
        System.out.println(result);
    }
}
