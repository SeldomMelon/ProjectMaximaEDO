package ru.maxima.projectmaximaedo.models;

import ru.maxima.projectmaximaedo.models.enums.CredentialType;

import java.time.LocalDateTime;

public class Credential {
    /**
     * id учетных данных
     */
    private Long id;
    /**
     * текст
     */
    private String text;
    /**
     * время создания
     */
    private LocalDateTime createdAt;
    /**
     * версия
     */
    private Integer version;
    /**
     *тип лица: физ лицо, юр лицо
     */
    private CredentialType credentialType;
    /**
     * ссылка на контрагента
     */
//    private Partner partner;
    /**
     * флаг удаления
     */
    private Boolean isRemoved;

    public Credential() {
    }

//    public Credential(Long id, String text, LocalDateTime createdAt, Integer version,
//                      CredentialType credentialType, Partner partner, Boolean isRemoved) {
//        this.id = id;
//        this.text = text;
//        this.createdAt = createdAt;
//        this.version = version;
//        this.credentialType = credentialType;
//        this.partner = partner;
//        this.isRemoved = isRemoved;
//    }

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

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public CredentialType getCredentialType() {
        return credentialType;
    }

    public void setCredentialType(CredentialType credentialType) {
        this.credentialType = credentialType;
    }

//    public Partner getPartner() {
//        return partner;
//    }
//
//    public void setPartner(Partner partner) {
//        this.partner = partner;
//    }

    public Boolean getRemoved() {
        return isRemoved;
    }

    public void setRemoved(Boolean removed) {
        isRemoved = removed;
    }
}
