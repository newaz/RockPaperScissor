package self.shahriar.rps;

/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz
 * Factory class to create the two version Gameplay  of RPS
 */
public class GameVersionFactory {


    public static BasicGame createGameVersion(GameVersion version) {

        if(version.equals(GameVersion.CLASSIC) )
            return new FirstVersionRPS();

        else if(version.equals(GameVersion.BIG_BANG))
            return new SecondVersionRPS();

        return new BasicGame();

    }

}
