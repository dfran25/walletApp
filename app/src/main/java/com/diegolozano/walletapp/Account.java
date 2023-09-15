package com.diegolozano.walletapp;

import androidx.annotation.NonNull;

public class Account {

  private String name;
  private String type;
  private Double currentValue;

  private String imagenUrl;

    public Account(String name, String type, Double currentValue, String imagenUrl) {
        this.name = name;
        this.type = type;
        this.currentValue = currentValue;
        this.imagenUrl = imagenUrl;
    }

    public String getImagenUrl() {
        return imagenUrl;
    }

    public void setImagenUrl(String imagenUrl) {
        this.imagenUrl = imagenUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(Double currentValue) {
        this.currentValue = currentValue;
    }
}
