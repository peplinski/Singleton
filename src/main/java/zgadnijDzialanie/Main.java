package zgadnijDzialanie;

public class Main {
    public static void main(String[] args) {
        Config config = new Config();
        config.odczytajPlik();

        config.wyswietl();
       // config.obliczZPliku();

        //wyswietlenie w konsoli
//        try {
//            config.wyswietlWKonsoli("config.txt");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }




    }
}
