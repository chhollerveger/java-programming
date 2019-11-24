package POO.polimorfismo.interfaces;

public class RadioRelogio implements Radio, Despertador {

    @Override
    public void getHora() {
        System.out.println("São 12 Horas!");
    }

    @Override
    public void sintonizarEstacao() {
        System.out.println("Sintonizando 94.3 FM");
    }

    @Override
    public void programarAlarme() {
        System.out.println("Programando alarme para ás 7:00 da manhã.");
    }
}
