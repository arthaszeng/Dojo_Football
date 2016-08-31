import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class GameTest {

    private Fan fanA;
    private Fan fanB;
    private Reporter reporter;
    private Game game;

    @Before
    public void setUp() throws Exception {
        fanA = mock(Fan.class);
        fanB = mock(Fan.class);
        Power
        reporter = mock(Reporter.class);
        game = new Game();
        game.registerAudience(reporter);
        game.registerFanA(fanA);
        game.registerFanB(fanB);

    }

    @Test
    public void shouldReactWhenGameHasAGoal() throws Exception {
        game.goalHappens("A");

        verify(reporter, times(1)).react("A");
    }

    @Test
    public void FansShouldReactCorrectlyWhenTeamAScores() throws Exception {

        game.goalHappens("A");

        verify(fanA, times(1)).reactPositively();
        verify(fanB, times(1)).reactNegatively();
    }

    @Test
    public void FansShouldReactCorrectlyWhenTeamBScores() throws Exception {

        game.goalHappens("B");

        verify(fanA, times(1)).reactNegatively();
        verify(fanB, times(1)).reactPositively();
    }
}
