public class HorseRunner {
    public static void main(String[] args)
    {
        horse horse1 = new Mustang("Secretariat",12000);
        horse horse2 = new Mustang("Dusty Trail",22000);
        horse horse3 = new Mustang("Silver",12000);

        horse[] horses = new horse[6];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        System.out.println(barn);
        System.out.println(" Dusty Trail is in space: "+ barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println(" Dusty Trail is now in space: "+ barn.findHorseSpace("Dusty Trail"));
    }
}
