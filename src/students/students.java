package students;

/**
 * Created by yleanavlaun on 11/29/16.
 */
class students {
    public String firstName;
    public String lastName;
    public int score;

    students(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;

    }

    void changeScore(int newScore) {
        if(1 < newScore || newScore > 100) {
            throw new IllegalArgumentException("Score must be a number between 1 and 100");
        }
        score = newScore;
    }
}
