package deltagruppen.circles;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {
    LinearLayout layout;
    AlertDialog.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getString(R.string.app_name));
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        layout = new LinearLayout(this);
        builder = new AlertDialog.Builder(this);
        builder.setMessage(R.string.lang_popup_title)
                .setPositiveButton(R.string.lang_popup_swe, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //TODO Change language to SWE
                        Toast.makeText(getApplicationContext(), "Make this button change language.", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton(R.string.lang_popup_eng, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        //TODO Change language to ENG
                        Toast.makeText(getApplicationContext(), "Make this button change language.", Toast.LENGTH_SHORT).show();
                    }
                });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClickLang (View view) {
        AlertPopup();
    }


    public void AlertPopup() {
        // Use the Builder class for convenient dialog construction
        builder.show();
    }

    public void showPiInfo(MenuItem item) {
        Intent intent = new Intent(this, PiInfo.class);
        startActivity(intent);
    }

    public void showPiInfo(View view) {
        Intent intent = new Intent(this, PiInfo.class);
        startActivity(intent);
    }

    public void showAppInfo(MenuItem item) {
        Intent intent = new Intent(this, AppInfo.class);
        startActivity(intent);
    }

    public void showAppInfo(View view) {
        Intent intent = new Intent(this, AppInfo.class);
        startActivity(intent);
    }

    public void showCalculatingPiInfo(MenuItem item) {
        Intent intent = new Intent(this, CalculatingPi.class);
        startActivity(intent);
    }

    public void showCalculatingPiInfo(View view) {
        Intent intent = new Intent(this, CalculatingPi.class);
        startActivity(intent);
    }

}
