import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import binarysearch.Binarysearch;
/**
 *
 * @author Adison
 */
public class binarysearchUnitTest {
    
    public binarysearchUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        System.out.println("Before class");
    }
    
    @AfterClass
    public static void tearDownClass() {
        System.out.println("After class");
    }
    
    @Before
    public void setUp() {
        System.out.println("Before");
    }
    
    @After
    public void tearDown() {
        System.out.println("After");
    }

    @Test
    public void testBinarySearchExistingNum() {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        int index = Binarysearch.binarySearch(array, target);
        assertEquals(5, index);
    }

    @Test
    public void testBinarySearchNonExistingNum() {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 45;

        int index = Binarysearch.binarySearch(array, target);
        assertEquals(-1, index);
    }

    @Test
    public void testBinarySearchEmptyNum() {
        int[] array = {};
        int target = 10;

        int index = Binarysearch.binarySearch(array, target);
        assertEquals(-1, index);
    }

    @Test
    public void testBinarySearchFirstNum() {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 2;

        int index = Binarysearch.binarySearch(array, target);
        assertEquals(0, index);
    }

    @Test
    public void testBinarySearchLastNum() {
        int[] array = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 91;

        int index = Binarysearch.binarySearch(array, target);
        assertEquals(9, index);
    }
}