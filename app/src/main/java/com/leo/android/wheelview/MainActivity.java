package com.leo.android.wheelview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.text);

        final WheelView wheelView = findViewById(R.id.wheelview);
        wheelView.setTextSize(80);
        wheelView.setVisibilityCount(7);
        wheelView.setTextGravity(Gravity.CENTER_VERTICAL | Gravity.LEFT);
        wheelView.setSelectedTextColor(getColor(R.color.colorAccent));
        final List<String> dataSources = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            dataSources.add("数据" + i);
        }
        wheelView.setDataSources(dataSources);
        wheelView.setCallBack(position ->
                                      textView.setText(String.format(
                                              Locale.getDefault(),
                                              "当前为：" + dataSources.get(
                                                      position)
                                      )));
    }
}
