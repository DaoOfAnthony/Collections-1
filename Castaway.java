
/**
 * Write a description of class Castaways here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Castaway
{
    private String lastName;
    private String firstName;
    private int score;
    private String gender;

    /**
     * Constructor for objects of class Castaways
     * 
     * @param  lastName  the last name of the castaway
     * @param  firstName  the first name of the castaway
     * @param  score  the score of the castaway
     * @param  gender  the gender of the castaway
     */
    public Castaway(String lastName, String firstName, int score
            , String gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.score = score;
        this.gender = gender;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  other  the castaway to compare
     * @return        0 if they are the same and the difference between 
     * letters if they are different
     */
    public int compareTo(Castaway other) {
        
        if(lastName.compareTo(other.lastName)!=0){
            return lastName.compareTo(other.lastName);
        } else if(firstName.compareTo(other.firstName)!=0) {
            return firstName.compareTo(other.firstName);
        } else {
            return 0;
        }
    }
    
    public boolean equals(Castaway other) {
        if(compareTo(other) != 0){
            return false;
        } else {
            return true;
        }
    }
}
