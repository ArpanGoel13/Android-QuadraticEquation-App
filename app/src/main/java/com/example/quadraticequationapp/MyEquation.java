package com.example.quadraticequationapp;

import android.view.View;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.quadraticequationapp.databinding.ActivityMainBinding;

public class MyEquation extends BaseObservable {
    private String a;
    private String b;
    private String c;
    ActivityMainBinding activityMainBinding;

    public MyEquation(ActivityMainBinding activityMainBinding) {
        this.activityMainBinding = activityMainBinding;
    }

    public MyEquation() {
    }
    @Bindable
    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }
    @Bindable
    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }
    @Bindable
    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void solveEquation(View view){
        int a1 = Integer.parseInt(getA());
        int b1 = Integer.parseInt(getB());
        int c1 = Integer.parseInt(getC());

        double discriminant = (double)((b1*b1) - (4*a1*c1));
        double x1, x2;
        if (discriminant>0){
            x1 = (-b1 + Math.sqrt(discriminant))/(2*a1);
            x2 = (-b1 - Math.sqrt(discriminant))/(2*a1);
            activityMainBinding.textView.setText("x1 = "+x1+ " x2 = "+x2);
            
        } else if (discriminant<0) {
            activityMainBinding.textView.setText("No real roots");
            
        }
        else {
            x1 = -b1 / (2*a1);
            activityMainBinding.textView.setText("One real root "+x1);
        }

    }
}
