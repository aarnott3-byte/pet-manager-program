import java.util.Scanner;

public class PetProgram {


   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);

      // Step 2: Get initial pet info from the user
      System.out.print("Enter your pet's name: ");
      String name = scnr.nextLine();

      System.out.print("Enter your pet's type (e.g., dog, cat, etc.): ");
      String type = scnr.nextLine();

      System.out.print("Enter your pet's age (as an integer): ");
      int age = scnr.nextInt();
      scnr.nextLine(); // clear newline

      // Step 3: Create Pet object
      Pet myPet = new Pet(name, type, age);

      int choice = 0;

      // Step 5: Loop until user chooses to exit
      while (choice != 4) {
         System.out.println();
         System.out.println("----- Pet Menu -----");
         System.out.println("1) View pet information");
         System.out.println("2) Update pet information (type and age)");
         System.out.println("3) Change pet name");
         System.out.println("4) Exit");
         System.out.print("Choose an option (1-4): ");

         if (scnr.hasNextInt()) {
            choice = scnr.nextInt();
            scnr.nextLine();
         } else {
            
            System.out.println("Invalid input. Please enter a number from 1 to 4.");
            scnr.nextLine(); 
            continue;
         }

         System.out.println();

         
         if (choice == 1) {
            // View pet info
            System.out.println(myPet.getInfo());
            System.out.println(myPet.moodStatus());
         }
         else if (choice == 2) {
            // Update type and age
            System.out.print("Enter your pet's new type: ");
            String newType = scnr.nextLine();
            myPet.setType(newType);

            System.out.print("Enter your pet's new age: ");
            int newAge = scnr.nextInt();
            scnr.nextLine(); 
            myPet.setAge(newAge);

            System.out.println("Pet information updated.");
         }
         else if (choice == 3) {
            // Change name only
            System.out.print("Enter your pet's new name: ");
            String newName = scnr.nextLine();
            myPet.setName(newName);
            System.out.println("Pet name updated.");
         }
         else if (choice == 4) {
            // Exit
            System.out.println("Exiting program. Goodbye!");
         }
         else {
            System.out.println("Invalid option. Please choose 1-4.");
         }
      }

      scnr.close();
   }
}
