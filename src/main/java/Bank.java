public class Bank {
    private double saldo;
    public Bank (double saldoAwal){
        saldo = saldoAwal;}
    public double simpanUang(double jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.println("Berhasil menyimpan uang sejumlah " + jumlah + " ke dalam akun.");
        } else {
            System.out.println("Jumlah yang dimasukkan tidak valid (harus lebih dari 0).");
        }return jumlah;
    }
    public double ambilUang(double jumlah) {
        if (jumlah > 0 && saldo >= jumlah) {
            saldo -= jumlah;
            System.out.println("Berhasil menarik uang sejumlah " + jumlah + " dari tabungan Anda.");
        } else {
            System.out.println("Jumlah yang dimasukkan tidak valid (harus lebih dari 0).");
        }return jumlah;}
    public double getSaldo() {return saldo;
    }
}


