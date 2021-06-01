package com.example.retrofitdemo.Bean;

public class Bean_status {
    String status,api_version,api_status,lang,unit,timezone;
    int tzshift,server_time;

    public Bean_status(String status, String api_version, String api_status, String lang,
                       String unit, String timezone, int tzshift, int server_time)
    {
        this.status = status;
        this.api_version = api_version;
        this.api_status = api_status;
        this.lang = lang;
        this.unit = unit;
        this.timezone = timezone;
        this.tzshift = tzshift;
        this.server_time = server_time;
    }

    public Bean_status() {
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public String getApi_status() {
        return api_status;
    }

    public void setApi_status(String api_status) {
        this.api_status = api_status;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getTzshift() {
        return tzshift;
    }

    public void setTzshift(int tzshift) {
        this.tzshift = tzshift;
    }

    public int getServer_time() {
        return server_time;
    }

    public void setServer_time(int server_time) {
        this.server_time = server_time;
    }
}
