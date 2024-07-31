package day_01_debugShala;

import java.util.Scanner;

public class Game
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int playerHealth = 100;
        int enemyHealth = 100;
        
        System.out.println("Welcome to the Simple Game!");
        System.out.println("You are the player, and your enemy is the computer.");
        
        while (playerHealth > 0 && enemyHealth > 0)
        {
            System.out.println("\nYour Health: " + playerHealth);
            System.out.println("Enemy Health: " + enemyHealth);
            System.out.println("\nChoose an action:");
            System.out.println("1. Attack");
            System.out.println("2. Heal");
            
            int choice = scanner.nextInt();
            
            if (choice == 1) 
            {
                int playerDamage = (int) (Math.random() * 20);
                int enemyDamage = (int) (Math.random() * 20);
                playerHealth -= enemyDamage;
                enemyHealth -= playerDamage;
                System.out.println("You attacked the enemy for " + playerDamage + " damage!");
                System.out.println("The enemy attacked you for " + enemyDamage + " damage!");
            } 
            else if (choice == 2) 
            {
                int healAmount = (int) (Math.random() * 10);
                playerHealth += healAmount;
                System.out.println("You healed for " + healAmount + " points!");
                
                
                
                
                int enemyDamage = (int) (Math.random() * 20);
                playerHealth -= enemyDamage;
                System.out.println("The enemy attacked you for " + enemyDamage + " damage!");
            } 
            else
            {
                System.out.println("Invalid choice. Please choose 1 (Attack) or 2 (Heal).");
            }
        }
        
        if (playerHealth <= 0) 
        {
            System.out.println("You were defeated by the enemy. Game over!");
        } else {
            System.out.println("Congratulations! You defeated the enemy! You win!");
        }
        
        scanner.close();
    }
}