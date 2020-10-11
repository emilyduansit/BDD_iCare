package thebigbang.com.icare.PageObject;

import thebigbang.com.icare.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static thebigbang.com.icare.PageObject.RegisterPage.testname;




public class UserListPage extends BasePage {

    public RegisterPage addUser() throws InterruptedException {
        Thread.sleep(10000);
        onView(withId(R.id.tvAddNew)).perform(click());
        return new RegisterPage();
    }

    public ServicesPage clickUser(){
        onView(withText(testname)).perform(click());
        return new ServicesPage();

    }
}
