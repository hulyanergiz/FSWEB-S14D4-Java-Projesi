import com.workintech.game.Monster;
import com.workintech.game.Scorpion;
import com.workintech.game.Werewolf;

public class Game {
    public static void main(String[] args) {
        Monster wereWolf=new Werewolf("werewolf",80,800);
        Monster scorpion=new Scorpion("scorpion",30,50);

        System.out.println(wereWolf);
        System.out.println(wereWolf.attack());
        System.out.println(scorpion);
        System.out.println(scorpion.attack());

    }
}
