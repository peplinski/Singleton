package zgadnijDzialanie;

import java.util.Random;

public class losoweDziałania {
    Random rnd = new Random();

    public void losujDzialanie() {

        char[] losuj = new char[]{'+', '-', '*', '/'};
        int wylosowana = rnd.nextInt(losuj.length);
        char wylosowany = losuj[wylosowana];
        System.out.println(wylosowany);
    }

    public void losujLiczby() {
        int liczba1 = rnd.nextInt(100);
        System.out.println(liczba1);
        int liczba2 = rnd.nextInt(100);
        System.out.println(liczba2);
    }
    public int oblicz(int liczba1, int liczba2) {
        int result = 0;
        char[] losuj = new char[]{'+', '-', '*', '/'};
        int wylosowana = rnd.nextInt(losuj.length);
        char wylosowany = losuj[wylosowana];
        if (wylosowany == '+') {
            return result = liczba1 + liczba2;
        } else if (wylosowany == '-') {
            return result = liczba1 - liczba2;
        } else if (wylosowany == '*') {
            return result = liczba1 * liczba2;
        } else if (wylosowany == '/') {
            if (liczba1 == 0 || liczba2 == 0) {
                return 0;
            }
            return result = liczba1 / liczba2;
        }
        return 0;
    }
}
