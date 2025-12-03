import java.util.List;

public class Ballet extends MusicalShow{
    private Person choreographer;

    public Ballet(String title, int duration, Director director, List<Actor> actors,
                  String librettoText, Person musicAuthor, Person choreographer) {
        super(title, duration, director, actors, librettoText, musicAuthor);
        this.choreographer = choreographer;
    }

    public Person getChoreographer(){
        return choreographer;
    }
}
