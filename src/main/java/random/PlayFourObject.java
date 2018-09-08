package random;

import java.util.Objects;

public class PlayFourObject {

    private int score;

    public void four()
    {
        score += 4;

    }
    public void six()
    {
        score += 6;
    }
    public int getScore()
    {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayFourObject that = (PlayFourObject) o;
        return score == that.score;
    }

    @Override
    public int hashCode() {

        return Objects.hash(score);
    }
}
