package ahmed.javcoder.session7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Myprof extends AppCompatActivity {
    Button btn ;
    TextView text ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprof);

        btn = findViewById(R.id.btn);

        text = findViewById(R.id.textp);

        btn.setOnClickListener(new View.OnClickListener() {
            String ree = (String) text.getText();
            int before_increase = Integer.valueOf(ree);
            @Override
            public void onClick(View v) {
               int after_increase = before_increase++;
                text.setText("" + after_increase);
            }
        });
    }
}
