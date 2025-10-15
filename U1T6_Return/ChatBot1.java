package U1T6_Return;

public class ChatBot1 {
    public static void main(String[] args) {
       /*ChatBot debbie = new ChatBot("debbie",67);
        debbie.greeting("Jason");
        debbie.weather();
        double meters = debbie.convertFeetToMeters(5);
        System.out.println("The feet converted to meters is : " + meters);
        debbie.favoriteNumber(69);
        int sum = debbie.addNumbers(1, 2, 3);
        System.out.println("The sum of the 3 numbers is : " + sum);
        String goodbye = debbie.goodbye();
        System.out.println(goodbye); */ 
        ChatBot debbie = new ChatBot("debbie",67);
        debbie.trivia();
        debbie.mathproblem();
        int difference = debbie.subtractNumbers(5, 2);
        System.out.println("Num1 minus Num2 is : " + difference);
        int product = debbie.multiplyNumbers(3, 3);
        System.out.println("Num1 multiplied by Num2 is : " + product);
        String random = debbie.Saysanything("I am debbie and I'm being controlled to say this");
        System.out.println(random);
        String game = debbie.faveGame("Roblox");
        System.out.println(game);
    }
}
