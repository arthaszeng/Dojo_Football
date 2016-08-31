public class Fan implements Audience{
    private String supportedTeam;
    private MessagePrinter messagePrinter;

    public Fan(MessagePrinter messagePrinter) {
        this.messagePrinter = messagePrinter;
    }

    public void reactPositively() {
        messagePrinter.print("HA");
    }

    public void reactNegatively() {
        messagePrinter.print("WU");
    }

    @Override
    public void react(String whichTeam) {
        if (supportedTeam.toLowerCase().equals(whichTeam.toLowerCase())) {
            reactPositively();
        } else {
            reactNegatively();
        }
    }

    public void chooseTeam(String teamName) {
        this.supportedTeam = teamName;
    }
}
