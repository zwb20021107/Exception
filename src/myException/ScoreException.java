package myException;

public class ScoreException extends Exception{
    public ScoreException() {
    }

    public ScoreException(String message) {
        super(message);
    }
}
