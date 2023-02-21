import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SolarSystem[] solarSystem=SolarSystem.values();


            String a = new Scanner(System.in).nextLine().toUpperCase();
            switch (a){
                case "EARTH" -> System.out.println(SolarSystem.EARTH.getInfo());
                case "MARS" -> System.out.println(SolarSystem.MARS.getInfo());
                case "JUPITER"-> System.out.println(SolarSystem.JUPITER.getInfo());
                case "SATURN"-> System.out.println(SolarSystem.SATURN.getInfo());
                case "MERKURII"-> System.out.println(SolarSystem.MERKURII.getInfo());
                case "URAN"-> System.out.println(SolarSystem.URAN.getInfo());
                case "NEPTUN"-> System.out.println(SolarSystem.NEPTUN.getInfo());
                case "PLUTON"-> System.out.println(SolarSystem.PLUTON.getInfo());
                case "VENERA"-> System.out.println(SolarSystem.VENERA.getInfo());
            }



    }
}