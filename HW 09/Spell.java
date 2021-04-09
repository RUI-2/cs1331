//I worked on the homework assignment alone, using only course materials.
/**
 * This class extends the wizard class
 * @author Ruirui Ma
 * @version 1.0
 */
public class Spell {
    private String spellName;
    private int spellAttackPower;

    /**
     * Constructor to create a spell object
     * @param name The name of the spell
     * @param attackPower The attack power of the spell
     */
    public Spell(String name, int attackPower) {
        spellName = name;
        spellAttackPower = attackPower;
    }

    /**
     * The method returns a string explaining the attributes of the spell
     * @param spell The other spell
     * @return a string explaining the attributes of the spell
     */
    public String toString(Spell spell) {
        return (spellName + ": " + spellAttackPower + " attack power");
    }

    /**
     * The method compares if two spell is the same
     * @param other The other spell
     * @return a string explaining the attributes of the wizard
     */
    public boolean equals(Object other) {
        boolean result = false;
        if (other instanceof Spell) {
            Spell spell = (Spell) other;
            result = (this.spellName == spell.spellName)
                  && (this.spellAttackPower == spell.spellAttackPower);
        }
        return result;
    }

    /**
     * The method returns the attack power of the spell
     * @return the attack power of the spell
     */
    public int getAttack() {
        return spellAttackPower;
    }

    /**
     * The method returns the name of the spell
     * @return the name of the spell
     */
    public String getName() {
        return spellName;
    }
}