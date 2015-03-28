package tests.tablet.homeUI;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import framework.pages.tablet.HomeTabletPage;
import framework.pages.tablet.SchedulePage;

/**
 * TC21: Verify that schedule page is displayed when Now Tape is clicked when no 
 * event is scheduled
 * @author Jose Cabrera
 */
public class SchedulePageIsDisplayedWhenNowTapeIsClicked {
	SchedulePage schedulePage;
	@Test(groups = "UI")
	public void testSchedulePageIsDisplayedWhenNowTapeIsClicked () {
		HomeTabletPage homePage = new HomeTabletPage();
		schedulePage = homePage.clickNowTileLbl();
		Assert.assertTrue(schedulePage.isSchedulerLblDisplayed());
	}

	@AfterClass(groups = "UI")
	public void toHome() {
		schedulePage.clickBackBtn();
	}
}
