import br.senai.jandira.sp.Model.Azul;
import br.senai.jandira.sp.Model.Gol;
import br.senai.jandira.sp.Model.Latam;
import br.senai.jandira.sp.Model.Passaredo;

public class Menu {

    public void executarMenu (){
        Gol vooGol1 = new Gol("GL-444", "São Paulo", "Rio denJaneiro", "12-12-2023", 90);
        Gol vooGol2 =  new Gol("GL-555", "Piauí", "Acre", "23-09-2023", 78);
        Gol vooGol3 = new Gol("GL-444", "Maranhão", "Pernambuco", "02-09-2023", 85);

        Azul vooAzul1 = new Azul("AZ-999", "Mato Grosso", "Praíba", "30-04-2023", 80);
        Azul vooAzul2 = new Azul("AZ-111", "Bahia", "Ceará", "24-12-2023", 70);
        Azul vooAzul3 = new Azul("AZ-888", "Paraná", "Alagoas", "09-10-2023", 90);

        Latam vooLatam1 = new Latam("LT-222", "Amazonas", "Pará", "15-11-2023", 60);
        Latam vooLatam2 = new Latam("LT-555", "Espírito Santo", "Rio de Janeiro", "23-05-2023", 85);
        Latam vooLatam3 = new Latam("LT-777", "Amapá", "Sergipe", "01-08-2023", 70);

        Passaredo vooPassaredo1 = new Passaredo("PS-345", "São Paulo", "Amazonas", "14-09-2023", 90);
        Passaredo vooPassaredo2 = new Passaredo("PS- 876", "Recife", "Alagoas", "17-07-2023", 80);
        Passaredo vooPassaredo3 = new Passaredo("PS-543", "Pernambuco", "Bahia", "06-06-2023", 75);
    }
}
