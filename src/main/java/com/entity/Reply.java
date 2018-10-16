package com.entity;

public class Reply {
    private Long id;

    private Long wordsId;

    private String content;

    private String artist;

    private long createAt;

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public long getCreateAt() {
        return createAt;
    }

    public void setCreateAt(long createAt) {
        this.createAt = createAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getWordsId() {
        return wordsId;
    }

    public void setWordsId(Long wordsId) {
        this.wordsId = wordsId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        return "Reply{" +
                "id=" + id +
                ", wordsId=" + wordsId +
                ", content='" + content + '\'' +
                ", artist='" + artist + '\'' +
                ", createAt=" + createAt +
                '}';
    }
}