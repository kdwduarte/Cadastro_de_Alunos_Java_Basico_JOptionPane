import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList<>();
        int opcao;
        do {
            String menu = """
                    Escolha uma opção:
                    1 - Cadastrar aluno
                    2 - Listar alunos
                    0 - Sair
                    """;
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch (opcao) {
                case 1 -> {
                    String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:"));

                    Aluno novo = new Aluno(nome, idade);
                    lista.add(novo);

                    JOptionPane.showMessageDialog(null, "Aluno cadastrado com sucesso!");
                }
                case 2 -> {
                    // Listagem de alunos
                    if (lista.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Nenhum aluno cadastrado.");
                    } else {
                        StringBuilder mensagem = new StringBuilder("Alunos cadastrados:\n");
                        for (Aluno a : lista) {
                            mensagem.append(a.exibir()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, mensagem.toString());
                    }
                }
                case 0 -> {
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
                }
            }
        } while (opcao != 0);
    }
}
