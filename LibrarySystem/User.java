package LibrarySystem;

public class User {
    private int userId;
    private String name;

    public User(int userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }

    public void display() {
        System.out.println(userId + " | " + name);
    }
}

