public class studentid {
    private int age;
    private String name;
    private double amc_12_score;
    private int aime_score;


    public studentid(double amc_12_score, int aime_score){
        setAmc_12_Score(amc_12_score);
        setAime_score(aime_score);
    }


    public void setAmc_12_Score(double score) {
        if (score <= 0)
            throw new IllegalArgumentException("AMC Score cannot be zero or less.");
          this.amc_12_score = score;
    }


    private double getAmc_12_score() {
        return amc_12_score;
    }

    public void setAime_score(int aime_score) {
        if (aime_score < 0 || aime_score > 15)
            throw new IllegalArgumentException("AIME Score must be between 0 and 15.");

        this.aime_score = aime_score;
    }

    private int getAime_score() {
        return aime_score;
    }

    public double calculateIndex() {
        return aime_score * 10 + amc_12_score;
    }
}
