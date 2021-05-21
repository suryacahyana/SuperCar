public class MainSuperCar extends SuperCar implements BahanBakar{
    @Override
    public void tampilSuperCar() {
        System.out.println(nama_mobil);
        System.out.println(asal);
        System.out.println(Cc);
        System.out.println(mesin);
    }

    public static void main(String [] args){
        MainSuperCar m = new MainSuperCar();
        m.nama_mobil="Mclaren, LamborGhiniAventador, PaganiHuayra";
        m.asal="pabrik asal=italy";
        m.Cc="Cc=6000";
        m.mesin="Mesin=V12";
        m.tampilSuperCar();
        m.NamaBahanBakar("BahanBakar=PertamaxTurbo");
    }

    @Override
    public void NamaBahanBakar(String nama) {
        System.out.println(nama);
    }
}
