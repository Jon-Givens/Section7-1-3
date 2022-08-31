public class PrisonTest_7_2 {

    public static void main(String[] args) {


        Prisoner_7_2 bubba = new Prisoner_7_2();
        bubba.name = "Bubba";
        bubba.height = 2.08;
        bubba.years = 4;

        Prisoner_7_2 twitch = bubba;
        twitch.name = "Bubba";
        twitch.height = 1.73;
        twitch.years = 3;



        System.out.println("tricked the guards: " + (bubba.name == twitch.name));
    }
}
