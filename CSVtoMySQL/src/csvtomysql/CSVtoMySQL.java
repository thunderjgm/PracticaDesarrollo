package csvtomysql;

import java.sql.*;

public class CSVtoMySQL {

    public static void main(String[] args) throws SQLException {
        
        // Instancias la clase que hemos creado anteriormente
        Conexion SQL = new Conexion();
        // Llamas al método que tiene la clase y te devuelve una conexión
        Connection conn = SQL.conectarMySQL();
        // Query que usarás para hacer lo que necesites
        String cleandb = "truncate table login";
        PreparedStatement pstm1 = conn.prepareStatement(cleandb);
        pstm1.executeUpdate(cleandb);
        String LoadCSV = "LOAD DATA INFILE 'csv.csv'\n" +
        "INTO TABLE login\n" +
        "FIELDS TERMINATED BY ';'\n" +
        "OPTIONALLY ENCLOSED BY '\"'\n" +
        "LINES TERMINATED BY '\\r\\n'\n" +
        "IGNORE 1 ROWS;";
        PreparedStatement pstm2 = conn.prepareStatement(LoadCSV);
        pstm2.executeQuery();        
    }
    
}
