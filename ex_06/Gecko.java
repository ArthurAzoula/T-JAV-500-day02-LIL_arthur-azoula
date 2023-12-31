public class Gecko {

    private String name = "Unknown";
    private int energy = 100;
    private int age;

    public Gecko() {
        System.out.println("Hello!");
    }

    public Gecko(String name) {
        this.name = name;
        System.out.println("Hello " + name + "!");
    }

    public Gecko(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Hello " + name + "!");
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnergy() {
        return this.energy;
    }

    public void setEnergy(int energy) {
        if (energy <= 100 &&  energy >= 0) {
            this.energy = energy;
        } else if (energy > 100) {
            this.energy = 100;
        } else if (energy < 0) {
            this.energy = 0;
        }
    }

    public void status() {
        switch (this.age) {
            case 0:
                System.out.println("Unborn Gecko");
                break;
            case 1:
            case 2:
                System.out.println("Baby Gecko");
                break;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                System.out.println("Adult Gecko");
                break;
            case 11:
            case 12:
            case 13:
                System.out.println("Old Gecko");
                break;
            default:
                System.out.println("Impossible Gecko");
                break;
        }
    }

    public void hello(String name) {
        System.out.println("Hello " + name + ", I'm " + this.name + "!");
    }

    public void hello(int name) {
        for (int i = 0; i < name; i++) {
            System.out.println("Hello, I'm " + this.name + "!");
        }
    }

    public void eat(String food){
        switch (food.toLowerCase()){
            case "meat":
                System.out.println("Yummy!");
                setEnergy(this.energy + 10);
                break;
            case "vegetable":
                System.out.println("Erk!");
                setEnergy(this.energy - 10);
                break;
            default:
                System.out.println("I can't eat this!");
                break;
        }
    }

}
