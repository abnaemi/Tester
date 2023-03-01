public class Tester {
    public static void main(String[] args) {

       boolean testword = wordchecker("HallWelt");
        System.out.println(testword);
    }
    public static boolean wordchecker(String word){
        return word.contains("Hallo");

    }

}
