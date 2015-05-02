package ua.com.verner.back.entity.user;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * author trancer
 * since 08.02.2015.
 */
@Entity
@Table(name = "usertype")
public class UserType implements Serializable {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigDecimal id;

    @Column(name = "name", unique = true)
    private String name;

    @Column(name = "description")
    private String description;

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "UserType{" +
                "description='" + description + '\'' +
                ", name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
