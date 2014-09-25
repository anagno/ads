package ads;

// Για να μπορούμε να χρησιμοποιήσουμε τον Scanner
import java.util.Scanner ;

public class Ads
{

  public static void main(String[] args)
  {
    
    Scanner input = new Scanner(System.in);
    
    System.out.println("Give letter for advertisement..:");
    
    
    // Μεταβλητή για να μετρά το σύνολο των λέξεων
    int num_of_words = 0 ;
    // Μεταβλητή για να μετρά το σύνολο των χαρακτήρων
    int num_of_char = 0;
    // Μεταβλητή για να μετρά το κόστος της διαφήμισης
    int cost = 0;
     
    // Στο while ελέγχεται αν υπάρχει επόμενη λέξη
    while (input.hasNext())
    {
      // Τοπική μεταβλητή που αποθηκεύει την επόμενη λέξη
      String next_word;
      
      // Αποθήκευση της επόμενης λέξης στην μεταβλητή next_word
      next_word = input.next();
      
      // Μήνυμα το οποίο δεν χρειάζεται και έδειχνε ποια λέξη επεξεργαζόταν
      // System.out.println("The word being process is: " + next_word);
      
      // Αύξηση του αριθμού των λέξεων κατά ένα
      ++num_of_words;
      
      // Αύξηση του αριθμού των χαρακτήρων κατά το μήκος της λέξης.
      num_of_char+=next_word.length();
      
      // Κοστολόγηση της λέξης ανάλογα με το μήκος των χαρακτήρων.
      if (num_of_char<=25)
    	  cost += 5;
      else if (num_of_char<=100)
    	  cost += 3.5;
      else
    	  cost +=2;
      
      // Εξετάζουμε αν το τελευταίο ψηφίο της επόμενης λέξης είναι τελεία και 
      // αν είναι σταματάμε το while.
      // Το πρόβλημα με αυτό είναι ότι σταματάει ακόμα και αν υπάρχει κείμενο 
      //μετά την τελεία αν το κείμενο αυτό διαχωρίζεται με κενό
      // Ακόμα αν η τελεία είναι από μόνη της μία λέξη αυξάνεται κατα ενα 
      // ο αριθμός των λέξεων.
      if (next_word.charAt(next_word.length()-1) == '.' ) 
      {
        // Αφαιρούμε έναν χαρακτήρα διότι έχουμε προσμετρήσει και την τελεία 
        // στους χαρακτήρες
        --num_of_char; 
        // Έξοδος από το while
        break;
      }
      
    }
    
    // Εκτύπωση των μεταβλητών
    System.out.println("Number of characters: " + num_of_char);
    System.out.println("Number of words     : " + num_of_words);
    System.out.println("Total cost          : " + cost);
    
    // Εκτύπωση των γραμμών που πιάνει η αγγελία. Γίνεται στρογγυλοποίηση στον μικρότερο
    // ακέραιο που είμαι μεγαλύτερος ή ίσως με το αποτέλεσμα, αφού δεν έχει νόημα να 
    // πούμε ότι πιάνει μισή γραμμή.
    System.out.println("Lines in average:   : " + Math.ceil( ((float)num_of_char)/11) );
    
    
    input.close();
    System.exit(0); 

  }

}
