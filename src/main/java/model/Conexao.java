    package main.java.model;
    
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;

    import javax.swing.JOptionPane;

    public class Conexao {
        
        public Connection conexaoBD(){
            Connection conn = null;

            try{
                String url = "jdbc:mysql://localhost:3306/SGV?user=root&password=paulinho08";
                conn = DriverManager.getConnection(url);
                JOptionPane.showMessageDialog(null, "Conexao Estabelcida com Sucesso!");
            }catch (SQLException error){
                JOptionPane.showMessageDialog(null, error.getMessage());
            }
            return conn;
        }

    }
