package dice.cs371m.dice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageButton dice;
    Button reset;
    int count1 = 0; TextView text1;
    int count2 = 0; TextView text2;
    int count3 = 0; TextView text3;
    int count4 = 0; TextView text4;
    int count5 = 0; TextView text5;
    int count6 = 0; TextView text6;
    String update;
    Random r;
    int rolledNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dice = (ImageButton) findViewById(R.id.dice);
        reset = (Button) findViewById(R.id.reset);
        text1 = (TextView) findViewById(R.id.count1);
        text2 = (TextView) findViewById(R.id.count2);
        text3 = (TextView) findViewById(R.id.count3);
        text4 = (TextView) findViewById(R.id.count4);
        text5 = (TextView) findViewById(R.id.count5);
        text6 = (TextView) findViewById(R.id.count6);
        r = new Random();

        dice.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                rolledNum = r.nextInt(6) + 1;

                switch (rolledNum) {
                    case 1:
                        dice.setImageResource(R.drawable.white_die_1);
                        count1++;
                        update = "1: " + String.valueOf(count1);
                        text1.setText(update);
                        break;
                    case 2:
                        dice.setImageResource(R.drawable.white_die_2);
                        count2++;
                        update = "2: " + String.valueOf(count2);
                        text2.setText(update);
                        break;
                    case 3:
                        dice.setImageResource(R.drawable.white_die_3);
                        count3++;
                        update = "3: " + String.valueOf(count3);
                        text3.setText(update);
                        break;
                    case 4:
                        dice.setImageResource(R.drawable.white_die_4);
                        count4++;
                        update = "4: " + String.valueOf(count4);
                        text4.setText(update);
                        break;
                    case 5:
                        dice.setImageResource(R.drawable.white_die_5);
                        count5++;
                        update = "5: " + String.valueOf(count5);
                        text5.setText(update);
                        break;
                    case 6:
                        dice.setImageResource(R.drawable.white_die_6);
                        count6++;
                        update = "6: " + String.valueOf(count6);
                        text6.setText(update);
                        break;
                    default:
                        break;
                }
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                count1 = 0;
                count2 = 0;
                count3 = 0;
                count4 = 0;
                count5 = 0;
                count6 = 0;
                text1.setText("1: 0");
                text2.setText("2: 0");
                text3.setText("3: 0");
                text4.setText("4: 0");
                text5.setText("5: 0");
                text6.setText("6: 0");
            }
        });
    }

}
