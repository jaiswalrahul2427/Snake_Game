import java.awt.Frame;
import javax.swing.*;

public class Snake_Game{
    public static void main(String[] args){
        int boardwidth =600;
        int boardHeight =boardwidth;

        JFrame frame=new JFrame("Snake");
        frame.setVisible(true);
        frame.setSize(boardwidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

        SnakeGame snakeGame =new SnakeGame(boardwidth, boardHeight);
        frame.add(snakeGame);
        frame.pack();
        snakeGame.requestFocus();


    }
}