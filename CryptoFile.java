import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class CryptoFile extends JFrame {
	
	private JLabel lblFile, lblResultado;
	private JButton btnEncrypt, btnDecrypt;
	
    public CryptoFile() {
	
		setLayout(null);

        lblFile = new JLabel("Selecione um arquivo ...");
        lblFile.setBounds(50, 50, 500, 40);
        lblFile.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
        lblFile.setOpaque(true);
        lblFile.setBackground(Color.WHITE);
        add(lblFile);
		lblFile.addMouseListener(
			new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					JFileChooser fileChooser = new JFileChooser();
					int result = fileChooser.showOpenDialog(null);

					if (result == JFileChooser.APPROVE_OPTION) {
						lblFile.setText(fileChooser.getSelectedFile().getAbsolutePath());
					}
				}
			}
		);

        lblResultado = new JLabel();
        lblResultado.setBounds(50, 150, 500, 40);
        lblResultado.setFont(new Font("Arial", Font.BOLD | Font.ITALIC, 16));
        add(lblResultado);

        btnEncrypt = new JButton("Criptografar");
        btnEncrypt.setBounds(50, 100, 245, 40);
        btnEncrypt.setFont(new Font("Arial", Font.BOLD, 18));
        add(btnEncrypt);

        btnDecrypt = new JButton("Descriptografar");
        btnDecrypt.setBounds(305, 100, 245, 40);
        btnDecrypt.setFont(new Font("Arial", Font.BOLD, 18));
        add(btnDecrypt);
	
    }

    public static void main(String args[]) {

        CryptoFile form = new CryptoFile();
        form.setBounds(0, 0, 600, 300);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
        form.setResizable(false);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setTitle("Criptografar Arquivo");
    }
}
