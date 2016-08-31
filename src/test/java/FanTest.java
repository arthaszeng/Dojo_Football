import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class FanTest {

    private final String POSITIVE = "HA";
    private final String NEGATIVE = "WU";
    private final String teamA = "teamA";
    private final String teamB = "teamB";
    private MessagePrinter messagePrinter;
    private Fan fan;

    @Before
    public void setUp() throws Exception {
        messagePrinter = mock(MessagePrinter.class);
        fan = new Fan(messagePrinter);
    }

    @Test
    public void shouldReactPositivelyWhenSupportedTeamHasAGoal() throws Exception {
        fan.chooseTeam(teamA);
        
        fan.react(teamA);

        verify(messagePrinter, times(1)).print(POSITIVE);
    }

    @Test
    public void shouldReactNegativelyWhenOpponentTeamHasAGoal() throws Exception {
        fan.chooseTeam(teamA);

        fan.react(teamB);

        verify(messagePrinter, times(1)).print(NEGATIVE);
    }
}
