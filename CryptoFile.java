import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class CryptoFile extends JFrame {

    public CryptoFile() {

    }

    public static void main(String args[]) {

        CryptoFile form = new CryptoFile();
        form.setLayout(null);
        form.setBounds(0, 0, 600, 300);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Criptografar Arquivo");
    }
}
