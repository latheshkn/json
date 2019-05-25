package com.example.json;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

       Address address = new Address("India","kushalnagr");

        List<FamilyMember> family =new ArrayList<>();
        family.add(new FamilyMember("grand mother",90));
        family.add(new FamilyMember("mother",45));


       employee employe= new employee("lathes",23,"latheshkn01@gmail.com",address,family);

        String json=gson.toJson(employe);

       /*String json = "{\"address\":{\"city\":\"kushalnagr\",\"country\":\"India\"},\"age\":23,\"email\":\"latheshkn01@gmail.com\",\"firstname\":\"lathes\"}";
        employee employe =gson.fromJson(json,employee.class);*/

    }
    }
;