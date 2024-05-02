package Chapter5; /**
 * 5.0
 * Emilio Torres
 * 3/26/2024
 * version 1.0
 * ITEC 2140 sec. 3 Spring 2024
 * Get Address
 *
 * Create a class with instance variables to
 * hold the name, street address, city, and
 * state for a user. You should enter the name
 * and address in the nameAddress method. You
 * should enter the city and state in the
 * cityState method. In the main method, print
 * the complete address. You should not use the
 * static keyword except for the main method.
 */

import java.util.Scanner;
public class GetAddress {
    //public variables to hold my information.
    public String Name;
    public String Street;
    public String City;
    public String State;

    //Method to input Name/Street.
    public void NameStreet() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name.");
        Name = input.nextLine();
        System.out.println("Please enter the street address for " + Name + ". ");
        Street = input.nextLine();
    }

    //Method to input city and state.
    public void CityState(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the city for " + Name + ". ");
        City = input.nextLine();
        System.out.println("Please enter the state for " + Name + ". ");
        State = input.nextLine();
    }
    //Method to print address
    public void TheAddress(){
        System.out.println(Name);
        System.out.println(Street);
        System.out.println(City + ", " + State);
    }
    //Main Method
    public static void main(String[] args) {
        GetAddress user = new GetAddress();
        user.NameStreet();
        user.CityState();

        user.TheAddress();
    }
}
