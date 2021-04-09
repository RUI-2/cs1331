//I worked on the homework assignment alone, using only course materials.
import java.util.Random;
/**
 * This class extends the wizard class
 * @author Ruirui Ma
 * @version 1.0
 */
public class Slytherin extends Wizard {
    private static Spell spell2 = new Spell("Expulso", 3);
    private static Spell spell3 = new Spell("Levicorpus", 2);
    private static Spell spell4 = new Spell("Oppugno", 1);
    private static Spell spell5 = new Spell("Flipendo", 1);
    private static Spell[] defaultSpellBook = {spell1, spell2, spell3, spell4, spell5};
    private static Random rand = new Random();

    /**
     * Constructor to create a Slytherin wizard object
     * @param cName The name of the Slytherin wizard
     * @param cSpellBook The spellBook of the wizard
     */
    public Slytherin(String cName, Spell[] cSpellBook) {
        super(cName, "green", 22 + rand.nextInt(6), 5 + rand.nextInt(3), cSpellBook);
    }

    /**
     * Constructor to create a Slytherin wizard object
     * @param cName The name of the Slytherin wizard
     */
    public Slytherin(String cName) {
        super(cName, "green", 22 + rand.nextInt(6), 5 + rand.nextInt(3), defaultSpellBook);
    }

    @Override
    /**
     * This method randomly select a spell for the Slytherin wizard
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