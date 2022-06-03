public class IntroductionTakeFour {

    public static void myName(String firstName, String middleName, String lastName){

       String fullName = firstName + " " + middleName + " " + lastName;
    
       System.out.println(fullName);
    
    }

    public static void hobbies(String favSport, String favSportTwo, String insutrment) {

     String myHobbies = favSport + ", " + favSportTwo + ", " + insutrment;

     System.out.println(myHobbies);


    }

    public static void favFoods(String food, String drink, String snack) {

        String myFavFoods = food + " " + drink + " " + snack;
        
        System.out.println(myFavFoods);
    }

    public static void todaysTea (String myTeaToday) {

        myTeaToday = "Oolong";

        switch (myTeaToday) {

            case "Decaf Green":
            System.out.println("Hopefully I won't get drunk");
            break;
        
            case "Jasmine Green":
            System.out.println("My favorite");
            break;

            case "Oolong":
            System.out.println("I love how rich and earthy oolong tea is");
            break;

            case "Peppermint":
            System.out.println("You must be awufully tired");
            break;
            
            default:
            System.out.println("You have no tea. Disgraceful. Go make yourself a cup");


        }

    }


public static void main(String[] args) {


    System.out.println("Now let me introduce myself");
    System.out.println("My name is ");
    myName("Courtney", "Ping", "Giroux");

    System.out.println("I'm making this so i can procrastinate from homework.");

    System.out.println("Some of my hobbies are ");
    hobbies("Golf", "Skiing", "Flute");
    System.out.println("And, well, also procrastinating.");

    System.out.println("Some of my favoirte things to eat are");
    favFoods("Ramen", "Tea", "Goldfish");
    System.out.println("We can't forget, goldfish are the revolution.");

    System.out.println("My tea for today is ");
    todaysTea("Oolong");

}

        
}