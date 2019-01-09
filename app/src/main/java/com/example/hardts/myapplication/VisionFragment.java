package com.example.hardts.myapplication;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.otaliastudios.cameraview.CameraView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class VisionFragment extends DialogFragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dialog, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        CameraView camera = view.findViewById(R.id.camera);
        camera.setLifecycleOwner(getViewLifecycleOwner());
    }

    @Override
    public void onResume() {
        super.onResume();
        // set a breakpoint here to see if this is called multiple times
    }
}
