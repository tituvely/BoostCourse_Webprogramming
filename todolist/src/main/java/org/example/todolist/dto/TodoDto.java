package org.example.todolist.dto;

public class TodoDto {
    private Long id;
    private String name;
    private String regDate;
    private Integer sequence;
    private String title;
    private String type;

    public TodoDto() {

    }

    public TodoDto(Long id, String name, String regDate, Integer sequence, String title, String type) {
        super();
        this.id = id;
        this.name = name;
        this.regDate = regDate;
        this.sequence = sequence;
        this.title = title;
        this.type = type;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getRegDate() {
        return regDate;
    }

    public Integer getSequence() {
        return sequence;
    }

    public String getTitle() {
        return title;
    }

    public String getType() {
        return type;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegDate(String regDate) {
        this.regDate = regDate;
    }

    public void setSequence(Integer sequence) {
        this.sequence = sequence;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "TodoDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", regDate='" + regDate + '\'' +
                ", sequence=" + sequence +
                ", title='" + title + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}