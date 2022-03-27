package com.amm.navigationdrawerviewmodel.main;

import androidx.core.util.Pair;
import androidx.lifecycle.ViewModel;

public class SharedViewModel extends ViewModel {

    private Pair<String ,Integer> selectedColor;

    //Constructor sin parametros para que podamos usar la default Application Factory.
    public SharedViewModel() {
        selectedColor = null;
    }

    public Pair<String, Integer> getSelectedColor() {
        return selectedColor;
    }

    public void setSelectedColor(Pair<String, Integer> selectedColor) {
        this.selectedColor = selectedColor;
    }
}
