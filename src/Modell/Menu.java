/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modell;

/**
 *
 * @author Tinh
 */
public class Menu {
    private int id;
    private String name;
    private int giaTien;
    private int loai;
    private int tinhTrang;
    
    public Menu(int id, String name, int giaTien, int loai, int tinhTrang) {
        this.id = id;
        this.name = name;
        this.giaTien = giaTien;
        this.loai = loai;
        this.tinhTrang = tinhTrang;
    }
    
    @Override
    public String toString() {
        return this.name;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the giaTien
     */
    public int getGiaTien() {
        return giaTien;
    }

    /**
     * @param giaTien the giaTien to set
     */
    public void setGiaTien(int giaTien) {
        this.giaTien = giaTien;
    }

    /**
     * @return the loai
     */
    public int getLoai() {
        return loai;
    }

    /**
     * @param loai the loai to set
     */
    public void setLoai(int loai) {
        this.loai = loai;
    }

    /**
     * @return the tinhTrang
     */
    public int getTinhTrang() {
        return tinhTrang;
    }

    /**
     * @param tinhTrang the tinhTrang to set
     */
    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
}
