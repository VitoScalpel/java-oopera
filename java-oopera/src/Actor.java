import java.util.Objects;

public class Actor extends Person{
    private final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (" + height + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;
        Actor a = (Actor)obj;
        return (this.name.equals(a.name) && this.surname.equals(a.surname) && this.height == a.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,surname,height);
    }
}
