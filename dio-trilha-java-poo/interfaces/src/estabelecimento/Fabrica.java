package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {

        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Deskjet deskjet = new Deskjet();


        Impressora impressora = deskjet;
        Digitalizadora digitalizadora = em;
        //Digitalizadora digitalizadora = deskjet; // error pois deskjet pode apenas imprimir.
        Copiadora copiadora = em;  // não tem erro pois ele é multifuncional podendo fazer as 3 ações

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
