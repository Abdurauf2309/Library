public abstract class Person {
    protected String name;
    protected String ID;
    protected int age;
    protected String login;
    protected String password; // In a real system, this should be hashed
    protected String role;

    public Person(String name, String ID, int age, String login, String password, String role) {
        this.name = name;
        this.ID = ID;
        this.age = age;
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Age: " + age);
        System.out.println("Role: " + role);
    }
}
