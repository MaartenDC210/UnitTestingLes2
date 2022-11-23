package ex06_likeIt_OBF;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LikeItSimpleTest {
    final private LikeItSimple likeIt = new LikeItSimple();

    @Test
    public void noOne() {
        String result = likeIt.displayLikes(new String[]{});
        assertEquals("no one likes this :-(", result);
    }

    @Test
    public void onePerson() {
        String result = likeIt.displayLikes(new String[]{"Jos"});
        assertEquals("Jos likes this", result);
    }

    @Test
    public void twoPersons() {
        String result = likeIt.displayLikes(new String[]{"Bieke", "Christel"});
        assertEquals("Bieke and Christel like this", result);
    }

    @Test
    public void threePersons() {
        String result = likeIt.displayLikes(new String[]{"Marc", "Jef", "Koontal"});
        assertEquals("Marc, Jef and Koontal like this", result);
    }

    @Test
    public void fourPersons() {
        String result = likeIt.displayLikes(new String[]{"Lieve", "Tom", "Fouad", "Anna"});
        assertEquals("Lieve, Tom and 2 others like this", result);
    }

    @Test
    public void moreThanFourPersons() {
        String result = likeIt.displayLikes(new String[]{"Pia", "Rob", "Lola", "Karla", "Mohammed", "Rudi"});
        assertEquals("Pia, Rob and 4 others like this", result);
    }

    @Test
    public void namesNull() {
        String result = likeIt.displayLikes(null);
        assertEquals("", result);
    }

}
