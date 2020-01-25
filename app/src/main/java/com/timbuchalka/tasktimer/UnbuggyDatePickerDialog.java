package com.timbuchalka.tasktimer;

import android.app.DatePickerDialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

public class UnbuggyDatePickerDialog extends DatePickerDialog {
    public UnbuggyDatePickerDialog(@NonNull Context context, @Nullable OnDateSetListener listener, int year, int month, int dayOfMonth) {
        super(context, listener, year, month, dayOfMonth);
    }

    @Override
    protected void onStop() {
        // do nothing - do NOT call super method
    }
}
