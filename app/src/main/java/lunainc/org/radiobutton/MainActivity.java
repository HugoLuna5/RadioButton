package lunainc.org.radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    /**
     * Atributos de la clase
     */
    public RadioButton radioButton;//este es para si
    public RadioButton radioButton2;//este es para no
    public Button button;//Boton de acción

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        radioButton = (RadioButton) findViewById(R.id.radioButton);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton2);
        button = (Button) findViewById(R.id.button);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if (radioButton.isChecked()){
                   Toast.makeText(MainActivity.this, "Diste click en no ", Toast.LENGTH_SHORT).show();
               }

               if (radioButton2.isChecked()){
                   Toast.makeText(MainActivity.this, "Diste click en si", Toast.LENGTH_SHORT).show();
               }

            }
        });



    }
}
