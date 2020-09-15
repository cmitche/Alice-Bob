import java.util.Scanner;

public class AliceAndBob {
    //I created a method to print out the error message for FUN / Practice!
    //I realize that this method is extra code and could easily be executed in main method.
    public static String greeting(String name){
        //create greeting components.
        String welcome = "Greetings";
        String space = " ";
        String exclamation = "!";
        //return the completed sentence.
        return welcome + space + name + exclamation;
        //done!
    }
    //I created a method to print out the error message for FUN / Practice!
    //I realize that this method is extra code and could easily be executed in main method.
    public static void errorMessage(){
        //enter error message.
        System.out.println("Sorry, we do not recognize the name you entered. Please try again.");
        //done!
    }

    public static void aliceAndBob(){
        String namePrompt = "Please enter your name below:";
        System.out.println(namePrompt);
        String userInput = "";
        Scanner scanner = new Scanner(System.in);
        String name1 = "Alice";
        String name2 = "Bob";
        String welcome = "Greetings";
        boolean correctName = false;
        //Created an attempt holder.
        int attemptCounter = 0;

        while (correctName == false){
            userInput = scanner.nextLine();
            if(userInput.equalsIgnoreCase(name1)){
                //System.out.println(welcome + " " + name1 + "!");
                //invoke "greeting" + add correct name.
                System.out.println(greeting(name1));
                correctName = true;
            }
            else if(userInput.equalsIgnoreCase(name2)){
                //System.out.println(welcome + " " + name2 + "!");
                //invoke "greeting" + add correct name.
                System.out.println(greeting(name2));
                correctName = true;
            }
            else{
                //print error message
                errorMessage();
                correctName = false;
                //Implement attempt counter
                String wrongAttemptsMessage = "Wrong attempts: ";
                //Increment the attempt counter.
                attemptCounter++;
                System.out.println(wrongAttemptsMessage + attemptCounter);
            }
        }
    }

    public static void main(String[] args) {
        aliceAndBob();
    }
}
