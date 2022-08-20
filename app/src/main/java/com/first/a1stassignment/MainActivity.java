package com.first.a1stassignment;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static List  Data =new ArrayList<DataModel>();
    DataModel z;
    MyAdapter myAdapter;
    int p;
    boolean f;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
   if(Data.size()==0)
        Data.add(new DataModel("Zaheer", "M. Iqbal", "19011519-122",
                "Male", "Unmarried", "ComputerScience", "19011519",
                "2019-2023", "Islam", "BS", "12334-2",
                "Hafiz Hayat-", "Hafizabad", "Arfa Karim",
                "Computing-IT", "54463-2", "26778", "039372624",
                "2022-16-08", "abc@uog.pk", "Pocessing",
                "abc@gmail", "AB-","zaheer"));

     z=getIntent().getParcelableExtra("Model");
     p=getIntent().getIntExtra("Pos",-1);
     f=getIntent().getBooleanExtra("flag",false);

        if(f){
            Data.remove(p);
            Data.add(p,z);
        }
     else if(z!=null){
        Data.add(z);
    }

        RecyclerView vv=findViewById(R.id.RecyclerView);
        myAdapter = new MyAdapter(Data,this);
        vv.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        vv.setAdapter(myAdapter);
        findViewById(R.id.newbtn).setOnClickListener(v->{
            Intent intent=new Intent(this,DataEntry.class);
            startActivity(intent);
            finish();
        });

    }



}