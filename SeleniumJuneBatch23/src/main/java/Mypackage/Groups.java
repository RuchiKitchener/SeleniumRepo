package Mypackage;
import org.testng.annotations.Test;
public class Groups {
	@Test(groups= {"Electronics"})
	public void test1() {
		System.out.println("Electronics");
	}
	@Test(groups= {"Electronics"})
	public void test2() {
		System.out.println("Electronics");
	}
	@Test(groups={"Fashion"})
	public void test3() {
		System.out.println("Fashion");
	}
	@Test(groups={"Fashion"})
	public void test4() {
		System.out.println("Fashion");
	}
	@Test(groups={"Kids"})
	public void test5() {
		System.out.println("Kids");
	}
	@Test(groups={"Kids"})
	public void test6() {
		System.out.println("Kids");
	}
}
