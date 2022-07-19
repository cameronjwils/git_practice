import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BearTest {

    Bear bear;
    @Before
    public void before(){
        bear = new Bear("Baloo", 25, 95.62, 'F');
    }
    @Test
    public void hasName(){
        assertEquals("Baloo", bear.getName());
    }
    @Test
    public void hasAge() {
        assertEquals(25, bear.getAge());
    }
    @Test
    public void hasWeight() {
        assertEquals(95.62, bear.getWeight(), 0);
    }
    @Test
    public void readyToHibernateIfGreaterThan80() {
        assertEquals(true, bear.readyToHibernate());
    }
    @Test
    public void notReadyToHibernateIfLessThan80() {
        Bear bear = new Bear("Barry",21,65.44, 'M');
        assertEquals(false, bear.readyToHibernate());
    }
    @Test
    public void hasGender() {
        Bear bear = new Bear("Barry",21,65.44, 'M');
        assertEquals('M', bear.getGender());
    }
}
