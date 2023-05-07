package ru.maxima.projectmaximaedo.models;

import java.time.LocalDateTime;

public class User {
    /**
     * id юзера
     */
    private Long id;
    /**
     * логин
     */
    private String login;
    /**
     * пароль
     */
    private String password;
    /**
     * Время создание
     */
    private LocalDateTime createdAt;
    /**
     * Время обновления
     */
    private LocalDateTime updatedAt;
    /**
     * Роль
     */
    private String role;
    /**
     * Имя
     */
    private String firstName;
    /**
     * Фамилия
     */
    private String lastName;
    /**
     * Отчество
     */
    private String patronymic;
    /**
     * Телеграм
     */
    private String telegram;
    /**
     * Почта
     */
    private String email;
    /**
     * Последний визит
     */
    private LocalDateTime lastVisit;
    /**
     * Флаг удаления
     */
    private Boolean isRemoved;

    public User() {
    }

    public User(Long id, String login, String password, LocalDateTime createdAt, LocalDateTime updatedAt, String role,
                String firstName, String lastName, String patronymic, String telegram, String email,
                LocalDateTime lastVisit, Boolean isRemoved) {
        this.id = id;
        this.login = login;
        this.password = password;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.telegram = telegram;
        this.email = email;
        this.lastVisit = lastVisit;
        this.isRemoved = isRemoved;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
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

    public LocalDateTime getLastVisit() {
        return lastVisit;
    }

    public void setLastVisit(LocalDateTime lastVisit) {
        this.lastVisit = lastVisit;
    }

    public Boolean getRemoved() {
        return isRemoved;
    }

    public void setRemoved(Boolean removed) {
        isRemoved = removed;
    }
}
