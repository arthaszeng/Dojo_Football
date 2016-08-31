import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameTest {

    private Fan fan;
    private Reporter reporter;
    private Game game;

    @Before
    public void setUp() throws Exception {

        game = new Game();

        fan = mock(Fan.class);
        reporter = mock(Reporter.class);

        game.registerAudience(reporter);
        game.registerAudience(fan);
    }

    @Test
    public void reporterShouldReactWhenGameHasAGoal() throws Exception {

        game.goalHappens("A");

        verify(reporter, times(1)).react("A");
    }

    @Test
    public void FansShouldReactWhenGameHasAScores() throws Exception {

        String whichTeam = anyString();

        game.goalHappens(whichTeam);

        verify(fan, times(1)).react(whichTeam);
    }

}
