public class Tester {
    public static void main(String[] args) {

       int summe = calculator(23,12);
        System.out.println(summe);

        boolean summetest = HigherThan100(summe);
        System.out.println(summetest);

    }
    public static int calculator(int numberone, int numbertwo){
        return numberone + numbertwo;

    }
    public static boolean HigherThan100(int value){
        return (value > 100 );
    }



}
