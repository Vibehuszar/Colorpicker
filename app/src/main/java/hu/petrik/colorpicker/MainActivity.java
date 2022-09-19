package hu.petrik.colorpicker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout relativeLayout;
    private SeekBar seekBar1;
    private SeekBar seekBar2;
    private SeekBar seekBar3;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textViewRGB;
    private int red = 255;
    private int green = 255;
    private int blue = 255;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        textView1.setText("Red: " + red);
        textView2.setText("Green:" + green);
        textView3.setText("Blue: " + blue);
        textViewRGB.setText("RGB: (" + red + ", " + green + ", " +blue + ")");

        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                red = progress;
                textView1.setText("Red: " + red);
                relativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
                textViewRGB.setText("RGB: (" + red + ", " + green + ", " +blue + ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                green = progress;
                textView2.setText("Green: " + green);
                relativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
                textViewRGB.setText("RGB: (" + red + ", " + green + ", " +blue + ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        seekBar3.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                blue = progress;
                textView3.setText("Blue: " + blue);
                relativeLayout.setBackgroundColor(Color.rgb(red, green, blue));
                textViewRGB.setText("RGB: (" + red + ", " + green + ", " +blue + ")");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

    }

    private void init(){
        relativeLayout = findViewById(R.id.relativeLayout);
        seekBar1 = findViewById(R.id.seekBar1);
        seekBar2 = findViewById(R.id.seekBar2);
        seekBar3= findViewById(R.id.seekBar3);
        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textViewRGB = findViewById(R.id.textViewRGB);
    }
}