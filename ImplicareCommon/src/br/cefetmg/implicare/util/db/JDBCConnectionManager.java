package br.cefetmg.implicare.util.db;

/**
 *
 * @author Gabriel
 */
import java.sql.Connection;
import java.sql.SQLException;

public class JDBCConnectionManager {

    private static JDBCConnectionManager conexao;
    private static JDBCConnectionFactory cf;

    private JDBCConnectionManager() {
        JDBCConnectionManager.cf = new JDBCPostegresqlConnection();
    }

    public static JDBCConnectionManager getInstance() {
        if (conexao == null) {
            conexao = new JDBCConnectionManager();
        }

        return conexao;
    }

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        return JDBCConnectionManager.cf.getConnection();
    }
}
