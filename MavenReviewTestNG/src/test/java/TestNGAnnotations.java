import org.testng.annotations.*;

public class TestNGAnnotations {
    @BeforeMethod
    public void before(){
        System.out.println("Before Method");
    }
    @AfterMethod
    public void after(){
        System.out.println("After Method");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("B4 Class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
    @Test
    public void test1(){
        System.out.println("Iam test 1");
    }
    @Test
    public void test2(){
        System.out.println("I am test 2");
    }
    @BeforeSuite
    public void b4Suite(){
        System.out.println("Before suite");
    }
    @AfterSuite
    public static void AfterSuite(){
        System.out.println("After suite");
    }
}

