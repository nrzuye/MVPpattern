package com.morisapp.mvppattern.models;

public interface IUser {
    String getEmail();
    String getPassword();
    int isValidData();
}