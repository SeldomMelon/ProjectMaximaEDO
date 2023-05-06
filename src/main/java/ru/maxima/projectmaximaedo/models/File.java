package ru.maxima.projectmaximaedo.models;

public class File {
    /** id файла */
    private Long id;
    /** Название файла */
    private String name;
    /** Наименование хранилища */
    private String nameOfStorage;
    /** Размер */
    private Long size;
    /** Тип файла */
    private String mimeType;
    /** Описание */
    private String description;
    /** Ссылка на документ */
//    private Document document;
    /** флаг удаления */
    private boolean isRemoved;

    public File() {
    }

//    public File(Long id, String name, String nameOfStorage, Long size, String mimeType, String description,
//                Document document, boolean isRemoved) {
//        this.id = id;
//        this.name = name;
//        this.nameOfStorage = nameOfStorage;
//        this.size = size;
//        this.mimeType = mimeType;
//        this.description = description;
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

    public String getNameOfStorage() {
        return nameOfStorage;
    }

    public void setNameOfStorage(String nameOfStorage) {
        this.nameOfStorage = nameOfStorage;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
