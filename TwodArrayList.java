package javaBrocode;
import java.util.ArrayList;


class twodArrayList{
    public static void main(String[] args) {



        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> bakeryList = new ArrayList<>();

        bakeryList.add("pasta");
        bakeryList.add("garlic bread");
        bakeryList.add("donuts");

        ArrayList<String> produceList = new ArrayList<>();

        produceList.add("tomatoes");
        produceList.add("zuchhini");
        produceList.add("donuts");

        ArrayList<String> drinksList = new ArrayList<>();

        drinksList.add("8pm");
        drinksList.add("bagpiper");
        drinksList.add("glenlivit");

        System.out.println(bakeryList.get(0));
        System.out.println(produceList.get(0));
        System.out.println(drinksList.get(0));



        groceryList.add(bakeryList);
        groceryList.add(produceList);
        groceryList.add(drinksList);
        
        System.out.println(groceryList);
        System.out.println(groceryList.get(0).get(0));

    }
}