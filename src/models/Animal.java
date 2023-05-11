package models;

import interfaces.AnimalInterface;
import interfaces.BasicInterface;

/**
 * Class Animal
 */
public class Animal extends BasicData implements BasicInterface, AnimalInterface {
    /**
     * String type
     */
    private String type;

    /**
     * String type
     * @return
     */
    public String getType() {
        return this.type;
    }

    /**
     * @param type
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * String[] returned with set properties
     * @return
     */
    public String[] AnimalData() {
        return new String[]{
                "type: " + this.getType(),
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
