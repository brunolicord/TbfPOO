import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaInicial extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		//Melhorando a aparencia
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        	System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaInicial frame = new TelaInicial();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSejaBemVindo = new JLabel("Seja Bem Vindo");
		lblSejaBemVindo.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		lblSejaBemVindo.setBounds(150, 22, 163, 26);
		contentPane.add(lblSejaBemVindo);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Ir para a tela de cadastro
				TelaCadastro tela1 = new TelaCadastro();
				tela1.setVisible(true);
				setVisible(false);
			}
		});
		btnCadastrar.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		btnCadastrar.setBounds(163, 73, 114, 25);
		contentPane.add(btnCadastrar);
		
		JButton btnVisualizar = new JButton("Visualizar");
		btnVisualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) { //Ir para a tela de Dados
				TelaDados tela1 = new TelaDados();
				tela1.setVisible(true);
				setVisible(false);
			}
		});
		btnVisualizar.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		btnVisualizar.setBounds(163, 131, 114, 25);
		contentPane.add(btnVisualizar);
	}
}
