public class Fan implements Audience{
    private String suportedTeam;

    public Fan(String suportedTeam) {
        this.suportedTeam = suportedTeam;
    }

    public void reactPositively() {
        
    }

    public void reactNegatively() {
    }

    @Override
    public void react(String whichTeam) {
        if (suportedTeam.toLowerCase().equals(whichTeam.toLowerCase())) {
            reactPositively();
        } else {
            reactNegatively();
        }
    }
}
