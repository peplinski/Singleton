package zgadnijDzialanie;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Config {
    private MySettings ustawienia = new MySettings();

    public int obliczZPliku() {
        int result;

        if (ustawienia.getDzialanie().equals('+')) {
            return result = ustawienia.getZakres_liczby_1() + ustawienia.getZakres_liczby_2();
        } else if (ustawienia.getDzialanie().equals('-')) {
            return result = ustawienia.getZakres_liczby_1() - ustawienia.getZakres_liczby_2();
        } else if (ustawienia.getDzialanie().equals('*')) {
            return result = ustawienia.getZakres_liczby_1() * ustawienia.getZakres_liczby_2();
        } else if (ustawienia.getDzialanie().equals('/')) {
            if (ustawienia.getZakres_liczby_1() == 0 || ustawienia.getZakres_liczby_2() == 0) {
                return 0;
            }
            return result = ustawienia.getZakres_liczby_1() / ustawienia.getZakres_liczby_2();
        }

        return 0;

    }


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
        } while (text != null);

        bufferedReader.close();
    }

    public void wyswietl() {
        System.out.println(ustawienia.getDzialanie());
        System.out.println(ustawienia.getZakres_liczby_1());
        System.out.println(ustawienia.getZakres_liczby_2());
    }

}
