package com.example.myapplication;

import android.util.Log;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnDisplay, btnReturn;
    EditText editTextName, editTextAge;

    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_info);

        initialize();
    }

    private void initialize()
    {
        btnDisplay = findViewById(R.id.btnDisplay);
        btnReturn = findViewById(R.id.btnReturn);

        //active LISTENER for the buttons
        btnDisplay.setOnClickListener(this);
        btnReturn.setOnClickListener(this);

        editTextName = findViewById(R.id.editTextName);
        editTextAge = findViewById(R.id.editTexAge);
    }
@Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnDisplay:
            {
                String name = editTextName.getText().toString();
                String age = editTextAge.getText().toString();

                //just for dev see internally what is going on
                Log.d("DISPLAY","Name"+name);

                String info = "Name " + name + "Age: " + age;

                Toast.makeText(this.info, Toast.LENGTH_SHORT).show();

                break;

            }

            case R.id.btnReturn: {
                finish();
                break;
            }
        }
    }

}
