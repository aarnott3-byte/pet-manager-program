public class Pet {

   // Instance variables
   private String name;
   private String type;
   private int age;

   // No-argument constructor
   public Pet() {
      name = "Unknown";
      type = "Unknown";
      age = 0;
   }

   // Constructor with parameters
   public Pet(String name, String type, int age) {
      this.name = name;
      this.type = type;
      this.age = age;
   }

   // Getters
   public String getName() {
      return name;
   }

   public String getType() {
      return type;
   }

   public int getAge() {
      return age;
   }

   // Setters
   public void setName(String newName) {
      name = newName;
   }

   public void setType(String newType) {
      type = newType;
   }

   public void setAge(int newAge) {
      age = newAge;
   }

   // Returns a formatted String with all pet info
   public String getInfo() {
      return "Pet Name: " + name + "\n"
           + "Pet Type: " + type + "\n"
           + "Pet Age: " + age;
   }


   public String moodStatus() {
      if (age <= 1) {
         return "Your pet is energetic and playful!";
      }
      else if (age <= 7) {
         return "Your pet is calm and loves to play and explore.";
      }
      else {
         return "Your pet is older and enjoys relaxing and taking naps.";
      }
   }
}
