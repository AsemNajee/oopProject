/**
 *   >> Al-Reecha .~
 *   << BY : Asem Najee >>
 */
package oopproject;

import java.sql.SQLException;
import oopproject.controller.BookController;

/**
 *
 * @author PC
 */
public class OOPProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, Exception {
//        BookController.addBook("1", "Asem");
//        BookController.addBook("2", "Ali");
//        BookController.addBook("3", "Ahmed");
//        BookController.editBook(3, "Ahmed edit");
        System.out.println(BookController.getBook(1));
        System.out.println("--");
        System.out.println(BookController.getBooks());
    }
    
}
