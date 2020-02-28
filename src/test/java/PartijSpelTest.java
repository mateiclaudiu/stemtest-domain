import domain.AntwoordOptie;
import domain.AntwoordPartij;
import domain.GekozenStelling;
import domain.Klas;
import domain.Les;
import domain.PartijSpel;
import domain.Stelling;
import domain.StemTest;
import org.junit.Test;

import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.assertThat;

public class PartijSpelTest {

    @Test
    public void name() {
        // given
        // test
        AntwoordOptie eens = new AntwoordOptie("eens");
        AntwoordOptie oneens = new AntwoordOptie("oneens");
        AntwoordPartij antwoordNVA_Stelling1 = new AntwoordPartij("stellingId1", oneens);
        AntwoordPartij antwoordOpenVld_Stelling1 = new AntwoordPartij("stellingId1", eens);
        Stelling stelling1 = new Stelling("stellingId1", "De erfenis belasting moet verder dalen", Arrays.asList(eens, oneens),
                                          Arrays.asList(
                                                  antwoordNVA_Stelling1,
                                                  antwoordOpenVld_Stelling1
                                          )
        );
        StemTest stemTest = new StemTest("id1", "Vlaamse Verkiezingen", new Date(), Arrays.asList(stelling1));
        //when
        // parij spel aanmaak
        Stelling s1 = stemTest.kiesStelling("id1");

        GekozenStelling gekozenStelling1 = new GekozenStelling(s1);

        PartijSpel partijSpel = new PartijSpel(Arrays.asList(gekozenStelling1));
        Les les1 = new Les("1", partijSpel);
        Klas klas = new Klas("1", Arrays.asList(les1));
        //then
        gekozenStelling1.antwoorden("leering1", eens);
        gekozenStelling1.antwoorden("leering2", eens);
        gekozenStelling1.antwoorden("leering3", oneens);

        PartijSpel partijSpelFromRepo = repository.getPartijSpel("1");
        assertThat(partijSpelFromRepo.getStelling()).isNotE

    }
}
