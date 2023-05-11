package models;

/**
 * Abstract class BasicData
 */
public abstract class BasicData {
    /**
     * String name
     */
    public String name;

    /**
     * int age
     */
    public int age;

    /**
     * String name
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * int age
     * @return
     */
    public String getAge() {
        return String.valueOf(this.age);
    }

    /**
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Void Break line
     */
    public void breakLine() {
        System.out.println("----------------------------");
    }


}
