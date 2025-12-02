import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Actor actor1 = new Actor("Семен","Лобанов",  Gender.MALE, 190);
        Actor actor2 = new Actor("Олег", "Манекен", Gender.MALE, 177);
        Actor actor3 = new Actor("Егор","Кривой",  Gender.MALE, 4);

        Director director1 = new Director("Человек","Паук",  Gender.MALE, 203);
        Director director2 = new Director("Арсен","Месиво",  Gender.MALE, 150);

        Person musicAuthor = new Person("Иван", "Золо", Gender.FEMALE);
        Person chariographer = new Person("Владимир", "Грыжа", Gender.MALE);

        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(actor1);
        actors.add(actor2);

        ArrayList<Actor> actors2 = new ArrayList<>();
        actors2.add(actor3);
        actors2.add(actor2);

        ArrayList<Actor> actors3 = new ArrayList<>();
        actors3.add(actor3);
        actors3.add(actor1);

        String operaLibrettoText = "Действие первое. Зов дороги\n" +
                "На окраине тихого города живет юноша по имени Иван Золо. Его жизнь проста: утренние тренировки, " +
                "работа над проектами и вечные мечты о чем-то большем. Ночами Иван смотрит на звезды и чувствует, " +
                "что его путь еще не начался.\n Однажды к нему во сне приходит Странник — " +
                "пламенный дух перемен Семен Lobanov, который говорит: «Тот, кто верит" +
                " в код судьбы, должен сам его написать». Иван просыпается и решает покинуть привычный мир.";

        String balletLibrettoText = "Действие первое.\n" +
                "Егор Кривой — молодой парень с ногами, что никуда не ходят прямо, и мыслями, " +
                "которые прыгают через углы. Он решает найти прямой путь к своему счастью, " +
                "но каждый раз сворачивает налево или начинает кружиться.";


        Show show = new Show("Название обычного шоу", 90, director1, actors);
        MusicalShow opera = new Opera("Код перемен", 100,director2,actors2,
                operaLibrettoText, musicAuthor, 99);
        MusicalShow ballet = new Ballet("Балет", 100,director2,actors3,
                balletLibrettoText, musicAuthor, chariographer);

        System.out.println("Список актеров в спектакле: ");
        show.printActors();
        System.out.println("----------");
        System.out.println("Список актеров в опере: ");
        opera.printActors();
        System.out.println("----------");
        System.out.println("Список актеров в балете: ");
        ballet.printActors();
        System.out.println("----------");
        System.out.println("(заменяем Кривого)");
        ballet.replaceActor(actor2,"Кривой");
        ballet.printActors();
        System.out.println("----------");
        System.out.println("(заменяем Золотова)");
        opera.replaceActor(actor1,"Золотов");
        System.out.println("----------");
        System.out.println("Текст либретто оперы:");
        opera.printLibrettoText();
        System.out.println("----------");
        System.out.println("Текст либретто балета:");
        ballet.printLibrettoText();
    }
}
