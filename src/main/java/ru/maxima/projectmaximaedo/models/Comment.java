package ru.maxima.projectmaximaedo.models;

import java.time.LocalDateTime;

public class Comment {
    /**
     * id документа
     */
    private Long id;
    /**
     * Текст
     */
    private String text;
    /**
     * Время создания
     */
    private LocalDateTime createdAt;
    /**
     * Ссылка на контрагента
     */
    //private Partner partner;
    /**
     * Флаг удаления
     */
    private Boolean isRemoved;

    public Comment() {
    }

    public Comment(Long id, String text, LocalDateTime createdAt, Boolean isRemoved) {
        this.id = id;
        this.text = text;
        this.createdAt = createdAt;
        this.isRemoved = isRemoved;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Boolean getRemoved() {
        return isRemoved;
    }

    public void setRemoved(Boolean removed) {
        isRemoved = removed;
    }
}
