package bank;

import java.util.Scanner;

public class Menu {
  private Scanner scanner; 
  
  public static void main(String[] args){
    System.out.println("Welcome to Globe Bank International");

    Menu menu = new Menu();
    menu.scanner = new Scanner(System.in);

    


    menu.scanner.close();
  }
}
