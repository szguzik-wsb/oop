package models;

import interfaces.BasicInterface;
import interfaces.PersonInterface;

/**
 * Class Person
 */
public class Person extends BasicData implements BasicInterface, PersonInterface {
  public String work = "programmers";

    /**
     * String[] returned with set properties
     * @return
     */
    public String[] PersonData() {
        return new String[]{
                "work: " + this.work,
                "name: " + this.getName(),
                "age: " + this.getAge(),
        };
    }

    /**
     *
     * @param opt
     */
    @Override
    public void welcome(String opt) {
        System.out.println(HELLO + opt);
    }
}