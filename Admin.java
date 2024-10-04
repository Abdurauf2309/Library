public class Admin {
    private int id;
    private String name;
    private String password;
    public Admin(String name, String password) {
        this.id = (int) (Math.random() * 100000);
        this.name = name;
        this.password = password;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }

}
