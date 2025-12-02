import java.util.List;

public class Show {
    private String title;
    private int duration;
    private Director director;
    private List<Actor> actors;

    public Show(String title, int duration, Director director, List<Actor> actors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.actors = actors;
    }

    public void printActors() {
        for (Actor actor : actors) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (actors.contains(actor)) {
            System.out.println("Этот актер уже участвует в спектакле.");
        } else {
            actors.add(actor);
        }
    }

    public void replaceActor (Actor newActor, String surnamePrevious) {
        for (Actor actor : actors) {
            if (actor.getSurname().equals(surnamePrevious)) {
                actors.remove(actor);
                actors.add(newActor);
                return;
            }
        }
        System.out.println("Такого актера нет в спектакле.");
    }

}
