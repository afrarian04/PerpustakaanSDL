package perpustakaan;

import java.io.Serializable;

public class Perpustakaan implements Serializable{
    private String struk;
    private String NIM;
    private String Nama;
    private String Judul;

    public Perpustakaan() {
    }

    public Perpustakaan(String struk, String NIM, String Nama, String Judul) {
        this.struk = struk;
        this.NIM = NIM;
        this.Nama = Nama;
        this.Judul = Judul;
    }

    public String getStruk() {
        return struk;
    }

    public void setStruk(String struk) {
        this.struk = struk;
    }
    
    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJudul() {
        return Judul;
    }

    public void setJudul(String Judul) {
        this.Judul = Judul;
    }
}
