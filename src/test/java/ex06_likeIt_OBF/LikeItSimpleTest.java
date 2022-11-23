package ex06_likeIt_OBF;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LikeItSimpleTest {
    final private LikeItSimple likeIt = new LikeItSimple();

    @Test
    public void noOne() {
        String result = likeIt.display(new String[]{});
        assertEquals("no one likes this :-(", result);
    }

    @Test
    public void onePerson() {
        String result = likeIt.display(new String[]{"Jos"});
        assertEquals("Jos likes this", result);
    }

    @Test
    public void twoPersons() {
        String result = likeIt.display(new String[]{"Bieke", "Christel"});
        assertEquals("Bieke and Christel like this", result);
    }

    @Test
    public void threePersons() {
        String result = likeIt.display(new String[]{"Marc", "Jef", "Koontal"});
        assertEquals("Marc, Jef and Koontal like this", result);
    }

    @Test
    public void fourPersons() {
        String result = likeIt.display(new String[]{"Lieve", "Tom", "Fouad", "Anna"});
        assertEquals("Lieve, Tom and 2 others like this", result);
    }

    @Test
    public void moreThanFourPersons() {
        String result = likeIt.display(new String[]{"Pia", "Rob", "Lola", "Karla", "Mohammed", "Rudi"});
        assertEquals("Pia, Rob and 4 others like this", result);
    }

    @Test
    public void namesNull() {
        String result = likeIt.display(null);
        assertEquals("", result);
    }

}
