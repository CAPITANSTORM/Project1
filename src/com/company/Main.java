/*
Chase Alexander
Project 1
5/11/21
 */

package com.company;

import java.util.Scanner;
import java.util.*;

public class Main {

    static void menu() {
        System.out.println("Please choose an option:");
        System.out.println("(1) Add a task.");
        System.out.println("(2) Remove a task.");
        System.out.println("(3) Update a task.");
        System.out.println("(4) List all tasks.");
        System.out.println("(0) Exit.");
    }


    static ArrayList<String> addATask(ArrayList<String> a) {
        Scanner input = new Scanner(System.in);
        System.out.println("What task would you like to add?");
        String userInput = input.nextLine();
        a.add(userInput);
        return a;
    }


    static ArrayList<String> removeTask(ArrayList<String> a) {

        int b;
        Scanner input = new Scanner(System.in);

        System.out.println("What task would you like to remove?");
        b = input.nextInt();
        a.remove(b);
        return a;
    }


    static ArrayList<String> updateTask(ArrayList<String> x) {
        int a;
        String editTask;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a valid number to update: ");
        a = input.nextInt();
        System.out.println("What would you like this task to do?");
        editTask = input.next();
        x.set(a, editTask);
        return x;
    }


    static void displayAllTasks(ArrayList<String> taskList) {
        int i = 0;
        for (String a:taskList) {
            System.out.println(i + ": " + a);
            i++;
        }
    }


    static void exitProgram() {
        System.exit(0);
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int task = -1;

        ArrayList<String> taskList = new ArrayList<>();


        while(task != 0) {
            menu();
            task = input.nextInt();

            switch (task) {
                case 1:
                    addATask(taskList);
                    break;
                case 2:
                    removeTask(taskList);
                    break;
                case 3:
                    updateTask(taskList);
                    break;
                case 4:
                    displayAllTasks(taskList);
                    break;
                case 0:
                    exitProgram();
                    break;
                default:
                    System.out.println("Please enter a valid option.");
                    break;
            }
        }
    }
}