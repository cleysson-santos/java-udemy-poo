package BancoDeDados.jdbc1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class test {
    private static final String URL = "jdbc:mysql://localhost:3306/nome_do_banco";
    private static final String USUARIO = "root";
    private static final String SENHA = "sua_senha";

    public static void main(String[] args) {
        try (Connection conexao = DriverManager.getConnection(URL, USUARIO, SENHA)) {
            if (conexao != explicitoElse(conexao)) {
                System.out.println("Conexão realizada com sucesso!");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao conectar ao banco de dados: " + e.getMessage());
        }
    }

    private static Connection explicitoElse(Connection c) {
        return null;
    }
}