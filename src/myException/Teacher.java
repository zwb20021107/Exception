package myException;

public class Teacher {
    public void checkScore(int score) throws ScoreException{
        if(score < 0 || score > 100)
            throw new ScoreException("你给的分数有误，分数应该再0-100");
        else
            System.out.println("");
    }
}
