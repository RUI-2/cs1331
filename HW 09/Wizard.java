//I worked on the homework assignment alone, using only course materials.
import java.util.Random;
/**
 * This class represents a Wizard
 * @author Ruirui Ma
 * @version 1.0
 */
public class Wizard {
    protected String name;
    protected int health;
    protected int maxHealth;
    protected int attackPower;
    protected String favColor;
    protected static Spell spell1 = new Spell("Wingardium Leviosa", 0);
    protected Spell[] spellBook;
    private static Spell[] defaultSpellBook = {spell1};
    private static Random rand = new Random();
    /**
     * Constructor to create a wizard object
     * @param cName The name of the wizard
     * @param cFavColor The favorite color of the wizard
     * @param cAttackPower The attack power of the wizard
     * @param cMaxHealth The max health of the wizard
     * @param cSpellBook The spellBook of the wizard
     */
    public Wizard(String cName, String cFavColor, int cMaxHealth, int cAttackPower, Spell[] cSpellBook) {
        this.name = cName;
        this.favColor = cFavColor;
        this.maxHealth = cMaxHealth;
        this.attackPower = cAttackPower;
        health = maxHealth;
        spellBook = cSpellBook;
    }

    /**
     * Constructor to create a wizard object, set to default maxhealth(25) and default spellBook
     * @param cName The name of the wizard
     * @param cFavColor The favorite color of the wizard
     * @param cAttackPower The attack power of the wizard
     */
    public Wizard(String cName, String cFavColor, int cAttackPower) {
        this(cName, cFavColor, 25, cAttackPower, defaultSpellBook);
    }

    /**
     * Constructor to create a wizard object, the spellBook is set to default spellBook
     * @param cName The name of the wizard
     * @param cFavColor The favorite color of the wizard
     * @param cAttackPower The attack power of the wizard
     * @param cMaxHealth The max health of the wizard
     */
    public Wizard(String cName, String cFavColor, int cMaxHealth, int cAttackPower) {
        this(cName, cFavColor, cMaxHealth, cAttackPower, defaultSpellBook);
    }

    /**
     * Constructor to create a wizard object, the default max health is set to 25
     * @param cName The name of the wizard
     * @param cFavColor The favorite color of the wizard
     * @param cAttackPower The attack power of the wizard
     * @param cSpellBook The spellBook of the wizard
     */
    public Wizard(String cName, String cFavColor, int cAttackPower, Spell[] cSpellBook) {
        this(cName, cFavColor, 25, cAttackPower, cSpellBook);
    }

    /**
     * @return a string explaining the attributes of the wizard
     */
    public String toString() {
        return (name + " wishes to join the " + favColor + " house at Hogwarts!"
                + " They have " + health + " health points and " + attackPower
                + " attack power.");
    }

    /**
     * This method specifies the duel process
     * @param wizard1 The first wizard in the duel
     * @param wizard2 The second wizard in the duel
     */
    public static void duel(Wizard wizard1, Wizard wizard2) {
        Wizard lessWizard;
        Wizard attackerWizard;
        Wizard suckerWizard;
        Spell attackSpell;
        while (wizard1.getHealth() >= 0 && wizard2.getHealth() >= 0) {
            if (wizard1.getHealth() < wizard2.getHealth()) {
                lessWizard = wizard1;
            } else {
                lessWizard = wizard2;
            }
            int potionNum;
            potionNum = rand.nextInt(5);
            if (potionNum == 2) {
                if (lessWizard.getHealth() <= lessWizard.getMaxHealth() - 3) {
                    lessWizard.heal();
                    System.out.println(lessWizard.getName() + " drinks an invigoration potion and restores 3 health! "
                                       + lessWizard.getName() + " now has " + lessWizard.getHealth() + " health.");
                } else {
                    lessWizard.health = lessWizard.getMaxHealth();
                    System.out.println(lessWizard.getName() + " drinks an invigoration potion and restores 3 health! "
                                       + lessWizard.getName() + " now has " + lessWizard.getHealth() + " health.");
                }
            }
            if (wizard1.health < wizard2.health) {
                attackerWizard = wizard1;
                suckerWizard = wizard2;
            } else {
                attackerWizard = wizard2;
                suckerWizard = wizard1;
            }
            attackSpell = attackerWizard.castSpell();
            suckerWizard.health -= (attackSpell.getAttack() + attackerWizard.attackPower);
            if (suckerWizard.getHealth() <= 0) {
                System.out.println(attackerWizard.getName() + " casts " + attackSpell.getName() + " and deals "
                               + (attackSpell.getAttack() + attackerWizard.attackPower) + " damage. "
                               + suckerWizard.getName() + " now has " + "0 health.");
                System.out.println(suckerWizard.getName() + " falls to the ground. " + attackerWizard.getName()
                                   + " wins the duel!");
                attackerWizard.restore();
                suckerWizard.restore();
                break;
            }
            System.out.println(attackerWizard.getName() + " casts " + attackSpell.getName() + " and deals "
                               + (attackSpell.getAttack() + attackerWizard.attackPower) + " damage. "
                               + suckerWizard.getName() + " now has " + suckerWizard.getHealth() + " health.");
        }
    }

    /**
     * This method specifies the interaction between two wizards
     * @param wizard1 The first wizard in the interaction
     * @param wizard2 The second wizard in the interaction
     */
    public static void interact(Wizard wizard1, Wizard wizard2) {
        System.out.println(wizard1.getName() + ": Hey " + wizard2.getName() + ", let's be friends!");
        duel(wizard1, wizard2);
    }

    /**
     * This method helps the wizard to choose spell
     * @return The spell the wizard chooses to use
     */
    public Spell castSpell() {
        int spellNum = rand.nextInt(spellBook.length);
        return spellBook[spellNum];
    }

    /**
     * This method returns the name of the wizard
     * @return The name of the wizard
     */
    public String getName() {
        return name;
    }

    /**
     * This method returns the health of the wizard
     * @return The health of the wizard
     */
    public int getHealth() {
        return health;
    }

    /**
     * This method returns the max health of the wizard
     * @return The max health of the wizard
     */
    public int getMaxHealth() {
        return maxHealth;
    }

    /**
     * This method restores the health of the wizard
     */
    public void restore() {
        health = maxHealth;
    }

    /**
     * This method heals the wizard
     */
    public void heal() {
        this.health += 3;
    }

}