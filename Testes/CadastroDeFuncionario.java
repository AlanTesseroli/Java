import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CadastroDeFuncionario extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JLabel labelNome;
    private JLabel labelIdade;
    private JLabel labelDataAdmissao;
    
    private JTextField campoNome;
    private JTextField campoIdade;
    private JTextField campoDataAdmissao;
    
    private JButton botaoConsultar;
    
    private String nome;
    private int idade;
    private String dataAdmissao;

    public CadastroDeFuncionario() {
        super("Cadastro de Funcionário");
        
       
        setLayout(new FlowLayout());
        
       
        labelNome = new JLabel("Nome:");
        labelNome.setPreferredSize(new java.awt.Dimension(100, 20));
        labelIdade = new JLabel("Idade:");
        labelNome.setPreferredSize(new java.awt.Dimension(100, 20));
        labelDataAdmissao = new JLabel("Data de Admissão:");
        labelNome.setPreferredSize(new java.awt.Dimension(100, 20));
        
        
        campoNome = new JTextField(20);
        campoIdade = new JTextField(3);
        campoDataAdmissao = new JTextField(10);
        
       
        botaoConsultar = new JButton("Consultar");
        botaoConsultar.addActionListener(this);
        
       
        add(labelNome);
        add(campoNome);
        add(labelIdade);
        add(campoIdade);
        add(labelDataAdmissao);
        add(campoDataAdmissao);
        add(botaoConsultar);
        
        
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == botaoConsultar) {
   
            nome = campoNome.getText();
            idade = Integer.parseInt(campoIdade.getText());
            dataAdmissao = campoDataAdmissao.getText();
            
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
            System.out.println("Data de Admissão: " + dataAdmissao);
        }
    }
    
    public static void main(String[] args) {
        new CadastroDeFuncionario();
    }
}
