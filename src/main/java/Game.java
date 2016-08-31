import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Audience> audienceList = new ArrayList<>();


    public void goalHappens(String whichTeam) {
        notify(whichTeam);
    }

    private void notify(String whichTeam) {
        for (Audience audience : audienceList) {
            audience.react(whichTeam);
        }
    }

    public void registerAudience(Audience audience) {
        audienceList.add(audience);
    }
}
