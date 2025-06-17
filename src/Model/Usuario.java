package Model;

public class Usuario {
    private String username;
    private String regiao;

    public Usuario(String username, String regiao) {
        this.username = username;
        this.regiao = regiao;
    }

    public String getUsername() {
        return username;
    }

    public String getRegiao() {
        return regiao;
    }

    public String exibirDados() {
        return "Usuário: " + username + ", Região: " + regiao;
    }

    public String exibirDados(boolean detalhado) {
        if (detalhado) {
            return "Usuário: " + username.toUpperCase() + "\nRegião: " + regiao;
        } else {
            return exibirDados();
        }
    }

    public boolean pertenceRegiao(String regiaoConsulta) {
        return this.regiao.equalsIgnoreCase(regiaoConsulta);
    }
}
