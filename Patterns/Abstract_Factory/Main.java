package Patterns.Abstract_Factory;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Fabricas> fabricas = List.of(new FabricaAndroid(), new FabricaIOS());

        for (Fabricas fabrica : fabricas) {
            new Aplicacao(fabrica).renderizar();
        }
    }
}
