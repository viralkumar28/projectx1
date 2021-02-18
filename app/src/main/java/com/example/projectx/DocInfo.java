package com.example.projectx;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class DocInfo extends Activity {

    ListView list = findViewById(R.id.list);
    String[] web = {
            "Dr. Meeta Desai",
            "Dr. Alpa Shah",
            "Dr. Hardik Khamar",
            "Dr. Kinjal Shah",
            "Dr. Sayma Memon",
            "Dr. Mohammad Abbas Noorani",
            "Dr. Riddhi S Gohel",
            "Dr. Anand B Shah",
            "Dr. Rahul Vyas",
            "Dr. Shusil Narang",
            "Dr. R.G. Patel",
            "Dr. Nishit Soni",
            "Dr. Parth Himanshu Bavishi",

    } ;
    String[] info ={
      "MBBS, MD - Skin & VD, DDVL\n",
      "BDS, MDS - Prosthodontics\n",
      "MD - Homeopathy, BHMS\n",
      "MDS- Oral Pathology, BDS\n",
      "BDS, MDS - Periodontology and Oral Implantology\n",
      "BDS - Dentist, Cosmetic/Aesthetic Dentist, Dental Surgeon, Implantologist",
      "BPTh/BPT, MPT - Orthopedic Physiotherapy\n",
      "MDS - Oral & Maxillofacial Surgery\n",
      "MBBS, Diploma in Dermatology\n",
      "Gastroenterologist",
      "MBBS, MD - Obstetrics & Gynaecology\n",
      "MDS-Oral Pathology and Oral Microbiology \n",
      "MD - Obstetrics & Gynaecology, MBBS\n",

    };
    Integer[] imageId = {
            R.drawable.md,
            R.drawable.as,
            R.drawable.hk,
            R.drawable.ks,
            R.drawable.sm,
            R.drawable.man,
            R.drawable.rsg,
            R.drawable.abs,
            R.drawable.rv,
            R.drawable.sn,
            R.drawable.rgp,
            R.drawable.ns,
            R.drawable.phb,



    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doc_info);

        CustomList adapter = new
                CustomList(this, web,info, imageId);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(DocInfo.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

            }
        });

    }



}
