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

    /*
    В ТЗ нет ясности на случай если у нас несколько актеров с одинаковой фамилией. " - Заменить одного актёра
     в спектакле на другого (на вход подаётся объект нового актёра и фамилия того, которого он заменяет).
     Если актёр с такой фамилией отсутствует, должно выводиться предупреждающее сообщение. Порядок актёров в списке
     значения не имеет." Я сделал так, что заменяется первый найденный актер, на этом проверка заканчивается.
     Если нужно изменить, то уточните поведение этого случая.
     */
    public void replaceActor (Actor newActor, String surnamePrevious) {
        for (Actor actor : actors) {
            if (actor.getSurname().equals(surnamePrevious)) {
                actors.remove(actor);
                actors.add(newActor);
                System.out.println( title + ": Вместо актера " + surnamePrevious +
                        " будет играть " + newActor.getSurname());
                return;
            }
        }
        System.out.println("Такого актера нет в спектакле.");
    }

}
