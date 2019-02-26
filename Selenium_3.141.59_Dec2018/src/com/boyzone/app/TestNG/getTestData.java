package TestN;

import org.testng.annotations.DataProvider;

public class getTestData {
  
	@DataProvider (name="inputs")
	public Object[][] getData()
	{
		return new Object[][]
				{
				{"bmw","001"},
				{"audi","123"},
				{"skoda","111"}
				};
	}
}
