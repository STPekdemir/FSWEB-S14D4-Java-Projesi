import com.Workitech.WereWolf;

public class Rpg {
    public static void main(String[] args) {
        WereWolf wereWolf = new WereWolf("Tolga", 100, 10.0, true, false);
        System.out.println(wereWolf.getName());
        System.out.println(wereWolf.getHitPoints());
        System.out.println(wereWolf.getDamage());
        System.out.println(wereWolf.bleed());
        System.out.println(wereWolf.poison());
        System.out.println(wereWolf.attack());
        /*
         * OUTPUT:
         * Tolga
         * 100
         * 10.0
         * 0.0
         * 2.5
         * 12.5
         */
    }
}
