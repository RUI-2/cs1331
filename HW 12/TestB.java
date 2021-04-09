public class TestB {
    public static void main(String[] args) {
        Pokedex myPokedex = new Pokedex();
    PokemonSpecies carl = new PokemonSpecies("Carl", 8, "Head TA",
            "Its Mixtapes are said to be too hot for the average listener");
System.out.println(carl);
    // 1: Carl, the Head TA Pokemon. Its Mixtapes are said to be too hot for the average listener.
    PokemonSpecies karl = new PokemonSpecies("Karl", 4, "Spooky TA",
            "It is said Karl can be found lurking in Klaus during spooktober");
    PokemonSpecies qarl = new PokemonSpecies("Qarl", 7, "Checkstyle TA",
                "Qarl likes to remind students to checkstyle their work");
        PokemonSpecies Rey = new PokemonSpecies("Rey", 10, "Troll",
                "likes to beat his meat");
        PokemonSpecies Rylie = new PokemonSpecies("Rylie", 5, "nature",
                "history with lil yachty");
        PokemonSpecies Rodrigo = new PokemonSpecies("Rodrigo", 3, "cool guy",
                "does well on every test");
        PokemonSpecies Eunsan = Rey;
        System.out.println(qarl.compareTo(karl));
// positive number
        System.out.println(Rey.compareTo(Eunsan));
//0
        System.out.println(Rey.equals(Eunsan));
//true
        System.out.println(Rey.equals(Rylie));
        //false
        myPokedex.addToDex(karl);
        myPokedex.addToDex(qarl);
        myPokedex.addToDex(carl);
        myPokedex.addToDex(Rey);
        myPokedex.addToDex(Rylie);
        myPokedex.addToDex(Rodrigo);
        myPokedex.addToDex(Eunsan);

        myPokedex.insertionSort();

        System.out.println(myPokedex.binarySearch(carl));
// 0
        System.out.println(myPokedex.binarySearch(karl));
// 1
        System.out.println(myPokedex.binarySearch(qarl));

        System.out.println(myPokedex.binarySearch(Rey));

        System.out.println(myPokedex.binarySearch(Rylie));
// 2
        System.out.println(myPokedex.binarySearch(Rodrigo));

        System.out.println(myPokedex.binarySearch(Eunsan));

        System.out.println("");

        myPokedex.selectionSort();

        System.out.println(myPokedex.binarySearch(carl));
// 0
        System.out.println(myPokedex.binarySearch(karl));
// 1
        System.out.println(myPokedex.binarySearch(qarl));

        System.out.println(myPokedex.binarySearch(Rey));

        System.out.println(myPokedex.binarySearch(Rylie));
// 2
        System.out.println(myPokedex.binarySearch(Rodrigo));

        System.out.println(myPokedex.binarySearch(Eunsan));





}
}
