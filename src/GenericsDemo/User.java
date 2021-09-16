package GenericsDemo;

public class User implements Comparable<User>{
    public int aime_score;
    public User(int score){
        this.aime_score =score;
        if (aime_score<0 || aime_score>15)
            throw new IllegalArgumentException("Invalid AIME score.");
    }

    @Override
    public int compareTo(User other) {
        return other.aime_score-aime_score;
    }

    @Override
    public String toString(){
        return "AIME Score: " + aime_score;
    }
}
