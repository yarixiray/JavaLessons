import sun.awt.image.IntegerComponentRaster;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Reader extends JFrame {
    JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, z, u, d, m, p, c, t, r;
    JLabel l1, l2, l3, l4;
    JTextField t1, t2;
    int i, k;
    String a, b;
    Ehandler handler = new Ehandler();


    public Reader(String s) {
        super(s);
        setLayout(new FlowLayout());
        c = new JButton("C");
        b0 = new JButton("0");
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");

        p = new JButton("+");
        m = new JButton("-");
        u = new JButton("*");
        d = new JButton("/");
        z = new JButton("+/-");
        t = new JButton(".");
        r = new JButton("=");

        l1 = new JLabel("Input first character: ");
        l2 = new JLabel("Input second character: ");
        l3 = new JLabel("");
        l4 = new JLabel("");
        t1 = new JTextField(10);
        t2 = new JTextField(10);
        add(t1);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(p);
        add(m);
        add(u);
        add(z);
        add(d);
        add(t);
        add(r);
        add(c);

        b1.addActionListener(handler);
        b2.addActionListener(handler);
        b3.addActionListener(handler);
        b4.addActionListener(handler);
        b5.addActionListener(handler);
        b6.addActionListener(handler);
        b7.addActionListener(handler);
        b8.addActionListener(handler);
        b9.addActionListener(handler);
        b0.addActionListener(handler);
        p.addActionListener(handler);
        m.addActionListener(handler);
        u.addActionListener(handler);
        z.addActionListener(handler);
        d.addActionListener(handler);
        t.addActionListener(handler);
        r.addActionListener(handler);
        c.addActionListener(handler);

        /*add(l1);
        add(l2);
        add(t2);
        add(l3);
        add(l4);
        b2.addActionListener(handler);
        b1.addActionListener(handler); */
    }

    public class Ehandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {

                if (e.getSource() == b2) {
                    i = Integer.parseInt(t1.getText());
                    k = Integer.parseInt(t2.getText());
                    i++;
                    k++;
                    a = "Your first character is: " + i;
                    b = "Your second character is: " + k;
                    l3.setText(a);
                    l4.setText(b);
                }

                if (e.getSource() == c) {
                    t1.setText(null);
                    t2.setText(null);
                    l3.setText("");
                    l4.setText("");
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Please input character");
            }
        }
    }
}


