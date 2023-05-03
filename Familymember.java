public abstract class Familymember {
    private int age;
    private String name;

    public Familymember(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        rest age;
    }

    public void SetAge(int age) {
        this.age = age;

    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name + ":" + age;
    }
}