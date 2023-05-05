package ru.maxima.projectmaximaedo.models;

import ru.maxima.projectmaximaedo.models.enums.FieldType;

public class DocumentTemplateField {
    /**
     * Наименование поля
     */
    private String name;
    /**
     * Тип поля
     */
    private FieldType fieldType;
    /**
     * Плейсхолдер
     */
    private String placeholder;
    /**
     * Значение по умолчанию
     */
    private String defaultValue;
    /**
     *  ссылка на документ
     */
    private Document document;

    public DocumentTemplateField() {
    }

    public DocumentTemplateField(String name,FieldType fieldType, String placeholder,
                                 String defaultValue, Document document) {
        this.name = name;
        this.fieldType = fieldType;
        this.placeholder = placeholder;
        this.defaultValue = defaultValue;
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FieldType getFieldType() {
        return fieldType;
    }

    public void setFieldType(FieldType fieldType) {
        this.fieldType = fieldType;
    }

    public String getPlaceholder() {
        return placeholder;
    }

    public void setPlaceholder(String placeholder) {
        this.placeholder = placeholder;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Document getDocument() {
        return document;
    }

    public void setDocument(Document document) {
        this.document = document;
    }
}
