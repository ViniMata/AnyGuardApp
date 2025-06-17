package Controller;

import Model.Usuario;

public class UsuarioController {

    public Usuario criarUsuario(String nome, String regiao) {
        return new Usuario(nome, regiao);
    }

    public String exibirDados(Usuario usuario, boolean detalhado) {
        return usuario.exibirDados(detalhado);
    }

    public boolean verificarRegiao(Usuario usuario, String regiaoConsulta) {
        return usuario.pertenceRegiao(regiaoConsulta);
    }
}
