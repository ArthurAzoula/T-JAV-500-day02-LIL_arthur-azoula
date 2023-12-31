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

    public void eat(String food) {
        switch (food.toLowerCase()) {
            case "meat":
                System.out.println("Yummy!");
                setEnergy(energy + 10);
                break;
            case "vegetable":
                System.out.println("Erk!");
                setEnergy(energy - 10);
                break;
            default:
                System.out.println("I can't eat this!");
                break;
        }
    }

    public void work() {
        if (this.energy >= 25) {
            System.out.println("I'm working T.T");
            this.setEnergy(this.energy - 9);
        } else {
            System.out.println("Heyyy I'm too sleepy, better take a nap!");
            setEnergy(this.energy + 50);
        }
    }


    public void fraternize(Object friend) {
        if (friend instanceof Gecko) {
            Gecko friendGecko = (Gecko) friend;
            if (this.energy >= 30 && friendGecko.getEnergy() >= 30) {
                this.setEnergy(this.energy - 30);
                friendGecko.setEnergy(friendGecko.getEnergy() - 30);
                System.out.println("I'm going to drink with " + friendGecko.getName() + "!");
                System.out.println("I'm going to drink with " + this.name + "!");
            } else if (!(this.energy >= 30) && friendGecko.getEnergy() >= 30) {
                System.out.println("Sorry " + friendGecko.getName() + ", I'm too tired to go out tonight.");
                System.out.println("Oh! That's too bad, another time then!");
            } else if (this.energy >= 30 && !(friendGecko.getEnergy() >= 30)) {
                System.out.println("Sorry " + this.name + ", I'm too tired to go out tonight.");
                System.out.println("Oh! That's too bad, another time then!");
            } else {
                System.out.println("Not today!");
                System.out.println("Not today!");
            }
        } else if (friend instanceof Snake) {
            if (this.energy >= 10) {
                System.out.println("LET'S RUN AWAY!!!");
                this.setEnergy(0);
            }
            else {
                System.out.println("...");
            }
        }
    }

}
