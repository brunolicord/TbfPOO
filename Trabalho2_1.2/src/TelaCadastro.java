import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.awt.event.ActionEvent;

public class TelaCadastro extends JFrame {

	private JPanel contentPane;
	private JTextField textFieldNome;
	private JTextField textFieldCPF;
	private JTextField textFieldMatricula;
	private JTextField textFieldCurso;
	//private PessoaDAO pessoaDao;
	private PessoaModel pessoaModel;
	
	Set<PessoaModel> pessoas = new HashSet<PessoaModel>();
	protected JTextField c;
	
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
					TelaCadastro frame = new TelaCadastro();
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
	public TelaCadastro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCasdastrarAlunos = new JLabel("Casdastrar Alunos");
		lblCasdastrarAlunos.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		lblCasdastrarAlunos.setBounds(145, 12, 199, 26);
		contentPane.add(lblCasdastrarAlunos);
		
		JButton btnRetornar = new JButton("Retornar");
		btnRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Retornando para a tela inicial
				TelaInicial tela2 = new TelaInicial();
				tela2.setVisible(true);
				setVisible(false);
			}
		});
		btnRetornar.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		btnRetornar.setBounds(194, 226, 114, 25);
		contentPane.add(btnRetornar);
		
		//pessoaDao = new PessoaDAO(); //Criando objeto pessoaDao 
		pessoaModel = new PessoaModel(); //---------- pessoaModel
		
		//criando Colecao de pessoas
		Set<PessoaModel> pessoas = new HashSet<PessoaModel>();
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//pegando os valores dos textField
				pessoaModel.setNome(textFieldNome.getText());
				pessoaModel.setCpf(textFieldCPF.getText());
				pessoaModel.setCurso(textFieldCurso.getText());
				pessoaModel.setMatricula(Integer.parseInt(textFieldMatricula.getText()));//Aqui é necessário casting do valor recebido
				
				pessoas.add(pessoaModel);
				
				Iterator<PessoaModel> pessoasAsIterator = pessoas.iterator();
				while (pessoasAsIterator.hasNext()){
		               PessoaModel it = pessoasAsIterator.next();
		               System.out.println(PessoaModel.getNome());
		                  break;
		        }
				
				JOptionPane.showMessageDialog(contentPane, "Aluno cadastrado");//Mensagem de confirmacao"cadastrar"
				//Limpa campos textFieldaluno
				textFieldNome.setText("");
				textFieldCPF.setText("");
				textFieldCurso.setText("");
				textFieldMatricula.setText("");				}
			
			//implementar exception aqui caso nao estejam todos os campos preenchidos
				
		});
		
			
		btnSalvar.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		btnSalvar.setBounds(314, 226, 114, 25);
		contentPane.add(btnSalvar);
		
		
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Century Schoolbook L", Font.BOLD, 13));
		lblNome.setBounds(22, 33, 102, 15);
		contentPane.add(lblNome);
		
		textFieldNome = new JTextField();
		textFieldNome.setBounds(22, 54, 256, 25);
		contentPane.add(textFieldNome);
		textFieldNome.setColumns(10);
		
		textFieldCPF = new JTextField();
		textFieldCPF.setColumns(10);
		textFieldCPF.setBounds(22, 101, 256, 25);
		contentPane.add(textFieldCPF);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setFont(new Font("Century Schoolbook L", Font.BOLD, 13));
		lblCpf.setBounds(22, 80, 102, 15);
		contentPane.add(lblCpf);
		
		JLabel lblMatricula = new JLabel("Matricula");
		lblMatricula.setFont(new Font("Century Schoolbook L", Font.BOLD, 13));
		lblMatricula.setBounds(22, 173, 102, 15);
		contentPane.add(lblMatricula);
		
		textFieldMatricula = new JTextField();
		textFieldMatricula.setColumns(10);
		textFieldMatricula.setBounds(22, 194, 256, 25);
		contentPane.add(textFieldMatricula);
		
		textFieldCurso = new JTextField();
		textFieldCurso.setColumns(10);
		textFieldCurso.setBounds(22, 147, 256, 25);
		contentPane.add(textFieldCurso);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Century Schoolbook L", Font.BOLD, 13));
		lblCurso.setBounds(22, 126, 102, 15);
		contentPane.add(lblCurso);
	}
}
