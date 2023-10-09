public class BankBeraksi {
    public static void main(String[] args){
        Bank bankMark = new Bank(100000);
        System.out.println("Selamat Datang di Bank ABC");
        System.out.println("Saldo Anda saat ini : " + bankMark.getSaldo());
        System.out.println();

        System.out.println(bankMark.simpanUang(500000));
        System.out.println("Saldo Anda saat ini : " + bankMark.getSaldo());
        System.out.println();

        System.out.println(bankMark.ambilUang(150000));
        System.out.println("Saldo Anda saat ini : " + bankMark.getSaldo());
    }
}

