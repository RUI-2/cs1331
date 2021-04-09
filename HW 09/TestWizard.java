public class TestWizard {
	public static void main(String[] args) {
		Spell spell1 = new Spell("Wingardium Leviosa", 0);
		Spell spell2 = new Spell("Biubiubiu", 3);
    	Spell spell3 = new Spell("Hahaha", 2);
    	Spell spell4 = new Spell("Pimba", 1);
    	Spell spell5 = new Spell("Flipendo", 1);
    	Spell[] noSpell = {spell1};
    	Spell[] defaultSpellBook = {spell1, spell2, spell3, spell4, spell5};
		Wizard wizard1 = new Gryffindor("Harry");
		Wizard wizard2 = new Slytherin("Jason");
		Wizard wizard3 = new Wizard("Hermione", "RED", 34, 5, defaultSpellBook);
		Wizard.interact(wizard3, wizard1);
	}
} 