import dice.Dice;
import jumper.Jumper;
import player.Player;
import coordinate.Coordinate;
import board.Board;
import java.util.*;
import game.Game;

public class App {
    public static void main(String[] args) throws Exception {
     
       HashMap<String,Jumper> map=new HashMap<>();
       map.put("6",new Jumper(new Coordinate(9,5),new Coordinate(6,6)));
       map.put("97",new Jumper(new Coordinate(0,1),new Coordinate(9,9)));
       map.put("21",new Jumper(new Coordinate(7,0),new Coordinate(0,9)));
       map.put("64",new Jumper(new Coordinate(3,3),new Coordinate(7,4)));
       Player p1= new Player();
        p1.setPlayerdetailsfromuserInput(p1);
     
       Player p2= new Player();
       p2.setPlayerdetailsfromuserInput(p2);

       System.out.println("player name:"+p1.getPlayername());
       System.out.println("player name :"+p2.getPlayername());
      

        Dice dice = new Dice();
        System.out.println(dice.diceroll());

       Coordinate c= new Coordinate(3,7);
       Coordinate d= new Coordinate(6,7);


       Jumper j= new Jumper(c,d);
        System.out.println(j.getjumpername());

        Board b= new Board(10,map);
        b.printBoard();

        Game game = new Game(b, new Player[]{p1,p2},new Dice());
        game.play();

    }

    

}
