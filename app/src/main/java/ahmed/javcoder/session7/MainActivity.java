package ahmed.javcoder.session7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.balysv.materialripple.MaterialRippleLayout;

public class MainActivity extends AppCompatActivity {
    MaterialRippleLayout Myprofile , bill , mark , steve ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        intitView();

        Myprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , Myprof.class);
                startActivity(intent);
            }
        });

        bill.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext() , Billgates.class);
                startActivity(intent);
            }
        });

        mark.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext() , Markzukerberge.class);
                startActivity(intent);
            }
        });

        steve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(getApplicationContext() , Stevejobs.class);
                startActivity(intent);
            }
        });
    }

    public void intitView()
    {
        Myprofile = findViewById(R.id.myprofile_mrl);
        bill  = findViewById(R.id.bill_mrl);
        mark = findViewById(R.id.mark_mrl);
        steve = findViewById(R.id.steve_mrl);
    }
}
