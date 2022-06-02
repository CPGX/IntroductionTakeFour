public class IntroductionTakeFour {

    public static void myName(String firstName, String middleName, String lastName){

       String fullName = firstName + " " + middleName + " " + lastName;
    
       System.out.println(fullName);
    
    }

    public static void hobbies(String favSport, String favSportTwo, String insutrment) {

     String myHobbies = favSport + ", " + favSportTwo + ", " + insutrment;

     System.out.println(myHobbies);


    }


public static void main(String[] args) {


    System.out.println("Now let me introduce myself");
    System.out.println("My name is ");
    myName("Courtney", "Ping", "Giroux");

    System.out.println("I'm making this so i can procrastinate from homework.");

    System.out.println("Some of my hobbies are ");
    hobbies("Golf", "Skiing", "Flute");
    System.out.println("And, well, also procrastinating.");

    

}

        
}