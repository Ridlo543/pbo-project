/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LENOVO
 */
public class PaketModel {
    private List<Ruangan> ruanganList;

    public List<Ruangan> getRuanganList() {
        return ruanganList;
    }
    
     public PaketModel() {
        // Inisialisasi ruanganList dengan daftar ruangan
        ruanganList = new ArrayList<>();
        ruanganList.add(new Ruangan("Small", 5, 50000));
        ruanganList.add(new Ruangan("Medium", 8, 60000));
        ruanganList.add(new Ruangan("Large", 10, 80000));
        ruanganList.add(new Ruangan("Deluxe", 14, 100000));
        ruanganList.add(new Ruangan("VVIP", 14, 200000));
    }
   
}

