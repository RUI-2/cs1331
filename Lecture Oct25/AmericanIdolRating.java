public class AmericanIdolRating<T extends Number> {

    private String contestantName;
    private T katyPerry;
    private T lionelRichie;
    private T lukeBryan;

    public AmericanIdolRating(String name, T katyPerry,
                               T lionelRichie, T lukeBryan) {
        this.contestantName = name;
        this.katyPerry = katyPerry;
        this.lionelRichie = lionelRichie;
        this.lukeBryan = lukeBryan;
    }

    public String getContestantName() {
        return contestantName;
    }

    public T getKatyPerryRating() {
        return katyPerry;
    }

    public T getLionelRichieRating() {
        return lionelRichie;
    }

    public T getLukeBryanRating() {
        return lukeBryan;
    }

}




