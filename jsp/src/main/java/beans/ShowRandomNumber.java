package beans;

import java.util.Random;

public class ShowRandomNumber {
    public Long getRandomNumber(Long range){
        Random random = new Random(range);
        return random.nextLong();
    }
}
