package perpustakaan;

import java.io.Serializable;

public class ListNode implements Serializable {

    private int elemen;

    public int getElemen() {
        return elemen;
    }

    public void setElemen(int elemen) {
        this.elemen = elemen;
    }
    private Perpustakaan data;
    private ListNode next;
    private ListNode prev;

    public ListNode() {
    }

    public ListNode(Perpustakaan data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public ListNode(String struk, String nim, String nama, String judul) {
        this.data = new Perpustakaan(struk, nim, nama, judul);
        this.next = null;
        this.prev = null;
    }

    public Perpustakaan getData() {
        return data;
    }

    public void setData(Perpustakaan data) {
        this.data = data;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getPrev() {
        return prev;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }
}