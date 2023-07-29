/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author wasim
 */
public class GuesstheNumber {

    public static void main(String[] args) {
        Random n = new Random();

        int Gen_num = n.nextInt(100);
        System.out.println("You have 10 attempt to win the Game");
        int num = 0, trail = 10, count = 0, i = 0;
        Scanner sc = new Scanner(System.in);
        for (i = 0; i < trail; i++) {
            count++;
            System.out.print("Guess the number: ");
            num = sc.nextInt();
            if (num == Gen_num) {
                System.out.println("You won the Game" + " in " + count + " attempt!");
                break;
            } else if (num > Gen_num && i != trail - 1) {
                System.out.println("The number you guessed is greater then expected! " + "and " + count + " attempt over!");
            } else if (num < Gen_num && i != trail - 1) {
                System.out.println("The number you guessed is lower then expected!" + "and " + count + " attempt over!");
            }
        }
        if (i == trail) {
            System.out.print("Bad Luck! Game over the correct number is " + Gen_num + " and " + count + " attempt over!");

        }
        System.out.println("\n\nDeveloped by Wasim Khan");
    }

}
