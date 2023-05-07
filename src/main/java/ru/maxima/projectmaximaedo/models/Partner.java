package ru.maxima.projectmaximaedo.models;

import org.springframework.boot.autoconfigure.ldap.embedded.EmbeddedLdapProperties;

public class Partner {
    /** id контрагента */
    private Long id;
    /** Отчество */
    private String patronymic;
    /** имя */
    private String firstName;
    /** Фамилия */
    private String LastName;
    /** Телефон */
    private String phone;
    /** телеграм */
    private String telegram;
    /** почта Email */
    private String email;
    /** Страна */
    private String country;
    /** Ссылка на сущность Комментарий */
//    private Comment comment;
//    /** сылка на сущность Credential (полномочия) */
//    private Credential credential;
    /** флаг удаления */
    private boolean isRemoved;

    public Partner() {
    }

//    public Partner(Long id, String patronymic, String firstName, String lastName, String phone, String telegram,
//                   String email, String country, Comment comment, Credential credential, boolean isRemoved) {
//        this.id = id;
//        this.patronymic = patronymic;
//        this.firstName = firstName;
//        LastName = lastName;
//        this.phone = phone;
//        this.telegram = telegram;
//        this.email = email;
//        this.country = country;
//        this.comment = comment;
//        this.credential = credential;
//        this.isRemoved = isRemoved;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTelegram() {
        return telegram;
    }

    public void setTelegram(String telegram) {
        this.telegram = telegram;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

//    public Comment getComment() {
//        return comment;
//    }
//
//    public void setComment(Comment comment) {
//        this.comment = comment;
//    }
//
//    public Credential getCredential() {
//        return credential;
//    }
//
//    public void setCredential(Credential credential) {
//        this.credential = credential;
//    }

    public boolean isRemoved() {
        return isRemoved;
    }

    public void setIsRemoved(boolean isRemoved) {
        this.isRemoved = isRemoved;
    }

}
