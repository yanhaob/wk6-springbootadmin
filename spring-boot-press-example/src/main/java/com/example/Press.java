package com.example;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Press {
    @Id
    private Long id;
    private String title;
    private String content;
    //
    public Press() {
    }
    //
    public Press(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }
    //Getter and Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
