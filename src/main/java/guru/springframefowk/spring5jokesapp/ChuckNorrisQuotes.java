package guru.springframefowk.spring5jokesapp;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class ChuckNorrisQuotes {

    private List<String> quotes;
    public ChuckNorrisQuotes(){
        quotes = Arrays.asList(
                "Chuck Norris doesn’t read books. He stares them down until he gets the information he wants.",
                "ime waits for no man. Unless that man is Chuck Norris.",
                "Chuck Norris breathes air … five times a day.",
                "Chuck Norris’ tears cure cancer. Too bad he has never cried.",
                "If you ask Chuck Norris what time it is, he always says, ‘Two seconds till.’ After you ask, ‘Two seconds to what?’ he roundhouse kicks you in the face.",
                "Chuck Norris does not sleep. He waits.",
                "On the 7th day, God rested … Chuck Norris took over.",
                "Chuck Norris can dribble a bowling ball.",
                "Chuck Norris can build a snowman out of rain.");
    }
    public String getRandomQuote(){
        return quotes.get(ThreadLocalRandom.current().nextInt(0,quotes.size()));
    }
}
