package santiphop.datastructure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by 708 on 8/10/2018.
 */
public class ArrayCollectionTest {
    @Test
    public void testSizeZero() {
        ArrayCollection arrayC = new ArrayCollection(0);
        assertEquals(0, arrayC.size());
    }
}
