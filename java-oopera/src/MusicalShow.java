import java.util.List;

public class MusicalShow extends Show{
    private final String librettoText;
    private final Person musicAuthor;

    public MusicalShow(String title, int duration, Director director,
                       List<Actor> actors, String librettoText, Person musicAuthor) {
        super(title, duration, director, actors);
        this.librettoText = librettoText;
        this.musicAuthor = musicAuthor;
    }

    public void printLibrettoText() {
        System.out.println("Текст либретто: " + librettoText);
    }

    public Person getMusicAuthor() {
        return musicAuthor;
    }

    public String getLibrettoText() {
        return librettoText;
    }
}
