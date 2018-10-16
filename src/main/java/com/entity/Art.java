package com.entity;

public class Art {
    private Long id;

    private Integer type;

    private Integer status;

    private Long createAt;

    private Long updateAt;

    private String content;

    private String picture;

    private String updateBy;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy == null ? null : updateBy.trim();
    }

    @Override
    public String toString() {
        return "Art{" +
                "id=" + id +
                ", type=" + type +
                ", status=" + status +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", content='" + content + '\'' +
                ", picture='" + picture + '\'' +
                ", updateBy='" + updateBy + '\'' +
                '}';
    }
}