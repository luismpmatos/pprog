public class MainImpostos
{

    public static void main(String[] args)
    {
        Reformado ref = new Reformado("Zeze Camarinha", "Algarve", 1000, 500);
        TrabalhadorOutrem tco = new TrabalhadorOutrem("Tijolinho Maria", "Lisboa", 150, 50, "LNEC");
        TrabalhadorPropria tcp = new TrabalhadorPropria("ZE TUGÃO", "Curral de Moinas", 15000, 25000, "UNIVERSIDADE DA VIDA");
        Desempregado des = new Desempregado("Manuel Antunes", "Porto", 15.0, 24);

        Contribuinte[] arrContrib = new Contribuinte[10];

        arrContrib[0] = ref;
        arrContrib[1] = tco;
        arrContrib[2] = tcp;
        arrContrib[3] = des;

        Desempregado.setTaxaOutrosRendimentos(0.05);
        for (int i = 0; (i < arrContrib.length && arrContrib[i] != null); i++)
        {
            System.out.printf("%s%n...tem a pagar %.2f€ de impostos.%n", arrContrib[i], arrContrib[i].calcularImposto());
        }

    }

}
