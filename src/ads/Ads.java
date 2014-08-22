package ads;

import java.util.Scanner ;

public class Ads
{

  public static void main(String[] args)
  {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Give letter for advertisement..:");
    
    int num_of_words = 0 ;
    int num_of_char = 0;
    int cost = 0;
    
    
    

    while (input.hasNext())
    {
      String next_word;
      next_word = input.next();
      
      //System.out.println("The word being process is: " + next_word);
      
      ++num_of_words;
      num_of_char+=next_word.length();
      
      if (num_of_char<=25)
    	  cost += 5;
      else if (num_of_char<=100)
    	  cost += 3.5;
      else
    	  cost +=2;
      
      //Το πρόβλημα με αυτό είναι ότι σταματάει ακόμα και αν υπάρχει κείμενο μετά την τελεία
      //αν το κείμενο αυτό διαχωρίζεται με τελεία
      if (next_word.charAt(next_word.length()-1) == '.' ) 
      {
        break;
      }
      
    }
    
    System.out.println("Number of characters: " + num_of_char);
    System.out.println("Number of words     : " + num_of_words);
    System.out.println("Total cost          : " + cost);
    System.out.println("Lines in average:   : " + Math.ceil( ((float)num_of_char)/11) );
    
    
    input.close();
    System.exit(0); 

  }

}
