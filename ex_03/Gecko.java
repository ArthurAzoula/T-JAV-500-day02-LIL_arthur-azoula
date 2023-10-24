public class Gecko {

    private String name = "Unknown";
    public Gecko() {

        System.out.println("Hello!");

    }
    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public String getName() {
        return this.name;
    }

}
