public class main {
    public static void main(String[] args) {
        //enkapsilas dan polymorposhijm bntk 1(palyer biasa)
        player p1 = new player("Rahmat");
        
        //upcasting anak -> induk
        player p = new HeroPlayer("Rahmat", "Marksman");
        p.display();


        //downcasting induk->anak
        HeroPlayer hp = (HeroPlayer) p;
        
        hp.display("INFO HERO");
        hp.pukul();

        
        // polymorphismbentuk 2 (Objek HeroPlayer yang dirujuk sebagai player)
        HeroPlayer p2 = new HeroPlayer("Naufal", "Marksman");
        HeroPlayer p3 = new HeroPlayer("Rahmat3", "Mage");

    //pemanggilan method display
        p1.display();
    //memanggil display string denfan paramater overloading milik kelas anak
        p2.display("INFO HERO");
        p3.display("INFO HERO");
    }
}