package madhuri.com.checkbox_dem0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import io.github.muddz.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {

    Button btnclick;
    CheckBox checked1, checked2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnClick(View view) {
        btnclick = findViewById(R.id.button1);
        checked1 = findViewById(R.id.checked1);
        checked2 = findViewById(R.id.checked2);

        btnclick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder result = new StringBuilder();
               // result.append("Selected Food ");
                int totalamnt =0;
                        if(checked1.isChecked()){
                            result.append("  Pizza Rs. 100");
                            totalamnt = totalamnt + 100;
                        }
                        if (checked2.isChecked()){
                            result.append("   Burger Rs. 60");
                            totalamnt = totalamnt + 60;
                        }
                        result.append(" \n Total = ").append(totalamnt).append("Rs");
                Toast.makeText(getApplicationContext(),result.toString(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}