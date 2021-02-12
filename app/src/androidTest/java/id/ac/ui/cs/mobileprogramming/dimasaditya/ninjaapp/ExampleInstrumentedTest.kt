package id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp

import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Assert.assertEquals
import org.junit.Rule


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity>
            = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("id.ac.ui.cs.mobileprogramming.dimasaditya.ninjaapp", appContext.packageName)
    }

    @Test
    fun test_WellcomeString() {
        onView(withId(R.id.wellcomeText))
            .check(matches(withText("Wellcome")))
    }

    @Test
    fun `test_submitButton`() {
        onView(withId(R.id.submitButton)).perform(click()).check(matches(isDisplayed()))
    }

    @Test
    fun `test_usernameField`() {
        onView(withId(R.id.userNameInput)).check(matches(isDisplayed()))
    }

    @Test
    fun `test_emailField`() {
        onView(withId(R.id.emailInput)).check(matches(isDisplayed()))
    }




}