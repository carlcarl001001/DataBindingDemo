package com.example.carl.databindingdemo2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.os.ParcelUuid;
import android.view.View;
import android.widget.Toast;

import com.example.carl.databindingdemo2.bean.Account;
import com.example.carl.databindingdemo2.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    Account account;
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        account = new Account();
        account.setLevel(100);
        account.setName("sss");
        binding.setAccount(account);
        binding.setActivity(this);
    }
    public void onClick(View view){
        Toast.makeText(this,"you click.",Toast.LENGTH_SHORT).show();
        int level = account.getLevel();
        account.setLevel(level+1);
    }
}
