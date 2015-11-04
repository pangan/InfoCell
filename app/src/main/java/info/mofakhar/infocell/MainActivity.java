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

        int cid = cellLocation.getCid() & 0xffff;
        int lac = cellLocation.getLac() & 0xffff;
        int psc = cellLocation.getPsc() & 0xffff;


        String cid_str = String.valueOf(cid);
        String lac_str = String.valueOf(lac);
        String psc_str = String.valueOf(psc);

        TextView cell_1 = (TextView)findViewById(R.id.textView4);
        cell_1.setText(cid_str);
        TextView cell_2 = (TextView)findViewById(R.id.textView5);
        cell_2.setText(lac_str);
        TextView cell_3 = (TextView)findViewById(R.id.textView6);
        cell_3.setText(psc_str);

        TextView textV1 =  (TextView)findViewById(R.id.textView7);

        TelephonyManager teleMan =
                (TelephonyManager)getSystemService(Context.TELEPHONY_SERVICE);

        int networkType = teleMan.getNetworkType();
        switch (networkType)
        {
            case 7:
                textV1.setText("1xRTT");
                break;
            case 4:
                textV1.setText("CDMA");
                break;
            case 2:
                textV1.setText("EDGE");
                break;
            case 14:
                textV1.setText("eHRPD");
                break;
            case 5:
                textV1.setText("EVDO rev. 0");
                break;
            case 6:
                textV1.setText("EVDO rev. A");
                break;
            case 12:
                textV1.setText("EVDO rev. B");
                break;
            case 1:
                textV1.setText("GPRS");
                break;
            case 8:
                textV1.setText("HSDPA");
                break;
            case 10:
                textV1.setText("HSPA");
                break;
            case 15:
                textV1.setText("HSPA+");
                break;
            case 9:
                textV1.setText("HSUPA");
                break;
            case 11:
                textV1.setText("iDen");
                break;
            case 13:
                textV1.setText("LTE");
                break;
            case 3:
                textV1.setText("UMTS");
                break;
            case 0:
                textV1.setText("Unknown");
                break;
        }

    }
}
