package zgadnijDzialanie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;

public class Config {
    private MySettings ustawienia = new MySettings();


    public void odczytajPlik() {
        try (BufferedReader reader = new BufferedReader(new FileReader("config.txt"))) {
            for (int i = 0; i < 4; i++) {
                String[] kolumny = reader.readLine().split("=");
                if (kolumny[0].equals("zakres_liczby_1")) {
                    ustawienia.setZakres_liczby_1(Integer.parseInt(kolumny[1]));
                }
                if (kolumny[0].equals("zakres_liczby_2")) {
                    ustawienia.setZakres_liczby_2(Integer.parseInt(kolumny[1]));
                }
                if (kolumny[0].equals("dzialanie")) {
                    ustawienia.setDzialanie(kolumny[1].toCharArray());
                }
                if (kolumny[0].equals("ileRund")) {
                    ustawienia.setIleRund(Integer.parseInt(kolumny[1]));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Random rnd = new Random();
    public void losujDzialanie() {

        char[] losuj = new char[]{'+', '-', '*', '/'};
        int wylosowana = rnd.nextInt(losuj.length);
        char wylosowany = losuj[wylosowana];
    }

    public void losujLiczby(){
        int liczba1=rnd.nextInt(100);
        int liczba2=rnd.nextInt(100);
    }

    //dopisac wyswietlanie z konfigu
    //dopiac obliczenia zadan i wyswietlanie w konsoli
    //punkty za odpowiedzi
    //statystyki
}
