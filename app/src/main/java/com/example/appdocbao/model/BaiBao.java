package com.example.appdocbao.model;

import java.io.Serializable;

public class BaiBao implements Serializable {
    private String Id;
    private String Tenbb;
    private String Nguonbb;
    private String Thoigiandang;
    private String Hinhbb;

    public BaiBao(String id, String tenbb, String nguonbb, String thoigiandang, String hinhbb) {
        Id = id;
        Tenbb = tenbb;
        Nguonbb = nguonbb;
        Thoigiandang = thoigiandang;
        Hinhbb = hinhbb;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getTenbb() {
        return Tenbb;
    }

    public void setTenbb(String tenbb) {
        Tenbb = tenbb;
    }

    public String getNguonbb() {
        return Nguonbb;
    }

    public void setNguonbb(String nguonbb) {
        Nguonbb = nguonbb;
    }

    public String getThoigiandang() {
        return Thoigiandang;
    }

    public void setThoigiandang(String thoigiandang) {
        Thoigiandang = thoigiandang;
    }

    public String getHinhbb() {
        return Hinhbb;
    }

    public void setHinhbb(String hinhbb) {
        Hinhbb = hinhbb;
    }
}


