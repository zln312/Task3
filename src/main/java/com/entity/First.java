package com.entity;

public class First {
    private Long id;

    private String name;

    private Boolean status;

    private Long createAt;

    private Long updateAt;

    private String updateBy;

    private Long secondId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Long createAt) {
        this.createAt = createAt;
    }

    public Long getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Long updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    public Long getSecondId() {
        return secondId;
    }

    public void setSecondId(Long secondId) {
        this.secondId = secondId;
    }

    @Override
    public String toString() {
        return "First{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", status=" + status +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", updateBy='" + updateBy + '\'' +
                ", secondId=" + secondId +
                '}';
    }
}