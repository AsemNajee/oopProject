 /**
  *   >> Al-Reecha .~
  *   << BY : Asem Najee >>
  */

package oopproject.model;

import java.util.Date;

/**
 * @Coder Asem Najee
 * @author Al-Reecha
 */
public abstract class Person {
    private String name;
    private Date dateOfBirth;

    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
