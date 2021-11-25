package pl.testuj.ex1_if_statement;

public class IfStatement {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Czy jesteś pełnoletni?");
//
//        boolean isAdult = scanner.nextBoolean();
//
//        if (isAdult) {
//            // kod do wykonania jeśli warunek jest spełniony
//            System.out.println("Kod wewnątrz if - jestem pełnoletni");
//        } else {
//            // kod do wykonania jeśli warunek nie jest spełniony (zwrócono false)
//            System.out.println("Kod wewnątrz else - nie jestem pełnoletni");
//        }
//
//        System.out.println("Dalszy kod programu");

        checkNumIsDivideBy2And3(0);
    }

    public static void checkNumIsDivideBy2And3(int num) {
        if (num % 2 == 0 && num % 3 == 0) {
            System.out.println("Liczba podzielna przez 2 i 3");
        } else if (num % 2 == 0) {
            System.out.println("Liczba podzielna przez 2");
        } else if (num % 3 == 0) {
            System.out.println("Liczba podzielna przez 3");
        } else {
            System.out.println("Liczba nie podzielna przez 2 i 3");
        }
    }

    public static boolean isEvenNumber(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isEvenNumberSimplyIfStatement(int num) {
        boolean even = num % 2 == 0 ? true : false;
        return even;
    }

    public static boolean isEvenNumberSimplyWithoutIfStatement(int num) {
        return num % 2 == 0;
    }
}
