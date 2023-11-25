package com.example.prjcarsdatabaseoct25;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.firebase.Firebase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    EditText edCarId, edPrice;
    Button btnAdd,btnUpdate,btnRemove,btnFind,btnList;
    RadioGroup rgCars;
    RadioButton rbToyota, rbMazda, rbHyundai;
    CheckBox checkBoxNewUsed;

    DatabaseReference carDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }

    private void initialize() {
        edCarId = findViewById(R.id.edCarId);
        edPrice = findViewById(R.id.edPrice);
        btnAdd = findViewById(R.id.btnAdd);
        btnUpdate = findViewById(R.id.btnUpdate);
        btnRemove = findViewById(R.id.btnRemove);
        btnFind = findViewById(R.id.btnFind);
        btnList = findViewById(R.id.btnList);
        rbToyota = findViewById(R.id.rbToyota);
        rbMazda = findViewById(R.id.rbMazda);
        rbHyundai = findViewById(R.id.rbHyundai);
        checkBoxNewUsed = findViewById(R.id.checkBoxNewUsed);

        btnAdd.setOnClickListener(this);
        btnUpdate.setOnClickListener(this);
        btnRemove.setOnClickListener(this);
        btnFind.setOnClickListener(this);
        btnList.setOnClickListener(this);
        rbToyota.setOnClickListener(this);
        rbMazda.setOnClickListener(this);
        rbHyundai.setOnClickListener(this);
        checkBoxNewUsed.setOnClickListener(this);

        carDatabase = FirebaseDatabase.getInstance().getReference("Car");
    }

    @Override
    public void onClick(View v) {

        int id = v.getId();

        if (id==R.id.btnAdd)
            addCar(v);
        if (id==R.id.btnUpdate)
            updateCar(v);
        if (id==R.id.btnRemove)
            removeCar(v);
        if (id==R.id.btnFind)
            findCar(v);
        if (id==R.id.btnList)
            listCars(v);

    }

    private void listCars(View v) {

    }

    private void findCar(View v) {

    }

    private void removeCar(View v) {

    }

    private void updateCar(View v) {

    }

    private void addCar(View v) {
        try {


        } catch (Exception e) {

        }
    }
}