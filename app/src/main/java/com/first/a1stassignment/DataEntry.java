package com.first.a1stassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DataEntry extends AppCompatActivity {

    EditText[] a= new EditText[24];
    DataModel mydata=null;
    Button savedatabtn,editdatabtn;
    int p;
    boolean flag=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry);

            savedatabtn = findViewById(R.id.savedatabtn);
            mydata=getIntent().getParcelableExtra("dataE");
            p=getIntent().getIntExtra("Pos",-1);

        a[0] =  findViewById(R.id.stdntTxt);
        a[1] =  findViewById(R.id.FatherTxt);
        a[2] =  findViewById(R.id.RollnmbrTxt);
        a[3] =  findViewById(R.id.genderTxt);
        a[4] =  findViewById(R.id.meriageTxt);
        a[5] =  findViewById(R.id.degreetitleTxt);
        a[6] =  findViewById(R.id.RegistrationNoTxt);
        a[7] =  findViewById(R.id.SessionTxt);
        a[8] =  findViewById(R.id.religionTxt);
        a[9] =  findViewById(R.id.bsTxt);
        a[10] = findViewById(R.id.cnicTxt);
        a[11] = findViewById(R.id.campusTxt);
        a[12] = findViewById(R.id.addressTxt);
        a[13] = findViewById(R.id.departmntTxt);
        a[14] = findViewById(R.id.fecultytxt);
        a[15] = findViewById(R.id.ptclTxt);
        a[16] = findViewById(R.id.challanNoTxt);
        a[17] = findViewById(R.id.CellNoTxt);
        a[18] = findViewById(R.id.challandateTxt);
        a[19] = findViewById(R.id.UOGEmailTxt);
        a[20] = findViewById(R.id.DegreeStatusTxt);
        a[21] = findViewById(R.id.PersonEmaiTxt);
        a[22] = findViewById(R.id.bloodgrptxt);
        a[23] = findViewById(R.id.ApplicantSignTxt);
//
        p=getIntent().getIntExtra("Pos",-1);
        if(p!=-1){
            Toast.makeText(this, ""+p, Toast.LENGTH_SHORT).show();
            flag=true;
            setdatatoUI();
        }
        savedatabtn.setOnClickListener(view -> {
            mydata=getdatafromUI();
            Intent intent = new Intent(this,MainActivity.class);
            intent.putExtra("Model", (Parcelable) mydata);
            intent.putExtra("Pos",p);
            intent.putExtra("flag",flag);
            startActivity(intent);
        });

    }
        public  void  setdatatoUI(){

            Toast.makeText(this, "setdatatoUI", Toast.LENGTH_SHORT).show();
            a[0].setText(mydata.getStudent_Name());
            a[1].setText(mydata.getFather_NAme());
            a[2].setText(mydata.getRoll_No());
            a[3].setText(mydata.getGender());
            a[4].setText(mydata.getMerital_Status());
            a[5].setText(mydata.getDegree_Title());
            a[6].setText(mydata.getRegistration_No());
            a[7].setText(mydata.getSession());
            a[8].setText(mydata.getReligion());
            a[9].setText(mydata.getBS_MS_PhD());
            a[10].setText(mydata.getCNIC());
            a[11].setText(mydata.getCampus());
            a[12].setText(mydata.getAddress());
            a[13].setText(mydata.getDepartment_Name());
            a[14].setText(mydata.getFeculty_Name());
            a[15].setText(mydata.getPTCL());
            a[16].setText(mydata.getChallan_No());
            a[17].setText(mydata.getCELL());
            a[18].setText(mydata.getChallan_Date());
            a[19].setText(mydata.getUOG_Email());
            a[20].setText(mydata.getDegree_Status());
            a[21].setText(mydata.getPersonal_Email());
            a[22].setText(mydata.getBlood_Group());
            a[23].setText(mydata.getApplicant_Signature());

    }


    public DataModel getdatafromUI(){

        Toast.makeText(this,"datagetfromUI",Toast.LENGTH_SHORT).show();

        return new DataModel(
                a[0].getText().toString(),
                a[1].getText().toString(),
                a[2].getText().toString(),
                a[3].getText().toString(),
                a[4].getText().toString(),
                a[5].getText().toString(),
                a[6].getText().toString(),
                a[7].getText().toString(),
                a[8].getText().toString(),
                a[9].getText().toString(),
                a[10].getText().toString(),
                a[11].getText().toString(),
                a[12].getText().toString(),
                a[13].getText().toString(),
                a[14].getText().toString(),
                a[15].getText().toString(),
                a[16].getText().toString(),
                a[17].getText().toString(),
                a[18].getText().toString(),
                a[19].getText().toString(),
                a[20].getText().toString(),
                a[21].getText().toString(),
                a[22].getText().toString(),
                a[23].getText().toString());
    }
}