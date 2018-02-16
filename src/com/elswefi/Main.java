package com.elswefi;

public class Main {

    public static void main(String[] args) {

        System.out.print("we are making a new pez dispenser !\n");
        System.out.printf("there are %d pez allowed in the dispenser \n",
                PezDispenser.MAX_PEZ);

        PezDispenser dispenser = new PezDispenser("donatello");
        System.out.printf("this is a %s pez dispenser !\n", dispenser
                .getmCharacterName());

        if (dispenser.isImpty()) {
            System.out.print("the dispenser is empty !\n");
        }
        /*String before = dispenser.swapTheHead("darth vader");
        System.out.printf("it was %s but chris made it  %s ", before, dispenser
                .getmCharacterName());*/

        System.out.printf("filling the dispenser out ....\n");
        dispenser.fill();

        if (!dispenser.isImpty()) {
            System.out.print("the dispenser if full !\n");
        }
        while (dispenser.dispense()){
            System.out.print("chomp!\n");
        }
        if (dispenser.isImpty()){
            System.out.print("ate all the pez !");
        }
        dispenser.fill(4);
        dispenser.fill(3);

        while (dispenser.dispense()){
            System.out.print("chomp!!\n");
        }
        if (dispenser.isImpty()) {
            System.out.print("ate all the pez !\n");
        }
        try {
            dispenser.fill(400);
            System.out.print("this line will never happen !");
        } catch (IllegalArgumentException iae) {
            System.out.print("whoa there !! ");
            System.out.printf("that's %s",iae.getMessage());
        }

    }
}
