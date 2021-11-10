package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {

    public static  void main(String[] args) {
	// write your code here
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("enter number of element ");
        int listLength = getInt();
        for (int i = 0; i < listLength; i++) {

            System.out.println("add number to list:");
            list.add(getInt());

        }


    }
    public static int getInt(){
        Scanner input = new Scanner(System.in);
        int number = 0;
        try{
            number = input.nextInt();
        }
        catch(Exception e){
            System.out.println("not a integer input "+ e);
            input.nextInt();
        }
        return number;
    }

    public static int maxMirror(ArrayList<Integer> list){
        int max = 0;
        int count = 0;
        ArrayList<Integer>mirror = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            mirror.add(list.get(i));
        }
        Collections.reverse(mirror);
        for (int i = 0; i < list.size(); i++) {
            
        }
    }
}
