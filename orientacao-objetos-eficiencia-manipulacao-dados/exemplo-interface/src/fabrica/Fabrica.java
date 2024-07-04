package fabrica;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.DeskJet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.LaserJet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();

        Impressora impressora = scanner;
        Digitalizadora digitalizadora = scanner;
        Copiadora copiadora = scanner;


        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();
    }
}
