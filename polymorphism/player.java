//enkapsulasi kelas indukk
public class player {
    private String name;
    // Constructo
    public player(String name) {
        this.name = name;
    }

    public player() {
        this.name = "Player Biasa";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    // Method display dasar (tanpa parameter)
    public void display() {
        System.out.println("Nama Player : " + this.name);
    }
}

//inheritance kelas anak
class HeroPlayer extends player {
    private String role;

    public HeroPlayer(String name, String role) {
        super(name);
        this.role = role;
    }
//polmorphism method overloadinf
    public void display(String pesan) {
        System.out.println("[" + pesan + "] Hero : " + getName() + " | Role: " + this.role);
    }
    public void pukul() {
        System.out.println(getName() + " menyerang musuh!");
    }
}