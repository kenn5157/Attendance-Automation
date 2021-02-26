package be;

public class Lectures {

    private int id;
    private String name;

    public Lectures(int id, String namme) {
        this.id = id;
        this.name = namme;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return id + "; " + name;
    }

}
