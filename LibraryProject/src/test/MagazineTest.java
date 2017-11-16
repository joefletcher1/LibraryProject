package test;
import main.Magazine;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class MagazineTest {

    private Magazine magazine;

    @Before
    public void instantiateMagazine() {
        magazine = new Magazine();
    }

    @Test
    public void emptyMagazinePublisherIsNull(){
        assertNull(magazine.getPublisher());
    }
}
