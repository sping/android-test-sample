package nl.sping.futuricetest.app.test;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import nl.sping.futuricetest.app.MainActivity;
import nl.sping.futuricetest.app.R;

import static org.junit.Assert.assertEquals;

@RunWith(RobolectricTestRunner.class)
public class RoboTest {
    @Test
    public void testTrueIsTrue() throws Exception {
        assertEquals(true, true);
    }

    @Test
    public void testActivityTextChange() {
        Activity activity = Robolectric.buildActivity(MainActivity.class).create().get();

        Button pressMeButton = (Button) activity.findViewById(R.id.button);
        TextView results = (TextView) activity.findViewById(R.id.text);

        pressMeButton.performClick();
        String resultsText = results.getText().toString();
        assertEquals(resultsText, "Testing Android Rocks!");
    }
}