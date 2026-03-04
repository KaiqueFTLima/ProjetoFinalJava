import javax.swing.*; // Importa as classes do Swing (JFrame, JButton, JLabel, etc.)

public class SimpleGUI {

    public static void main(String[] args) {

        // Cria uma janela (objeto JFrame)
        JFrame frame = new JFrame("My First GUI");

        // Define o tamanho da janela (largura, altura)
        frame.setSize(300, 150);

        // Define o que acontece quando clicar no X (fecha o programa)
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Remove o layout automático (usando posicionamento absoluto)
        frame.setLayout(null);

        // Criação dos componentes

        // Cria um campo de texto onde o usuário pode digitar
        JTextField textField = new JTextField();

        // Define posição (x, y) e tamanho (largura, altura)
        textField.setBounds(20, 20, 150, 25);

        // Cria um botão
        JButton button = new JButton("Click Me");

        // Define posição e tamanho do botão
        button.setBounds(180, 20, 90, 25);

        // Cria um texto inicial na tela
        JLabel label = new JLabel("Hello!");

        // Define posição e tamanho do label
        label.setBounds(20, 60, 250, 25);

        // Adicionando componentes na janela
        frame.add(textField); // Adiciona o campo de texto
        frame.add(button);    // Adiciona o botão
        frame.add(label);     // Adiciona o label

        // Evento do botão (quando clicar)
        button.addActionListener(e -> {

            // Pega o texto digitado no campo
            String name = textField.getText();

            // Atualiza o label com o nome digitado
            label.setText("Hello, " + name + "!");
        });

        // Torna a janela visível (deve ser a última coisa)
        frame.setVisible(true);
    }
}