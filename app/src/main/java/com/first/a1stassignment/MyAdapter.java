package com.first.a1stassignment;
import java.util.List;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdapter extends RecyclerView.Adapter < MyAdapter.VHOLDER > {


    List <DataModel> Data;
    private Activity activity;

    public MyAdapter(List<DataModel> data, Activity activity) {
        Data = data;
        this.activity = activity;
    }

    public MyAdapter(List <DataModel> data){ Data = data;}


    public static class VHOLDER extends RecyclerView.ViewHolder {

        TextView nameView, FnameName, Gender, Religion, Applicant;
        TextView MeritalStatus, DegreeTitle, Rollnmbr, Registration, BloodGroup;
        TextView session, BS, CNIC, campus, address, Department, DegreeStatus;
        TextView PTCLNo, Feculty, ChallanNo, challanDate, UOGEmail, PersonalEmail, CellNo;
        Button btnEd,btnPDf;


        public VHOLDER(@NonNull View itemview)

        {
            super(itemview);

            nameView = itemview.findViewById(R.id.nameView);
            FnameName = itemview.findViewById(R.id.fNameView);
            Gender = itemview.findViewById(R.id.genderView);
            Religion = itemview.findViewById(R.id.ReligionView);
            Applicant = itemview.findViewById(R.id.ApplicantSignView);
            MeritalStatus = itemview.findViewById(R.id.MeritalView);
            DegreeTitle = itemview.findViewById(R.id.degreetitleView);
            Rollnmbr = itemview.findViewById(R.id.rollnmbrView);
            Registration = itemview.findViewById(R.id.RegistrationView);
            BloodGroup = itemview.findViewById(R.id.BPView);
            session = itemview.findViewById(R.id.sessionView);
            BS = itemview.findViewById(R.id.bsView);
            CNIC = itemview.findViewById(R.id.CNICview);
            campus = itemview.findViewById(R.id.CampusView);
            address = itemview.findViewById(R.id.addressView);
            Department = itemview.findViewById(R.id.departmntVeiw);
            DegreeStatus = itemview.findViewById(R.id.DegreeStatusView);
            PTCLNo = itemview.findViewById(R.id.ptclView);
            Feculty = itemview.findViewById(R.id.facultyView);
            ChallanNo = itemview.findViewById(R.id.challanNoView);
            challanDate = itemview.findViewById(R.id.challandateView);
            UOGEmail = itemview.findViewById(R.id.UOGEmailView);
            PersonalEmail = itemview.findViewById(R.id.PersonEmailView);
            CellNo = itemview.findViewById(R.id.CellNoView);
            btnEd = itemview.findViewById(R.id.editbtn);
            btnPDf = itemview.findViewById(R.id.pdfbtn);


        }

    }


    @NonNull
    @Override
    public VHOLDER onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
            LayoutInflater inflater= LayoutInflater.from(parent.getContext());
            View view =inflater.inflate(R.layout.form_layout,parent,false);
            return new VHOLDER(view);

    }

    @Override
    public void onBindViewHolder(@NonNull VHOLDER holder, @SuppressLint("RecyclerView") int position) {

        DataModel mydata = Data.get(position);

        holder.nameView.setText(mydata.getStudent_Name());
        holder.FnameName.setText((mydata.getFather_NAme()));
        holder.Gender.setText(mydata.getGender());
        holder.CellNo.setText(mydata.getCELL());
        holder.Feculty.setText(mydata.getFeculty_Name());
        holder.PersonalEmail.setText(mydata.getPersonal_Email());
        holder.UOGEmail.setText(mydata.getUOG_Email());
        holder.challanDate.setText(mydata.getChallan_Date());
        holder.ChallanNo.setText(mydata.getChallan_No());
        holder.PTCLNo.setText(mydata.getPTCL());
        holder.Religion.setText(mydata.getReligion());
        holder.DegreeStatus.setText(mydata.getDegree_Status());
        holder.campus.setText(mydata.getCampus());
        holder.address.setText(mydata.getAddress());
        holder.MeritalStatus.setText(mydata.getMerital_Status());
        holder.BloodGroup.setText(mydata.getBlood_Group());
        holder.Applicant.setText(mydata.getApplicant_Signature());
        holder.BS.setText(mydata.getBS_MS_PhD());
        holder.CNIC.setText(mydata.getCNIC());
        holder.Registration.setText(mydata.getRegistration_No());
        holder.Department.setText(mydata.getDepartment_Name());
        holder.session.setText(mydata.getSession());
        holder.DegreeTitle.setText(mydata.getDegree_Title());
        holder.Rollnmbr.setText(mydata.getRoll_No());


        holder.btnEd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(activity,DataEntry.class);
                intent.putExtra("Pos",position);
                intent.putExtra("dataE",(Parcelable) mydata);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount()
    {
        return Data.size();
    }


}
