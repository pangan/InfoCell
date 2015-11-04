package info.mofakhar.infocell;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onButtonClick(View v){

        TelephonyManager telephonyManager = (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);
        GsmCellLocation cellLocation = (GsmCellLocation) telephonyManager.getCellLocation();

        int cid = cellLocation.getCid();
        int lac = cellLocation.getLac();

        String cid_str = String.valueOf(cid);

        TextView cell_1 = (TextView)findViewById(R.id.textView4);
        cell_1.setText(cid_str);
        TextView cell_2 = (TextView)findViewById(R.id.textView5);
        cell_2.setText("1");
        TextView cell_3 = (TextView)findViewById(R.id.textView6);
        cell_3.setText("1");

    }
}
