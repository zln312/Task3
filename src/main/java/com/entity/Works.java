package com.entity;

public class Works {
    private Long id;

    private String name;

    private String littlePicture;

    private String link;

    private String mainPicture;

    private String littleWord;

    private String mainWord;

    private Long firstId;

    private Long  sencondId;

    public Long getFirstId() {
        return firstId;
    }

    public void setFirstId(Long firstId) {
        this.firstId = firstId;
    }

    public Long getSencondId() {
        return sencondId;
    }

    public void setSencondId(Long sencondId) {
        this.sencondId = sencondId;
    }

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

    public String getLittlePicture() {
        return littlePicture;
    }

    public void setLittlePicture(String littlePicture) {
        this.littlePicture = littlePicture == null ? null : littlePicture.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public String getMainPicture() {
        return mainPicture;
    }

    public void setMainPicture(String mainPicture) {
        this.mainPicture = mainPicture == null ? null : mainPicture.trim();
    }

    public String getLittleWord() {
        return littleWord;
    }

    public void setLittleWord(String littleWord) {
        this.littleWord = littleWord == null ? null : littleWord.trim();
    }

    public String getMainWord() {
        return mainWord;
    }

    public void setMainWord(String mainWord) {
        this.mainWord = mainWord == null ? null : mainWord.trim();
    }

    @Override
    public String toString() {
        return "Works{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", littlePicture='" + littlePicture + '\'' +
                ", link='" + link + '\'' +
                ", mainPicture='" + mainPicture + '\'' +
                ", littleWord='" + littleWord + '\'' +
                ", mainWord='" + mainWord + '\'' +
                ", firstId=" + firstId +
                ", sencondId=" + sencondId +
                '}';
    }
}