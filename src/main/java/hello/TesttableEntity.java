package hello;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TESTTABLE", schema = "PUBLIC", catalog = "DEFAULT")

public class TesttableEntity {
    private int id;
    private String name;
    private String comment;
    private Boolean isactive;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "COMMENT")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "ISACTIVE")
    public Boolean getIsactive() {
        return isactive;
    }

    public void setIsactive(Boolean isactive) {
        this.isactive = isactive;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TesttableEntity that = (TesttableEntity) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(comment, that.comment) &&
                Objects.equals(isactive, that.isactive);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, comment, isactive);
    }
}
