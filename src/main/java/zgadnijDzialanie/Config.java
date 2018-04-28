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
    public void wyswietlWKonsoli(String sciezkaDoPliku) throws IOException {
        FileReader fileReader = new FileReader(sciezkaDoPliku);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String text = bufferedReader.readLine();
        do {
            System.out.println(text);

            text = bufferedReader.readLine();
        } while(text != null);

        bufferedReader.close();
    }

    Random rnd = new Random();
    public void losujDzialanie() {

        char[] losuj = new char[]{'+', '-', '*', '/'};
        int wylosowana = rnd.nextInt(losuj.length);
        char wylosowany = losuj[wylosowana];
        System.out.println(wylosowany);
    }

    public void losujLiczby(){
        int liczba1=rnd.nextInt(100);
        System.out.println(liczba1);
        int liczba2=rnd.nextInt(100);
        System.out.println(liczba2);
    }

    public int oblicz(int liczba1, int liczba2){
        int result;
        char[] losuj = new char[]{'+', '-', '*', '/'};
        int wylosowana = rnd.nextInt(losuj.length);
        char wylosowany = losuj[wylosowana];
        if (wylosowany=='+'){
            return result=liczba1+liczba2;
        }else if (wylosowany=='-'){
            return result=liczba1-liczba2;
        }else if (wylosowany=='*'){
            return result=liczba1*liczba2;
        }else if (wylosowany=='/'){

            return result=liczba1/liczba2;
        }
        return 0;
    }

    //dopisac wyswietlanie z konfigu-ok
    //dopiac obliczenia zadan i wyswietlanie w konsoli
    //punkty za odpowiedzi
    //statystyki
}
