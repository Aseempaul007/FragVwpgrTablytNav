package com.example.fragvwpgrtablytnav;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.fragvwpgrtablytnav.Adapters.MyViewPagerAdapter;
import com.example.fragvwpgrtablytnav.Fragments.CallsFragment;
import com.example.fragvwpgrtablytnav.Fragments.ChatFragment;
import com.example.fragvwpgrtablytnav.Fragments.StatusFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Fragment> fragmentList;
    ArrayList<String> nameList;
    MyViewPagerAdapter myViewPagerAdapter;
    TabLayout tabLayout;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewPager);

        fragmentList = new ArrayList<>();
        nameList = new ArrayList<>();

        myViewPagerAdapter = new MyViewPagerAdapter(getSupportFragmentManager(), FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);

        myViewPagerAdapter.addFragment(new ChatFragment(),"Chats");
        myViewPagerAdapter.addFragment(new StatusFragment(),"Status");
        myViewPagerAdapter.addFragment(new CallsFragment(),"Calls");


        viewPager.setAdapter(myViewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);


    }
}