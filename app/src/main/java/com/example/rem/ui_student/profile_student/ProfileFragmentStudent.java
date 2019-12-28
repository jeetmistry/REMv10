package com.example.rem.ui_student.profile_student;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.rem.R;

public class ProfileFragmentStudent extends Fragment {

    private ProfileViewModelStudent profileViewModelStudent;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profileViewModelStudent =
                ViewModelProviders.of(this).get(ProfileViewModelStudent.class);
        View root = inflater.inflate(R.layout.fragment_profile_student, container, false);
        final TextView textView = root.findViewById(R.id.text_profile_student);
        profileViewModelStudent.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}