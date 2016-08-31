public class Game {

    Reporter reporter;
    private Fan fanA;
    private Fan fanB;

    public void goalHappens(String team) {
        fanA.react(team);
        fanB.react(team);

        reporter.react("A");
    }

    public void registerAudience(Reporter reporter) {
        this.reporter = reporter;
    }

    public void registerFanA(Fan fan) {
        this.fanA = fan;
    }

    public void registerFanB(Fan fan) {
        this.fanB = fan;
    }
}
