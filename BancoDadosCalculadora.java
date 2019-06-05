package trabalhop2;


import java.sql.*;
import java.sql.Connection;
import javax.swing.JOptionPane;

public class BancoDadosCalculadora {
    
    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;
    

    //Encapsulamento dos Atributos da Conexão
    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        BancoDadosCalculadora.conn = conn;
    }

    public static Statement getStmt() {
        return stmt;
    }

    public static void setStmt(Statement stmt) {
        BancoDadosCalculadora.stmt = stmt;
    }

    public static ResultSet getRs() {
        return rs;
    }

    public static void setRs(ResultSet rs) {
        BancoDadosCalculadora.rs = rs;
    }

    public static Connection conexao() throws ClassNotFoundException, SQLException {

        //registra um driver JDBC
        Class.forName("oracle.jdbc.driver.OracleDriver");

        setConn(DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "hr", "hr"));

        return getConn();
    }
    
    public void desconectar() throws SQLException{
        getConn().close();
    }
    
    public void inserir() throws ClassNotFoundException, SQLException {

        setConn(conexao());
        setStmt(getConn().createStatement());

        try {

            String inserir = "INSERT INTO Calculadora(valor1, valor2, resultado) VALUES (" + CalculadoraWindows.Bvalor1 + "," 
                               + CalculadoraWindows.Bvalor2 + "," + CalculadoraWindows.Bresultado + ")";

            setRs(getStmt().executeQuery(inserir));

            System.out.println("Valores Inserido com Sucesso");

        } catch (SQLException ex) {
            System.out.println(ex);
        }

    }
}
