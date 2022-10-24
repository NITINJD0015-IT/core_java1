
//Puzzle Game

//Game 1: Alphabet Game

package simpliGame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class AlphabetGame extends Frame implements ActionListener {
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;

	AlphabetGame() {
		super("Puzzle - SimpliGame");
		b1 = new Button("A");
		b1.setBounds(50, 100, 40, 40);
		b2 = new Button("B");
		b2.setBounds(100, 100, 40, 40);
		b3 = new Button("C");
		b3.setBounds(150, 100, 40, 40);
		b4 = new Button("D");
		b4.setBounds(50, 150, 40, 40);
		b5 = new Button("E");
		b5.setBounds(100, 150, 40, 40);
		b6 = new Button("F");
		b6.setBounds(150, 150, 40, 40);
		b7 = new Button("G");
		b7.setBounds(50, 200, 40, 40);
		b8 = new Button("");
		b8.setBounds(100, 200, 40, 40);
		b9 = new Button("H");
		b9.setBounds(150, 200, 40, 40);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		setSize(400, 400);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1) {
			String label = b1.getLabel();
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b1.setLabel("");
			}
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b1.setLabel("");
			}
		}
		if (e.getSource() == b2) {
			String label = b2.getLabel();
			if (b1.getLabel().equals("")) {
				b1.setLabel(label);
				b2.setLabel("");
			}
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b2.setLabel("");
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b2.setLabel("");
			}
		}
		if (e.getSource() == b3) {
			String label = b3.getLabel();
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b3.setLabel("");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b3.setLabel("");
			}
		}
		if (e.getSource() == b4) {
			String label = b4.getLabel();
			if (b1.getLabel().equals("")) {
				b1.setLabel(label);
				b4.setLabel("");
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b4.setLabel("");
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b4.setLabel("");
			}
		}
		if (e.getSource() == b5) {
			String label = b5.getLabel();
			if (b2.getLabel().equals("")) {
				b2.setLabel(label);
				b5.setLabel("");
			}
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b5.setLabel("");
			}
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b5.setLabel("");
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b5.setLabel("");
			}
		}
		if (e.getSource() == b6) {
			String label = b6.getLabel();
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b6.setLabel("");
			}
			if (b3.getLabel().equals("")) {
				b3.setLabel(label);
				b6.setLabel("");
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b6.setLabel("");
			}
		}
		if (e.getSource() == b7) {
			String label = b7.getLabel();
			if (b4.getLabel().equals("")) {
				b4.setLabel(label);
				b7.setLabel("");
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b7.setLabel("");
			}
		}
		if (e.getSource() == b8) {
			String label = b8.getLabel();
			if (b9.getLabel().equals("")) {
				b9.setLabel(label);
				b8.setLabel("");
			}
			if (b7.getLabel().equals("")) {
				b7.setLabel(label);
				b8.setLabel("");
			}
			if (b5.getLabel().equals("")) {
				b5.setLabel(label);
				b8.setLabel("");
			}
		}
		if (e.getSource() == b9) {
			String label = b9.getLabel();
			if (b6.getLabel().equals("")) {
				b6.setLabel(label);
				b9.setLabel("");
			}
			if (b8.getLabel().equals("")) {
				b8.setLabel(label);
				b9.setLabel("");
			}
		}

		if (b1.getLabel().equals("A") && b2.getLabel().equals("B") && b3.getLabel().equals("C") && b4.getLabel().equals("D") && b5.getLabel().equals("E") && b6.getLabel().equals("F") && b7.getLabel().equals("G") && b8.getLabel().equals("H") && b9.getLabel().equals("")) {
			JOptionPane.showMessageDialog(this, "Congratulations! You won.");
		}
	}

	public static void main(String[] args) {
		new AlphabetGame();
	}
}