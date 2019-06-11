package ahmed.javcoder.session7;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Stevejobs extends AppCompatActivity {

    Button btn ;
    TextView textt ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stevejobs);

        btn = findViewById(R.id.btnsteve);
        textt = findViewById(R.id.textsteve);

        btn.setOnClickListener(new View.OnClickListener() {
            String ree = (String) textt.getText();
            int before_increase = Integer.valueOf(ree);
            @Override
            public void onClick(View v) {
                int after_increase = before_increase++;
                textt.setText("" + after_increase);

            }
        });
    }
}
