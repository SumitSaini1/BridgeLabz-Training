public class IPValidator {
    public static void main(String[] args) {
        String[] ips = {
            "192.168.1.1",
            "256.1.1.1",
            "10.0.0.1",
            "192.168.01.1"
        };

        String ipRegex =
            "^(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)(\\.(25[0-5]|2[0-4]\\d|1\\d\\d|[1-9]?\\d)){3}$";

        for (String ip : ips) {
            System.out.println(ip + " → " + ip.matches(ipRegex));
        }
    }
}
