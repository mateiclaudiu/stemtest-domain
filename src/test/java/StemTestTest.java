import domain.partij.PartijSpelOpties;
import domain.spel.GekozenDebatStelling;
import domain.spel.PartijSpel;
import domain.spel.Spel;
import domain.stemtest.AntwoordOptie;
import domain.stemtest.AntwoordPartij;
import domain.spel.Klas;
import domain.spel.Les;
import domain.spel.DebatSpel;
import domain.stemtest.Stelling;
import domain.stemtest.StemTest;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

public class StemTestTest {
    StemTest stemTest;

    @Before
    public void setup() {
        //superAdmin
        maakStemTestAan();
    }

    @Test
    public void partij(){
        Klas klas = new Klas();
        Les les = new Les();
        klas.maakLesAan(les);

        PartijSpel partijSpel = (PartijSpel) new Spel(stemTest);
        les.kiesSoortSpel(partijSpel);

        Stelling stellingUitStemtest1 = stemTest.selecteerStelling(1);
        les.voegStellingToeUitStemTest(stellingUitStemtest1);
        Stelling stellingUitStemtest2 = stemTest.selecteerStelling(2);
        les.voegStellingToeUitStemTest(stellingUitStemtest2);

        //
        partijSpel.voegStellingToeUitStemTest
        partijSpel.zetOpties(new PartijSpelOpties());
    }

    @Test
    public void test() {
        // Leerkracht

        Klas klas = new Klas();
        Les les = new Les();
        klas.maakLesAan(les);

        DebatSpel debatSpel = (DebatSpel) new Spel(stemTest);
        les.kiesSoortSpel(debatSpel);

        Stelling stellingUitStemtest1 = stemTest.selecteerStelling(1);
        les.voegStellingToeUitStemTest(stellingUitStemtest1);
        Stelling stellingUitStemtest2 = stemTest.selecteerStelling(2);
        les.voegStellingToeUitStemTest(stellingUitStemtest2);

        debatSpel.stelKleurenIn("groen","rood","geel");
        GekozenDebatStelling stelling1 = debatSpel.getStelling(1);
        stelling1.argumentToelaten();
        GekozenDebatStelling stelling2 = debatSpel.getStelling(2);
        stelling2.argumentNietToelaten();

        debatSpel.argumentenToelaten();
        debatSpel.argumentenNietToelaten();

        debatSpel.moeilijkeWoordenTonen();
        debatSpel.overSlaanToestaan();


        // leerling 1

        debatSpel.toonAlleStellingenMetHunAntwoordOpties();
        //debatSpel.antwoord(stelling1,  )
    }

    private void maakStemTestAan() {
        stemTest = new StemTest();
        AntwoordOptie eens = new AntwoordOptie("Eens");
        AntwoordOptie oneens = new AntwoordOptie("Oneens");
        AntwoordOptie geenMening = new AntwoordOptie("Geen mening");

        Stelling stelling1 = new Stelling(1);
        stelling1.vulStellingTekstIn("De erfenissenbelastingen moeten verder dalen");

        stelling1.voegAntwoordOptiesToe(Arrays.asList(eens, oneens));

        stelling1.bepaalAntwoordVanPartij(new AntwoordPartij("NVA", oneens));
        stelling1.bepaalAntwoordVanPartij(new AntwoordPartij("SPA", eens));

        Stelling stelling2 = new Stelling(2);
        stelling2.vulStellingTekstIn("Er moeten evenveel vrouwen als mannen in de regering zitten");
        stelling2.bepaalAntwoordVanPartij(new AntwoordPartij("NVA", oneens));
        stelling2.bepaalAntwoordVanPartij(new AntwoordPartij("SPA", eens));

        stemTest.voegStellingToe(stelling2);
    }
}

















