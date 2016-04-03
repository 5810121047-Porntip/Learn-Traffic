package pnu.app.porntip.lerntraffic;
// เป็นการต่อท่อให้ xml รู้จัก

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by USER on 3/4/2559.
 */
public class MyAdapter extends BaseAdapter
        //extends ถ่ายทอด Class
{

    //Explicit ประกาศตัวแปร
    private Context context;
    private String[] titleStrings, descriptionStrings;
    private int[] iconInts;

    public MyAdapter(Context context, String[] titleStrings, String[] descriptionStrings, int[] iconInts) {
        this.context = context;
        this.titleStrings = titleStrings;
        this.descriptionStrings = descriptionStrings;
        this.iconInts = iconInts;
    }

    @Override
    public int getCount() {
        return iconInts.length; // count นับจำนวนภาพเพื่อสร้าง Listview
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE); //ขอเปิดใช้ Service เช่น กล้อง
        View view1 = layoutInflater.inflate(R.layout.my_listview, viewGroup, false);

        //For TextView
        TextView titleTextView = (TextView) view1.findViewById(R.id.textView2);
        titleTextView.setText(titleStrings[i]);

        TextView descriptTextView = (TextView) view1.findViewById(R.id.textView3);
        descriptTextView.setText(descriptionStrings[i]);


        //For Image
        ImageView iconImageView = (ImageView) view1.findViewById(R.id.imageView);
        iconImageView.setImageResource(iconInts[i]);

        return view1;
    }
}
//Main Class