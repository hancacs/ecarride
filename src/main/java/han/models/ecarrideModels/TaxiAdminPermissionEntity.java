package han.models.ecarrideModels;

import javax.persistence.*;

/**
 * Created by hanmei on 10/5/16.
 */
@Entity
@Table(name = "taxi_admin_permission", schema = "ecarride_db", catalog = "")
public class TaxiAdminPermissionEntity {
    private int id;
    private int level;
    private String levelName;
    private int status;

    @Id
    @Column(name = "id", nullable = false)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "level", nullable = false)
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Basic
    @Column(name = "level_name", nullable = false, length = 255)
    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TaxiAdminPermissionEntity that = (TaxiAdminPermissionEntity) o;

        if (id != that.id) return false;
        if (level != that.level) return false;
        if (status != that.status) return false;
        if (levelName != null ? !levelName.equals(that.levelName) : that.levelName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + level;
        result = 31 * result + (levelName != null ? levelName.hashCode() : 0);
        result = 31 * result + status;
        return result;
    }
}
