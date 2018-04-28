package zgadnijDzialanie;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        config.odczytajPlik();

        //wyswietlenie w konsoli
        try {
            config.wyswietlWKonsoli("config.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //losowanie dzialania
        config.losujDzialanie();

        //losowanie liczb
        config.losujLiczby();


    }
}
