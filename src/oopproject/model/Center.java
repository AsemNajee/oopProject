 /**
  *   >> Al-Reecha .~
  *   << BY : Asem Najee >>
  */

package oopproject.model;

/**
 * @Coder Asem Najee
 * @author Al-Reecha
 */
public class Center {
    String name;
    String location;
    Manager manager;
    boolean verified;

    public Center(String name, String location, Manager manager, boolean verified) {
        this.name = name;
        this.location = location;
        this.manager = manager;
        this.verified = verified;
    }
    
    
    
}
