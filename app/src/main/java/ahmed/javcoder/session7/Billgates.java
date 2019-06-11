package ahmed.javcoder.session7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Billgates extends AppCompatActivity {
    Button btn;
    TextView text ;

     static int incease = 0 ;
    String re = null ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billgates);

        btn =  findViewById(R.id.btnbill);
        text = findViewById(R.id.text_Follow);

        re = (String) text.getText();

        incease = Integer.valueOf(re);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              incease = incease + 1;
              text.setText("" + incease);
            }
        });
    }
}
