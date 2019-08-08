import javax.swing.*;

public class MyWindow extends JFrame {
    public MyWindow(){
        setTitle("Змейка");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(640,665);
        setLocation(640,640);
        add(new GameField());
        setVisible(true);
    }

    public static void main(String[] args) {
        MyWindow mw = new MyWindow();
    }
}

