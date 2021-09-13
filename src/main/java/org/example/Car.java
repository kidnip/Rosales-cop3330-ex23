package org.example;

import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Jeremy Rosales
 */
public class Car
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);
        String choice;

        System.out.print("Is the car silent when you turn the key? ");
        choice = (input.next()).toLowerCase();

        if(choice.equals("y") || choice.equals("yes")){
            System.out.print("Are the battery terminals corroded? ");
            choice = (input.next()).toLowerCase();

            if(choice.equals("y") || choice.equals("yes")){
                System.out.println("Clean terminals and try starting again. ");
            }
            else if(choice.equals("n") || choice.equals("no")){
                System.out.println("Replace cables and try again. ");
            }
        }
        else if(choice.equals("n") || choice.equals("no")){
            System.out.print("Does the car make a clicking noise.");
            choice = (input.next()).toLowerCase();

            if(choice.equals("y") || choice.equals("yes")){
                System.out.println("Replace the battery. ");
            }
            else if(choice.equals("n") || choice.equals("no")){
                System.out.print("Does the car crank up but fail to start? ");
                choice = (input.next()).toLowerCase();

                if(choice.equals("y") || choice.equals("yes")){
                    System.out.println("Check spark plug connections. ");
                }
                else if(choice.equals("n") || choice.equals("no")){
                    System.out.print("Does the engine start and then die? ");
                    choice = (input.next()).toLowerCase();

                    if(choice.equals("y") || choice.equals("yes")){
                        System.out.println("Does you car fuel injection? ");
                        choice = (input.next()).toLowerCase();

                        if(choice.equals("y") || choice.equals("yes")){
                            System.out.println("Get it in for service. ");
                        }
                        else if(choice.equals("n") || choice.equals("no")){
                            System.out.println("Check to ensure the choke is opening and closing. ");
                        }
                    }
                    else if(choice.equals("n") || choice.equals("no")){
                        System.out.println("This should not be possible. ");
                    }
                }
            }
        }
    }
}
