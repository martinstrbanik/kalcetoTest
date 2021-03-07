import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
public class Main {


    public static void main(String[] args) {

        Player player0 = new Player("Peter",20,10);
        Player player1 = new Player("John",2,6);
        Player player2 = new Player("Josh",41,14);
        Player player3 = new Player("Adrian",12,20);

        ArrayList<Player> players = new ArrayList<>();
        boolean b = Collections.addAll(players,player0,player1,player2,player3);

        ArrayList<Player> generatedBlue = new ArrayList<>();
        ArrayList<Player> generatedRed = new ArrayList<>();

        for(int i=0; i<players.size(); i++){
            int one = 1;
            for(int j=one; j<players.size()-i; j++){
                generatedBlue.add(players.get(i));
                generatedRed.add(players.get(i + j));
            }

        }

        for(int i=0; i<generatedBlue.size(); i++){
            System.out.println(generatedBlue.get(i).name + " vs " + generatedRed.get(i).name);
        }


//        Random random = new Random();
//        int test = random.nextInt(players.size());
//        System.out.println(test);
    }

}


//Version with only name output

//for(int i=0; i<players.size(); i++){
//        int one = 1;
//        for(int j=one; j<players.size()-i; j++){
//        System.out.println(players.get(i).name + " vs " + players.get(i + j).name);
//        }
//
//        }