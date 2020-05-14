package com.coderax.onlineeducation;

import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;

import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

public class FragmentComposeDiary extends Fragment {

    public static final Calendar calender = Calendar.getInstance();

    public Spinner spinnerDiarySubject, spinnerDiaryType;
    public EditText editTextDiaryDetails;
    public static Button buttonDiaryDate, buttonAddDiary;
    public ArrayAdapter<String> adapterSpinnerDiarySubject, adapterSpinnerDiaryType;
    public List<String> listDiarySubjects, listDiaryTypes;

    DatePickerDialog.OnDateSetListener onDateSetListener;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_compose_diary, container, false);

        Toast.makeText(getActivity().getApplicationContext(), "Hey", Toast.LENGTH_LONG).show();

        spinnerDiarySubject = root.findViewById(R.id.spinnerDiarySubject);
        spinnerDiaryType = root.findViewById(R.id.spinnerDiaryType);

        listDiarySubjects = new ArrayList<>();
        listDiaryTypes = new ArrayList<>();

        listDiarySubjects.add("Math");
        listDiarySubjects.add("Urdu");
        listDiarySubjects.add("English");
        listDiarySubjects.add("Computer");
        listDiarySubjects.add("Islamiyat");
        listDiarySubjects.add("S.St");

        listDiaryTypes.add("Written");
        listDiaryTypes.add("Oral");

        adapterSpinnerDiarySubject = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, listDiarySubjects);
        spinnerDiarySubject.setAdapter(adapterSpinnerDiarySubject);

        adapterSpinnerDiaryType = new ArrayAdapter<String>(getActivity().getApplicationContext(), android.R.layout.simple_spinner_dropdown_item, listDiaryTypes);
        spinnerDiaryType.setAdapter(adapterSpinnerDiaryType);

        editTextDiaryDetails = root.findViewById(R.id.editTextDiaryDetails);

        buttonDiaryDate = root.findViewById(R.id.editTextDiaryDate);
        buttonAddDiary = root.findViewById(R.id.buttonAddDiary);

        buttonDiaryDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogFragment newFragment = new DatePickerFragment();
                newFragment.show(getActivity().getSupportFragmentManager(), "datePicker");
            }
        });

        return root;
    }

    public static class DatePickerFragment extends DialogFragment implements DatePickerDialog.OnDateSetListener {

        int year = calender.get(Calendar.YEAR);
        int month = calender.get(Calendar.MONTH);
        int day = calender.get(Calendar.DAY_OF_MONTH);

        public Dialog onCreateDialog(Bundle savedInstanceState) {
            DatePickerDialog datePickerDialog = new DatePickerDialog(getActivity(), this, year, month, day);
            return datePickerDialog;
        }

        public void onDateSet(DatePicker view, int selectedYear,
                              int selectedMonth, int selectedDay) {
            // Do something with the date chosen by the user

            year = selectedYear;
            month = selectedMonth + 1;
            day = selectedDay;
            Calendar cal = Calendar.getInstance();
            cal.set(selectedYear, selectedMonth, selectedDay);
            DateFormatSymbols dfs = new DateFormatSymbols(Locale.getDefault());
            String weekdays[] = dfs.getWeekdays();
            int daykk = cal.get(Calendar.DAY_OF_WEEK);
            String dayof = weekdays[daykk];

            FragmentComposeDiary.buttonDiaryDate.setText(day + "-" + month + "-" + year);

        }
    }

    private void setSpinnerDiaryType() {

    }

    private void setSpinnerDiarySubject() {

    }

}
