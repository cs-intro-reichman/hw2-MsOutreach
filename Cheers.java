//feedback

/*
Great work boaz!
*/


// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
	    // Replace this comment with your code
                int number = Integer.parseInt(args[1]);
                String cheer = args[0];

            for ( int i=0; i<cheer.length(); i++){
               char upper = Character.toUpperCase(cheer.charAt(i));
                if (upper == ('A') || upper == ('E') || upper == ('F') || upper == ('H') || upper == ('I') || upper == ('L')|| upper == ('M')|| upper == ('N')|| upper == ('O')|| upper == ('R')|| upper == ('S')|| upper == ('X')){
                    System.out.println("Give me an "+ upper + ": " + upper + "!");
                }
                else {
                System.out.println("Give me a  "+ upper + ": " + upper + "!");
            }
        }
        System.out.println("What does that spell? ");

        for (int j = number ; j > 0 ; j--) {
            String uppercheer = cheer.toUpperCase();
            System.out.println(uppercheer + "!");
                }
        
        }
 }
