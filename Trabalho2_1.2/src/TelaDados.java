import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.awt.event.ActionEvent;

public class TelaDados extends JFrame {

	private JPanel contentPane;
	private JTable table;
	PessoaModel pessoaDado = new PessoaModel();
	
	
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
					TelaDados frame = new TelaDados();
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
	public TelaDados() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//criando Colecao de pessoas
		Set<PessoaModel> pessoas = new HashSet<PessoaModel>();
		Iterator<PessoaModel> pessoasAsIterator = pessoas.iterator();
		String [] colunas = {"Nome", "Cpf", "Curso", "Matrícula"};
		PessoaModel[][] pessoaRow = new PessoaModel[pessoas.size()][colunas.length];
		while (pessoasAsIterator.hasNext()){
               PessoaModel it = pessoasAsIterator.next();  
               for(int i = 0 ; i<pessoas.size(); i++) {
            	  
               }
               
        }
		
		//String [] colunas = {"Nome", "Cpf", "Curso", "Matrícula"};
		
		JLabel lblAlunosCasdastrar = new JLabel("Alunos Cadastrados");
		lblAlunosCasdastrar.setFont(new Font("Century Schoolbook L", Font.BOLD, 18));
		lblAlunosCasdastrar.setBounds(122, 0, 199, 26);
		contentPane.add(lblAlunosCasdastrar);
		
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Aqui onde sera chamado e emplementado o remover itens da colecao
			}
		});
		btnRemover.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		btnRemover.setBounds(301, 216, 114, 25);
		contentPane.add(btnRemover);
		
		JButton btnRetornar = new JButton("Retornar");
		btnRetornar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Retornando para a tela inicial
				TelaInicial tela3 = new TelaInicial();
				tela3.setVisible(true);
				setVisible(false);
			}
		});
		btnRetornar.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		btnRetornar.setBounds(162, 216, 114, 25);
		contentPane.add(btnRetornar);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {//Aqui fica onde quero pegar os dados da colecao e jogar em uma arrayList
				
				//ArrayList<PessoaModel> pessoas = new ArrayList<PessoaModel>();
				//Aqui e onde deve acontecer magica, pra atualizar os dados, jogar na tela e mostrar
			
			}
		});
		btnAtualizar.setFont(new Font("Bitstream Charter", Font.BOLD, 16));
		btnAtualizar.setBounds(20, 216, 114, 25);
		contentPane.add(btnAtualizar);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 37, 414, 172);
		contentPane.add(scrollPane);
		
		table = new JTable(pessoaRow, colunas);
		scrollPane.setViewportView(table);
	}
}
