package demo.innerclasses;

import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static Button btnPrint = new Button("Print");

    private static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = in.nextInt();
            in.nextLine();
            switch(choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                btnPrint.onClick();
            }
        }
    }
    
    public static void main(String[] args) {

        btnPrint.setOnClickListener(new Button.OnClickListener() {

			@Override
			public void onClick(String title) {
				System.out.println("I have been clicked");
				
			}
            
        });
        listen();


        
        // GearBox mcLaren = new GearBox(6);
        // mcLaren.operateClutch(true);
        // mcLaren.changeGear(1);
        // mcLaren.operateClutch(false);
        // System.out.println(mcLaren.wheelSpeed(1000));
        // mcLaren.changeGear(2);
        // System.out.println(mcLaren.wheelSpeed(3000));
        // mcLaren.operateClutch(true);
        // mcLaren.changeGear(3);
        // mcLaren.operateClutch(false);
        // System.out.println(mcLaren.wheelSpeed(6000));
    }

    
}
