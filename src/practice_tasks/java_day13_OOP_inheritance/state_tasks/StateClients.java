package practice_tasks.java_day13_OOP_inheritance.state_tasks;

public class StateClients {
    public static void main(String[] args) {

        Virginia virginia = new Virginia("virginia", "v abbre", "v polParty", "governor", "senator", 12345667);

        California california = new California("Cal name", " Cal abbre", "Cal political", "Cal governor", "Cal senator", 58489293);

        Florida florida = new Florida("Flo name", "Flo abbre", "Flo PP", "Flo Govern", "Flo senator", 648873839);

        Texas texas = new Texas("Tx name", "tx abbr", "tx pp", "tx gov", "tx sen", 698845785);


        System.out.println(virginia + "\n" + california + "\n" + florida + "\n" + texas);

    }
}
