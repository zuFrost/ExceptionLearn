public class IllegalArgumentExceptionLearn {
    public static void main(String[] args) {
        String consolOutputText = "All good";

        if (true){
            throw new IllegalArgumentException("getElements: illegal path (NULL)");
//            consolOutputText = "Exception situation";
        }
        consolOutputText = "All good, after if code";
        System.out.println(consolOutputText);
    }
}
