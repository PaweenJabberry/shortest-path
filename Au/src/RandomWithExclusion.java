import java.util.List;
import java.util.Random;

public class RandomWithExclusion
{
    public int getRandomWithExclusion(Random rnd, int start, int end, List<Integer> exclude)
    {
        int random = start + rnd.nextInt(end - start + 1 - exclude.size());
        for (int ex : exclude) {
            if (random < ex) {
                break;
            }
            random++;
        }
        return random;
    }
}
