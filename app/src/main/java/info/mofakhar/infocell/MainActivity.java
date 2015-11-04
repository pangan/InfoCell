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
        int psc = cellLocation.getPsc();


        String cid_str = String.valueOf(cid);
        String lac_str = String.valueOf(lac);
        String psc_str = String.valueOf(psc);

        TextView cell_1 = (TextView)findViewById(R.id.textView4);
        cell_1.setText(cid_str);
        TextView cell_2 = (TextView)findViewById(R.id.textView5);
        cell_2.setText(lac_str);
        TextView cell_3 = (TextView)findViewById(R.id.textView6);
        cell_3.setText(psc_str);

    }
}
