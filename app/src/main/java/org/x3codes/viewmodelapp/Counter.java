package org.x3codes.viewmodelapp;

import android.view.View;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.x3codes.viewmodelapp.databinding.ActivityMainBinding;

public class Counter extends ViewModel {
    private MutableLiveData<Integer> counter = new MutableLiveData<>();

    public LiveData<Integer> getCounter() {
        return counter;
    }

    public void increaseCounter(View view) {
        int currentValue = counter.getValue() != null ? counter.getValue() : 0;
        counter.setValue(currentValue + 1);
    }
}
