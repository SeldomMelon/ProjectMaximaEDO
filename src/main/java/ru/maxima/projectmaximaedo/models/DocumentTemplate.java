package ru.maxima.projectmaximaedo.models;

import java.sql.Timestamp;
import java.time.LocalDateTime;

public class DocumentTemplate {
    /** id шаблон документа */
    private Long id;
    /** Название */
    private String name;
    /** Время создания */
    private LocalDateTime createdAt;
    /** Версия */
    private Integer version;
    /** Ссылка на документ*/
//    private Document document;
    /** Флаг удаления */
    private boolean isRemoved;

    public DocumentTemplate() {
    }

//    public DocumentTemplate(Long id, String name, LocalDateTime createdAt, Integer version, Document document,
//                            boolean isRemoved) {
//        this.id = id;
//        this.name = name;
//        this.createdAt = createdAt;
//        this.version = version;
//        this.document = document;
//        this.isRemoved = isRemoved;
//    }

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
        this.name = name;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

//    public Document getDocument() {
//        return document;
//    }
//
//    public void setDocument(Document document) {
//        this.document = document;
//    }

    public boolean isRemoved() {
        return isRemoved;
    }

    public void setRemoved(boolean removed) {
        isRemoved = removed;
    }
}
