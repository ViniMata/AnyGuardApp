package View;

import Controller.UsuarioController;
import Model.Usuario;

import java.util.Scanner;

public class UsuarioView {
    private final UsuarioController controller = new UsuarioController();
    private final Scanner scanner = new Scanner(System.in);

    public void mostrarCadastroUsuario() {
        System.out.print("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.print("Em qual região você mora? ");
        String regiao = scanner.nextLine();

        Usuario usuario = controller.criarUsuario(nome, regiao);

        System.out.println("Usuário cadastrado com sucesso!");
        System.out.println(controller.exibirDados(usuario, true));
    }
}
