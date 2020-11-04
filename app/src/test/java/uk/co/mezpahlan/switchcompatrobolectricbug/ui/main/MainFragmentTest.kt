package uk.co.mezpahlan.switchcompatrobolectricbug.ui.main

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isCompletelyDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import uk.co.mezpahlan.switchcompatrobolectricbug.R

@RunWith(AndroidJUnit4::class)
@Config(sdk = [24])
class MainFragmentTest {
    @Test
    fun testSwitchCompatRobolectric() {
        // Given

        // When
        launchFragmentInContainer(themeResId = R.style.Theme_SwitchCompatRobolectricBug) { MainFragment.newInstance() }

        // Then
        onView(withId(R.id.switch_compat))
            .check(matches(isCompletelyDisplayed()))
    }
}