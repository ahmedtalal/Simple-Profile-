package ahmed.javcoder.session7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Markzukerberge extends AppCompatActivity {

    Button btn ;
    TextView text ;

    static int Before_increase = 0 ;
    static int after_increase = 0 ;
    String re = null ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_markzukerberge);

        btn = findViewById(R.id.btnmark);
        text = findViewById(R.id.text_mark);
        re = (String) text.getText();
        Before_increase = Integer.valueOf(re);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                after_increase = ++Before_increase;
                text.setText("" + after_increase);
            }
        });
    }
}
