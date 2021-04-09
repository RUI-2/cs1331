public class Test{
	public static void main(String[] args) {
		Pokedex myPokedex = new Pokedex(); 
		// PokemonSpecies carl = new PokemonSpecies("Carl", 1, "Head TA", "Its Mixtapes are said to be too hot for the average listener"); 
		// System.out.println(carl); // 1: Carl, the Head TA Pokemon. Its Mixtapes are said to be too hot for the average listener. 
		// PokemonSpecies karl = new PokemonSpecies("Karl", 2, "Spooky TA", "It is said Karl can be found lurking in Klaus during spooktober"); 
		// PokemonSpecies qarl = new PokemonSpecies("Qarl", 3, "Checkstyle TA", "Qarl likes to remind students to checkstyle their work"); 
		PokemonSpecies a = new PokemonSpecies("a", 1, "Checkstyle TA", "Q");
		PokemonSpecies c = new PokemonSpecies("c", 3, "Checkstyle TA", "Q");
		PokemonSpecies j = new PokemonSpecies("j", 10, "Checkstyle TA", "Q");
		PokemonSpecies e = new PokemonSpecies("e", 5, "Checkstyle TA", "Q");
		PokemonSpecies f = new PokemonSpecies("f", 6, "Checkstyle TA", "Q");
		PokemonSpecies g = new PokemonSpecies("g", 7, "Checkstyle TA", "Q");
		PokemonSpecies h = new PokemonSpecies("h", 8, "Checkstyle TA", "Q");
		PokemonSpecies d = new PokemonSpecies("d", 4, "Checkstyle TA", "Q");
		PokemonSpecies b = new PokemonSpecies("b", 2, "Checkstyle TA", "Q");
		PokemonSpecies i = new PokemonSpecies("i", 9, "Checkstyle TA", "Q");
		PokemonSpecies k = new PokemonSpecies("k", 11, "Checkstyle TA", "Q");
		//System.out.println(qarl.compareTo(karl)); // positive number  
		myPokedex.addToDex(b);
		myPokedex.addToDex(a);
		myPokedex.addToDex(c);
		myPokedex.addToDex(d);
		myPokedex.addToDex(f);
		myPokedex.addToDex(g);
		myPokedex.addToDex(h); 
		myPokedex.addToDex(e);
		myPokedex.addToDex(i);
		myPokedex.insertionSort(); 
		System.out.println(myPokedex.entries.get(0));
		System.out.println(myPokedex.entries.get(1));
		System.out.println(myPokedex.entries.get(2));
		System.out.println(myPokedex.entries.get(3));
		System.out.println(myPokedex.entries.get(4));
		System.out.println(myPokedex.binarySearch(d));
		//System.out.println(myPokedex.binarySearch(carl)); // 0
		//System.out.println(myPokedex.binarySearch(karl)); // 1
		//System.out.println(myPokedex.binarySearch(qarl)); // 2
		// Pokedex secondPokedex = new Pokedex(); 
		// secondPokedex.addToDex(qarl); 
		// secondPokedex.addToDex(carl);
		// secondPokedex.addToDex(karl); 
		// secondPokedex.selectionSort(); 
		//System.out.println(myPokedex.binarySearch(carl)); // 0
		//System.out.println(myPokedex.binarySearch(karl)); // 1
		//System.out.println(myPokedex.binarySearch(qarl)); // 2
		//System.out.println(myPokedex.equals(secondPokedex)); // true
		//System.out.println(myPokedex);
	}
}