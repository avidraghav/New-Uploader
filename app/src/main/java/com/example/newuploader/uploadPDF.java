package com.example.newuploader;

public class uploadPDF {
    public String name;
    public  String url;

    public uploadPDF() {
    }

    public uploadPDF(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getUrl() {
        return url;
    }

}
