//I worked on the homework assignment alone, using only course materials.
import java.util.Random;
/**
 * This class extends the wizard class
 * @author Ruirui Ma
 * @version 1.0
 */
public class Gryffindor extends Wizard {
    private static Spell spell2 = new Spell("Expecto Patronum", 3);
    private static Spell spell3 = new Spell("Expelliarmus", 2);
    private static Spell spell4 = new Spell("Ridikkulus", 1);
    private static Spell[] defaultSpellBook = {spell1, spell2, spell3, spell4};
    private static Random rand = new Random();

    /**
     * Constructor to create a Gryffindor wizard object, the spellBook is set to default spellBook
     * @param cName The name of the wizard
     */
    public Gryffindor(String cName) {
        super(cName, "scarlet", 25 + rand.nextInt(6), 4 + rand.nextInt(3), defaultSpellBook);
    }

    /**
     * Constructor to create a Gryffindor wizard object
     * @param cName The name of the wizard
     * @param cSpellBook The spellBook of the wizard
     */
    public Gryffindor(String cName, Spell[] cSpellBook) {
        super(cName, "scarlet", 25 + rand.nextInt(6), 4 + rand.nextInt(3), cSpellBook);
    }

    @Override
    /**
     * This method randomly select a spell for the Gryffindor wizard
     * @return The spell the wizard chooses to use
     */
    public Spell castSpell() {
        int spellNum = rand.nextInt(spellBook.length);
        return spellBook[spellNum];
    }

    @Override
     /**
     * This method heals the wizard
     */
    public void heal() {
        this.health += 3;
    }

}