 /**
  *   >> Al-Reecha .~
  *   << BY : Asem Najee >>
  */

package oopproject.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import oopproject.model.Book;

/**
 * @Coder Asem Najee
 * @author Al-Reecha
 */
public class BookController {
    private static Controller instance;
    
    static {
        try {
            instance = new Controller(new Book());
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public static boolean addBook(String id, String name) throws Exception{
        LinkedHashMap<String, String> data = new LinkedHashMap<>();
        data.put("name", name);
        data.put("id", id);
        return instance.store(data);
    }
    
    public static boolean editBook(int id, String name) throws Exception{
        LinkedHashMap<String, String> data = new LinkedHashMap<>();
        data.put("name", name);
        return instance.update(id, data);
    }
    
    public static HashMap<String, Object> getBook(int id) throws SQLException{
        return instance.get(id);
    }
    
    public static ArrayList<HashMap<String, Object>> getBooks() throws SQLException{
        return instance.getAll();
    }
}
