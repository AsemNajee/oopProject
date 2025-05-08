 /**
  *   >> Al-Reecha .~
  *   << BY : Asem Najee >>
  */

package oopproject.model;

import java.sql.SQLException;
import java.util.LinkedHashMap;
import oopproject.database.Connector;

/**
 * @Coder Asem Najee
 * @author Al-Reecha
 */
public class Book extends Model{
    private static LinkedHashMap<String, String> insertable;
    private static LinkedHashMap<String, String> updateable;
    private static LinkedHashMap<String, String> selectCols;
    static {
        insertable = new LinkedHashMap<>();
        insertable.put("id", "int");
        insertable.put("name", "string");
        
        selectCols = new LinkedHashMap<>();
        selectCols.put("id", "int");
        selectCols.put("name", "string");
        
        updateable = new LinkedHashMap<>();
        updateable.put("name", "string");
    }
    
    public Book() throws SQLException {
        super("books", insertable, updateable, selectCols);
    }

    @Override
    public void createTable() throws SQLException {
        String sql = """
            CREATE TABLE %s (
                 id INT PRIMARY KEY,
                 name VARCHAR(100) NOT NULL
            );
        """.formatted(table);
        var conn = Connector.getInstance().getConnection();
        conn.prepareStatement(sql).execute();
    }
    
}
