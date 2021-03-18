/**
 *
 *  @author Wolniarski Mateusz S21096
 *
 */

package zad3;


/*<-- niezbędne importy */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

  public static void main(String[] args) {
    // Lista destynacji: port_wylotu port_przylotu cena_EUR
    List<String> dest = Arrays.asList(
      "bleble bleble 2000",
      "WAW HAV 1200",
      "xxx yyy 789",
      "WAW DPS 2000",
      "WAW HKT 1000"
    );
    double ratePLNvsEUR = 4.30;
    List<String> result = dest.stream().filter(s -> s.startsWith("WAW")).map(m -> {
      String[] data = m.split(" ");
      String to = data[1];
      int pricePLN = (int) (ratePLNvsEUR*Integer.parseInt(data[2]));
      return "to " + to + " - price in PLN:  " + pricePLN;
    }).collect(Collectors.toList());
    /*<-- tu należy dopisać fragment
     * przy czym nie wolno używać żadnych własnych klas, jak np. ListCreator
     * ani też żadnych własnych interfejsów
     * Podpowiedź: należy użyć strumieni
     */

    for (String r : result) System.out.println(r);
  }
}
