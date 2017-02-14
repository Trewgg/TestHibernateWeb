package test.entity;

import javax.persistence.*;


@Entity
@Table(name = "roles", schema = "test_schema")
public class RolesEntity {
    private int idroles;
    private String roleName;

    @Id
    @Column(name = "idroles", nullable = false)
    public int getIdroles() {
        return idroles;
    }

    public void setIdroles(int idroles) {
        this.idroles = idroles;
    }

    @Basic
    @Column(name = "role_name", nullable = false, length = 45)
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RolesEntity that = (RolesEntity) o;

        if (idroles != that.idroles) return false;
        if (roleName != null ? !roleName.equals(that.roleName) : that.roleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idroles;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }
}
