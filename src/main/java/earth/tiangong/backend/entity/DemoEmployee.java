package earth.tiangong.backend.entity;

import java.io.Serializable;
import java.time.LocalDate;

import com.baomidou.mybatisplus.annotation.TableName;

/**
 * <p>
 * 
 * </p>
 *
 * @author TianGong
 * @since 2023-12-27
 */
@TableName("public.demo_employee")
public class DemoEmployee implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String firstName;

    private String lastName;

    private LocalDate dateOfBirth;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "DemoEmployee{" +
            "id=" + id +
            ", firstName=" + firstName +
            ", lastName=" + lastName +
            ", dateOfBirth=" + dateOfBirth +
        "}";
    }
}
