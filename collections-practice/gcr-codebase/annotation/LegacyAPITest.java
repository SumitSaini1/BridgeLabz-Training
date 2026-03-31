public class LegacyAPITest {

    static class LegacyAPI {

        // old feature should 
        @Deprecated
        public void oldFeature() {
            System.out.println("old feature is running");
        }

        // new recommended 
        public void newFeature() {
            System.out.println("new feature is running");
        }
    }

    public static void main(String[] args) {

        LegacyAPI api = new LegacyAPI();

        api.oldFeature(); // compiler warning 
        api.newFeature(); // no warning
    }
}
