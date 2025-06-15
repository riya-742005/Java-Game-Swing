import javax.swing.*;

public class GameFrame extends JFrame {
    public GameFrame(){
        Board board=new Board();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Game Dev in Java");
        this.setSize(1500,920);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        add(board);
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new GameFrame();
    }
}
