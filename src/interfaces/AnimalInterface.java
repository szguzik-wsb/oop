package interfaces;

// abstract i public (slowka) sa redundantne poniewaz interfejs z zalozenia jest
// abstrakcyjny oraz publiczny zmienne tez staja sie z zalozenia stalymi statycznymi
// jest to uproszczona forma klasy
// nie ma slowka kluczowego class
// nie mozna instancjonowac obiektu interfejsu - jest to niemozliwe poniewaz interfejs niejawnie dodaje slowko
// kluczowe abstract a abstrakcyjnych klas tez nie instancjonulemy (nie mozemy z klas abstrakcyjnych stworzyc obiektu)

/**
 * Animal Interface
 */
abstract public interface AnimalInterface {
    /**
     *
     * @param opt
     */
    abstract public void welcome(String opt);
}
