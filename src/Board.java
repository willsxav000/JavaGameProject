import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Board extends JPanel implements ActionListener {

    public Board() {
        setPreferredSize(new Dimension(800, 600));
        setBackground(Color.BLACK);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void setup() {
    }

    public void setPlayerPos(int x, int y) {
    }
}

