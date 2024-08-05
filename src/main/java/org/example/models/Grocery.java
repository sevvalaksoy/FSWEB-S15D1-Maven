package org.example.models;

import java.util.*;

public class Grocery {
    public static List<String> groceryList = new ArrayList<>();

    public static void startGrocery() {
        Scanner input = new Scanner(System.in);
        int number;
        Scanner items = new Scanner(System.in);
        while (true) {
            System.out.println("Lütfen bir değer giriniz (0: Uygulamayı durdur, 1 veya 2): ");
            number = input.nextInt();
            switch (number) {
                case 0:
                    System.out.println("Uygulama durduruluyor...");
                    input.close();
                    return;
                case 1:
                    System.out.println("Eklenmesini istediğiniz elemanları giriniz.");
                    String item = items.nextLine().toLowerCase();
                    addItems(item);
                    break;
                case 2:
                    System.out.println("Cıkarılmasını istediğiniz elemanları giriniz.");
                    String remove = items.nextLine().toLowerCase();
                    removeItems(remove);
                    break;
                default:
                    System.out.println("Geçersiz giriş! Lütfen 0, 1 veya 2 giriniz.");
            }
        }
    }
    public static void addItems(String input){
        String[] its = input.split(",");
        for(String inp: its){
            if(!checkItemIsInList(inp.trim())){
                groceryList.add(inp.trim());
            }
        }
        printSorted();
    }
    public static void removeItems(String input){
        String[] its = input.split(",");
        for(String inp: its){
            if(checkItemIsInList(inp.trim())) {
                groceryList.remove(inp.trim());
        }   }
        printSorted();
    }
    public static boolean checkItemIsInList(String product){
        return groceryList.contains(product);
    }
    public static void printSorted(){
        Collections.sort(groceryList);
        System.out.println(groceryList);
    }
}
