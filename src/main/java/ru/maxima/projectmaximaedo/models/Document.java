package ru.maxima.projectmaximaedo.models;

import java.time.LocalDateTime;

public class Document {
    /**
     * id документа
     */
    private Long id;
    /**
     * название документа
     */
    private String name;
    /**
     * дата создания
     */
    private LocalDateTime createdAt;
    /**
     * регистрационный номер документа
     */
    private String registryNumber;
    /**
     *ссылка на шаблон документа
     */
//    private DocumentTemplate template;
//    /**
//     * ссылка на контрагента
//     */
//    private Partner partner;
//    /**
//     * ссылка на файлы
//     */
//    private List<File> files;
    /**
     * ссылка на пользователя
     */
//    private User user;
    /**
     * флаг удаления
     */
    private Boolean isRemoved;

    public Document() {
    }

//    public Document(Long id, String name, LocalDateTime createdAt, String registryNumber,
//                    DocumentTemplate template, Partner partner, List<File> files, Boolean isRemoved) {
//        this.id = id;
//        this.name = name;
//        this.createdAt = createdAt;
//        this.registryNumber = registryNumber;
//        this.template = template;
//        this.partner = partner;
//        this.files = files;
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

    public String getRegistryNumber() {
        return registryNumber;
    }

    public void setRegistryNumber(String registryNumber) {
        this.registryNumber = registryNumber;
    }

//    public DocumentTemplate getTemplate() {
//        return template;
//    }

//    public void setTemplate(DocumentTemplate template) {
//        this.template = template;
//    }
//
//    public Partner getPartner() {
//        return partner;
//    }
//
//    public void setPartner(Partner partner) {
//        this.partner = partner;
//    }
//
//    public List<File> getFiles() {
//        return files;
//    }
//
//    public void setFiles(List<File> files) {
//        this.files = files;
//    }

    public Boolean getRemoved() {
        return isRemoved;
    }

    public void setRemoved(Boolean removed) {
        isRemoved = removed;
    }

    /**
     * добавление файла в список
     */
//    public void addFile(File file) {
//        if(file != null) {
//            this.files.add(file);
//            file.getFile().add(this);
//        }else{
//            throw(new  NullPointerException());
//        }
//    }

    /**
     * удаление файла из списка
     */
//    public boolean removeFile(long fileId) {
//        File file = this.files.stream().filter(f -> f.getId() == fileId).findFirst().orElse(null);
//        if (file != null) {
//            this.files.remove(file);
//            file.getFile().remove(this);
//            return true;
//        }
//        return false;
//    }
}

