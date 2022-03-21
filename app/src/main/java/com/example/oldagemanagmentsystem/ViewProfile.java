package com.example.oldagemanagmentsystem;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.app.Fragment;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class ViewProfile extends AppCompatActivity {
    TabLayout profileTabs;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.person_profile);

        profileTabs = findViewById(R.id.profile_tabs);

        profileTabs.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                FragmentManager manager = getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                switch(tab.getPosition()){
                    case 0:
                        transaction.replace(R.id.profilesectionfragments, new ProfileOverview() ,"Overview!");
                        transaction.commit();
                    break;

                    case 1:
                        transaction.replace(R.id.profilesectionfragments,new ProfileDiet(),"Diet!");
                        transaction.commit();
                    break;

                    case 2:
                        transaction.replace(R.id.profilesectionfragments, new ProfileMedicine(),"Medicine!");
                        transaction.commit();
                    break;

                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }
}
