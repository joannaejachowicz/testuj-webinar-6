package pl.testuj.ex3_arrays;

public class Arrays {
    public static void main(String[] args) {
        String firstname;
        String lastname = "Potocki";

        String[] names;
        names = new String[5];

//        ["Wojtek"] ["Jan"] ["Julia"] ["Adam"] ["Piotr"]
//        0           1       2           3       4

        int[] numbers = new int[10]; // ale indeksy z zakresu od 0 do 9

        String[] colors = {"black", "white", "yellow"};

        System.out.println(colors[0]);

        colors[0] = "red";

        System.out.println(colors[0]);

        int length = colors.length; // length zwraca ilość elementów w tablicy
        System.out.println(length);

        int lastIndex = colors.length - 1;
        System.out.println(colors[lastIndex]);
    }
}
