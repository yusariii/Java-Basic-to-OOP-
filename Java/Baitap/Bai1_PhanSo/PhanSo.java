package Baitap.Bai1_PhanSo;

public class PhanSo{
    public int TuSo;
    public int MauSo;

    public PhanSo(){}

    public PhanSo(int TuSo, int MauSo){
        if (MauSo == 0) {
            throw new IllegalArgumentException("Mẫu số không thể bằng 0");
        }
        this.TuSo = TuSo;
        this.MauSo = MauSo;
    }

    public void setTu(int TuSo){
        this.TuSo = TuSo;
    }
    public void setMau(int MauSo){
        this.MauSo = MauSo;
    }
    public int getTu(){
        return this.TuSo;
    }
    public int getMau(){
        return this.MauSo;
    }
    public String toString(){
        return this.TuSo + "/" + this.MauSo;
    }

    public PhanSo cong(PhanSo other){
        PhanSo result = new PhanSo();
        int a = this.MauSo;
        int b = other.MauSo;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        result.MauSo = this.MauSo * other.MauSo / a;
        result.TuSo = result.MauSo * this.TuSo / this.MauSo + result.MauSo * other.TuSo / other.MauSo;
        return result;
    }
    public PhanSo tru(PhanSo other){
        PhanSo result = new PhanSo();
        int a = this.MauSo;
        int b = other.MauSo;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        result.MauSo = this.MauSo * other.MauSo / a;
        result.TuSo = result.MauSo * this.TuSo / this.MauSo - result.MauSo * other.TuSo / other.MauSo;
        return result;
    }
    public PhanSo nhan(PhanSo other){
        PhanSo result = new PhanSo();
        int a = this.TuSo * other.TuSo;
        int b = this.MauSo * other.MauSo;
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        result.MauSo = this.MauSo * other.MauSo / a;
        result.TuSo = this.TuSo * other.TuSo / a;
        return result;
    }
    public PhanSo chia(PhanSo other){
        if (other.TuSo == 0) {
            throw new IllegalArgumentException("Không thể chia cho 0");
        }
        PhanSo nghichdao = new PhanSo();
        nghichdao.TuSo = other.MauSo;
        nghichdao.MauSo = other.TuSo;
        return this.nhan(nghichdao);
    }
}