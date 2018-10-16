package com.entity;

public class Words {
    private Long id;

    private Long worksId;

    private String visitor;

    private Boolean status;

    private Long createAt;

    private Long updateAt;

    private String updateBy;

    private String content;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWorksId() {
        return worksId;
    }

    public void setWorksId(Long worksId) {
        this.worksId = worksId;
    }

    public String getVisitor() {
        return visitor;
    }

    public void setVisitor(String visitor) {
        this.visitor = visitor == null ? null : visitor.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "Words{" +
                "id=" + id +
                ", worksId=" + worksId +
                ", visitor='" + visitor + '\'' +
                ", status=" + status +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", updateBy='" + updateBy + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}