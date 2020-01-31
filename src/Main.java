import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static ArrayList<String[]> burrito = new ArrayList<>();

    public static void main(String[] args) {
        String[] rice = {"white rice", "brown rice", "no rice", "all rice"};
        String[] meat = {"chicken", "steak", "carnidas", "chorizo", "sofritas", "veggie meat", "no meat", "all meat"};
        String[] beans = {"pinto beans", "black beans", "no beans", "all beans"};
        String[] salsa = {"mild salsa", "medium salsa", "hot salsa", "no salsa", "all salsa"};
        String[] veggies = {"lettuce", "fajita veggies", "no veggies", "all veggies"};
        String[] cheese = {"cheese", "null"};
        String[] guac = {"guac", "null"};
        String[] queso = {"queso", "null"};
        String[] sourCream = {"sour cream", "null"};

        int numBurritos = 0;

        for (int i = 0; i < 25; i++) {
            numBurritos++;
            Random rand = new Random();
            int riceChoice = rand.nextInt(rice.length);
            int meatChoice = rand.nextInt(meat.length);
            int beansChoice = rand.nextInt(beans.length);
            int salsaChoice = rand.nextInt(salsa.length);
            int veggiesChoice = rand.nextInt(veggies.length);

            int cheeseChoice = rand.nextInt(2);
            int guacChoice = rand.nextInt(2);
            int quesoChoice = rand.nextInt(2);
            int sourCreamChoice = rand.nextInt(2);

            String[] ingredients = {rice[riceChoice], meat[meatChoice], beans[beansChoice], salsa[salsaChoice],
                    veggies[veggiesChoice], cheese[cheeseChoice], guac[guacChoice],
                    queso[quesoChoice], sourCream[sourCreamChoice]};

            burrito.add(ingredients);

        }

        for (int i = 0; i < numBurritos; i++) {
            double price = 3.00;
            System.out.print("Burrito " + (i + 1) + ": ");

            for (int j = 0; j < burrito.get(i).length; j++) {
                if (!burrito.get(i)[j].equals("null")) {
                    if (j == burrito.get(i).length - 1) {
                        System.out.print(burrito.get(i)[j]);
                    }
                    else {
                        System.out.print(burrito.get(i)[j]  + ", ");
                    }
                }

                if ((!burrito.get(i)[j].equals("no rice") && (!burrito.get(i)[j].equals("no meat")))
                   && (!burrito.get(i)[j].equals("no beans")) && (!burrito.get(i)[j].equals("no salsa"))
                        && (!burrito.get(i)[j].equals("no veggies")) && (!burrito.get(i)[j].equals("null"))) {
                    price += 0.50;
                }
                if ((burrito.get(i)[j].equals("all rice")) || (burrito.get(i)[j].equals("all beans"))
                        || (burrito.get(i)[j].equals("all veggies"))) {
                    price += 0.50;
                }
                if (burrito.get(i)[j].equals("all meat")) {
                    price += (0.50 * 5);
                }
                if (burrito.get(i)[j].equals("all salsa")) {
                    price += (0.50 * 2);
                }
            }

            System.out.printf("\t\t$%.2f", price);
            System.out.println();
            System.out.println();
        }

    }
}
