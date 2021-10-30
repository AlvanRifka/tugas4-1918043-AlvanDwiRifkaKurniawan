package com.example.tugas4_1918043_alvandwirifkakurniawan;

public class Mahasiswa {
    private String nama,chat;
    private int logo;
    public Mahasiswa(String nama, String chat, int logo){
        this.nama = nama;
        this.chat = chat;
        this.logo = logo;
    }
    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama = nama;
    }
    public String getChat(){
        return chat;
    }
    public void setNim(String chat){
        this.chat = chat;
    }
    public int getLogo() {
        return logo;
    }
    public void setLogo(int logo) {
        this.logo = logo;
    }
}
