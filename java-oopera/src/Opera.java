import java.util.List;

public class Opera extends MusicalShow{
    private int choirSize;

    public Opera(String title, int duration, Director director,
                 List<Actor> actors, String librettoText, Person musicAuthor, int choirSize) {
        super(title, duration, director, actors, librettoText, musicAuthor);
        this.choirSize = choirSize;
    }

    public int getChoirSize() {
        return choirSize;
    }
}
