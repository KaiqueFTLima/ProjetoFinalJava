import javax.swing.*; // Importa todas as classes do pacote Swing (JFrame, JButton, JLabel, etc.)

// Classe principal da aplicação
public class SimpleGUI {

    // Atributos da classe (componentes da interface)
    // Eles são declarados aqui para poderem ser usados em vários métodos
    private JFrame frame;
    private JTextField textField;
    private JButton button;
    private JLabel label;

    // Metodo principal (ponto de entrada do programa)
    public static void main(String[] args) {

        // Cria um objeto da classe SimpleGUI
        // Isso permite acessar os métodos não estáticos
        SimpleGUI gui = new SimpleGUI();

        // Chama o metodo que cria e exibe a interface
        gui.createAndShowGUI();
    }

    // Metodo responsável por organizar a criação da interface
    public void createAndShowGUI() {

        // Cria e configura a janela
        createFrame();

        // Cria os componentes (campo, botão, label)
        createComponents();

        // Adiciona os componentes na janela
        addComponents();

        // Define os eventos (ações do botão)
        addEvents();

        // Torna a janela visível
        frame.setVisible(true);
    }

    // Metodo responsável por criar e configurar a janela principal
    private void createFrame() {

        // Cria a janela com título
        frame = new JFrame("My First GUI");

        // Define tamanho da janela (largura, altura)
        frame.setSize(300, 150);

        // Define o que acontece ao clicar no X (encerra o programa)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Remove o layout automático (usando posicionamento absoluto)
        frame.setLayout(null);

        // Centraliza a janela na tela
        frame.setLocationRelativeTo(null);
    }

    // Metodo responsável por criar os componentes da interface
    private void createComponents() {

        // Cria o campo de texto
        textField = new JTextField();

        // Define posição e tamanho (x, y, largura, altura)
        textField.setBounds(20, 20, 150, 25);

        // Cria o botão com texto
        button = new JButton("Click Me");

        // Define posição e tamanho do botão
        button.setBounds(180, 20, 90, 25);

        // Cria o label com texto inicial
        label = new JLabel("Hello!");

        // Define posição e tamanho do label
        label.setBounds(20, 60, 250, 25);
    }

    // Metodo responsável por adicionar os componentes na janela
    private void addComponents() {

        // Adiciona o campo de texto ao frame
        frame.add(textField);

        // Adiciona o botão ao frame
        frame.add(button);

        // Adiciona o label ao frame
        frame.add(label);
    }

    // Metodo responsável por definir os eventos da interface
    private void addEvents() {

        // Adiciona um "ouvinte de ação" ao botão
        // Esse código será executado quando o botão for clicado
        button.addActionListener(e -> {

            // Captura o texto digitado no campo
            String name = textField.getText();

            // Atualiza o texto do label dinamicamente
            label.setText("Hello, " + name + "!");
        });
    }
}