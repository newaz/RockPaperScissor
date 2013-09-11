package self.shahriar.models;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import self.shahriar.rps.Result;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



/**
 * Created with IntelliJ IDEA.
 * User: shahriarnewaz

 */
public class ItemTest {

    Rock rock;
    Paper paper;
    Scissor scissor;
    Lizard lizard;
    Spock spock;

    @Before
    public   void setUp() {
        rock = new Rock(1);
        paper = new Paper(2);
        scissor = new Scissor(3);
        lizard = new Lizard(3);
        spock  = new Spock(5);

    }

    @After
    public void tearDown() throws Exception {
        rock = null;
        paper = null;
        scissor = null;
        lizard = null;
        spock  = null;

    }

    @Test
    public void rockBeatsPaper() throws Exception {

        assertTrue(rock.beats(paper).equals(Result.LOST));
    }


    @Test
    public void rockBeatsScissor() throws Exception {

        assertTrue(rock.beats(scissor).equals(Result.WON));
    }



    @Test
    public void rockBeatsLizard() throws Exception {

        assertTrue(rock.beats(lizard).equals(Result.WON));
    }


    @Test
    public void rockBeatsSpock() throws Exception {

        assertTrue(rock.beats(spock).equals(Result.LOST));
    }



    @Test
    public void paperBeatsRock() throws Exception {

        assertTrue(paper.beats(rock).equals(Result.WON));
    }


    @Test
    public void paperBeatsSpock() throws Exception {

        assertTrue(paper.beats(spock).equals(Result.WON));
    }


    @Test
    public void paperBeatsScissorWhichIsNull(){

        assertTrue(paper.beats(null).equals(Result.NO_RESULT));
    }


    @Test
    public void paperBeatsScissor() throws Exception {

        assertFalse(paper.beats(scissor).equals(Result.WON));
    }


    @Test
    public void PaperBeatsLizardShouldFail() throws Exception {

        assertFalse(paper.beats(lizard).equals(Result.WON));
    }

    @Test
    public void ScissorBeatsLizard() throws Exception {

        assertTrue(scissor.beats(lizard).equals(Result.WON));
    }


    @Test
    public void ScissorBeatsSpock() throws Exception {

        assertFalse(scissor.beats(spock).equals(Result.WON));
    }


    @Test
    public void ScissorBeatsPaper() throws Exception {

        assertTrue(scissor.beats(paper).equals(Result.WON));
    }


    @Test
    public void ScissorBeatsRock() throws Exception {

        assertFalse(scissor.beats(rock).equals(Result.WON));
    }


    @Test
    public void LizardBeatsPaper() throws Exception {
        assertTrue(lizard.beats(paper).equals(Result.WON));
    }


    @Test
    public void LizardBeatsRock() throws Exception {
        assertFalse(lizard.beats(rock).equals(Result.WON));
    }

    @Test
    public void LizardBeatsScissor() throws Exception {
        assertFalse(lizard.beats(scissor).equals(Result.WON));
    }


    @Test
    public void LizardBeatsSpock() throws Exception {
        assertTrue(lizard.beats(spock).equals(Result.WON));
    }




    @Test
    public void SpockBeatsRock() throws Exception {
        assertTrue(spock.beats(rock).equals(Result.WON));
    }

    @Test
    public void SpockBeatsPaper() throws Exception {
        assertFalse(spock.beats(paper).equals(Result.WON));
    }


    @Test
    public void SpockBeatsScissor() throws Exception {
        assertTrue(spock.beats(scissor).equals(Result.WON));
    }

    @Test
    public void SpockBeatsLizard() throws Exception {
        assertFalse(spock.beats(lizard).equals(Result.WON));
    }




    @Test
    public void ScissorBeatsScissor() throws Exception {

        assertTrue(scissor.beats(scissor).equals(Result.DRAWN));
    }


}
