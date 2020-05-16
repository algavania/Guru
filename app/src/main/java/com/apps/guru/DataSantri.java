package com.apps.guru;

public class DataSantri {

    private String namaSantri, kelompokBelajar, tanggalJurnal;

    public DataSantri (String namaSantri, String kelompokBelajar, String tanggalJurnal){
        this.namaSantri = namaSantri;
        this.kelompokBelajar = kelompokBelajar;
        this.tanggalJurnal = tanggalJurnal;
    }

    public String getNamaSantri() {
        return namaSantri;
    }

    public String getKelompokBelajar() {
        return kelompokBelajar;
    }

    public String getTanggalJurnal() {
        return tanggalJurnal;
    }
}
