import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GameOver extends JFrame {
	JLabel label;
	public GameOver(String s) {
        super(s);
        JPanel p = new JPanel();
        label = new JLabel("Game uber alles! But Over");
        p.add(label);
        add(p);
        setSize(400, 400);
        setVisible(true);
        repaint();
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    }
	public void paint(Graphics g){
		g.drawString(""+Byte.game.PlayerScore, 100, 100);
	}
}
