package equipamentos.multifuncional;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void imprimir() {
        System.out.println("Imprimindo pelo equipamento multifuncional");
    }

    public void digitalizar() {
        System.out.println("Digitalizando pelo equipamento multifuncional");
    }

    public void copiar() {
        System.out.println("Copiando pelo equipamento multifuncional");
    }
    
}