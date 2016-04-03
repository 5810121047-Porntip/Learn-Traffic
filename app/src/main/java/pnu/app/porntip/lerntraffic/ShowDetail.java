package pnu.app.porntip.lerntraffic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ShowDetail extends AppCompatActivity {

    //Explicit ประกาศตัวแปร
    private TextView titleTextView, detailTextView;
    //ImageView trafficImageView; เหมือนกันกับ
    private ImageView trafficImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        //bind Widget
        titleTextView = (TextView) findViewById(R.id.textView4);
        detailTextView = (TextView) findViewById(R.id.textView5);
        trafficImageView = (ImageView) findViewById(R.id.imageView2);

        //Receive & Show รับค่าและแสดงผล

        String strTitle = getIntent().getStringExtra("Title");
        titleTextView.setText(strTitle);

        int intImage = getIntent().getIntExtra("Icon", R.drawable.traffic_01);
        trafficImageView.setImageResource(intImage);

        int intIndex = getIntent().getIntExtra("Index", 0);
        String[] detailStrings = getResources().getStringArray(R.array.detail);
        detailTextView.setText(detailStrings[intIndex]);

       // String strIndex = getIntent().getIntExtra("Index");
        //detailTextView.setText(strIndex);



    } //Main Method
} //Main Class
