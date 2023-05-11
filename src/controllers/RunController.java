package controllers;

import models.Animal;
import models.BasicData;
import models.Person;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Class RunController
 */
public class RunController extends BasicData{
    /**
     * Class to run program
     */
    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chcesz stworzyć zwierzę (wpisz: animal) czy człowieka (wpisz: human) ? ");
        String decision = String.valueOf(scanner.nextLine());

        switch (decision) {
            case "human" -> {
                Person person = new Person();
                person.welcome(decision);
                person.breakLine();
                System.out.println("Podaj imię dla człowieka");
                person.setName(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj wykonywany zawód");
                person.work = String.valueOf(scanner.nextLine());
                System.out.println("Podaj wiek człowieka");
                person.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println(Arrays.toString(person.PersonData()));
            }
            case "animal" -> {
                Animal animal = new Animal();
                animal.welcome(decision);
                animal.breakLine();
                System.out.println("Podaj imię dla zwierzaka");
                animal.setName(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj gatunek zwierzęcia");
                animal.setType(String.valueOf(scanner.nextLine()));
                System.out.println("Podaj wiek zwierzęcia");
                animal.setAge(Integer.parseInt(scanner.nextLine()));
                System.out.println(Arrays.toString(animal.AnimalData()));
            }
            default -> {
                System.out.println("Błędny wybór");
                this.run();
            }
        }
        this.breakLine();
        System.out.println("Pa pa");
    }
}
