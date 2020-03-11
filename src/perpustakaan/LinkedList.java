package perpustakaan;

import java.io.Serializable;
import javax.swing.JTable;

public class LinkedList implements Serializable {

    private ListNode head;
    private int size;

    public LinkedList() {
        head = new ListNode();
        head.setNext(null);
        head.setPrev(null);
        size = 0;
    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        if((head.getNext() == null && head.getPrev() == null) || head == null){
            return true;
        }
        return false;
    }

    public void add(Perpustakaan data) {
        if (isEmpty()) {
            head.setData(data);
            head.setNext(head);
            head.setPrev(head);
        } else {
            ListNode baru = new ListNode(data);
            baru.setPrev(head.getPrev());
            baru.setNext(head);
            head.getPrev().setNext(baru);
            head.setPrev(baru);
        }
        setSize(getSize() + 1);
    }

    public void add(String struk, String nim, String nama, String judul) {
        Perpustakaan data = new Perpustakaan(struk, nim, nama, judul);
        if (isEmpty()) {
            head.setData(data);
            head.setNext(head);
            head.setPrev(head);
        } else {
            ListNode baru = new ListNode(data);
            baru.setPrev(head.getPrev());
            baru.setNext(head);
            head.getPrev().setNext(baru);
            head.setPrev(baru);
        }
        setSize(getSize() + 1);
    }

    public void print() {
        ListNode help;
        help = head;
        for (int i = 0; i < getSize(); i++) {
            System.out.println("Nomer " + (i + 1));
            System.out.println("No.Struk    : " + help.getData().getStruk());
            System.out.println("NIM         : " + help.getData().getNIM());
            System.out.println("Nama        : " + help.getData().getNama());
            System.out.println("Judul       : " + help.getData().getJudul());
            help = help.getNext();
            System.out.println("");
        }
    }

    void add(JTable tabelMenu) {
        for (int i = 0; i < tabelMenu.getRowCount(); i++) {
            this.add(tabelMenu.getValueAt(i, 0).toString(),
                    tabelMenu.getValueAt(i, 1).toString(),
                    tabelMenu.getValueAt(i, 2).toString(),
                    tabelMenu.getValueAt(i, 3).toString());
        }
    }

    public ListNode search(int element) {
        ListNode bantu = head.getNext();
        while (bantu != head) {
            if (bantu.getElemen() == element) {
                return bantu;
            }
            bantu = bantu.getNext();
        }
        return null;
    }

    public String[] getStruk() {
        ListNode help;
        help = head;
        String[] struk = new String[getSize()];
        for (int i = 0; i < getSize(); i++) {
            struk[i] = help.getData().getStruk();
            help = help.getNext();
        }
        return struk;
    }

    public String[] getNIM() {
        ListNode help;
        help = head;
        String[] NIM = new String[getSize()];
        for (int i = 0; i < getSize(); i++) {
            NIM[i] = help.getData().getNIM();
            help = help.getNext();
        }
        return NIM;
    }

    public String[] getNama() {
        ListNode help;
        help = head;
        String[] nama = new String[getSize()];
        for (int i = 0; i < getSize(); i++) {
            nama[i] = help.getData().getNama();
            help = help.getNext();
        }
        return nama;
    }

    public String[] getJudul() {
        ListNode help;
        help = head;
        String[] judul = new String[getSize()];
        for (int i = 0; i < getSize(); i++) {
            judul[i] = help.getData().getJudul();
            help = help.getNext();
        }
        return judul;
    }
}
