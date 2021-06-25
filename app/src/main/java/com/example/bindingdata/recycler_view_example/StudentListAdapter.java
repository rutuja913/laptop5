package com.example.bindingdata.recycler_view_example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bindingdata.R;
import com.example.bindingdata.databinding.StudentInfoSingleCellBinding;
import com.example.bindingdata.pojo.StudentModel;

import java.util.ArrayList;

public class StudentListAdapter extends
        RecyclerView.Adapter<StudentListAdapter.StudentListViewHolder> {
    private ArrayList<StudentModel> studentList;

    public StudentListAdapter(ArrayList<StudentModel> studentList) {
        this.studentList = studentList;
    }

    @NonNull
    @Override
    public StudentListAdapter.StudentListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        StudentInfoSingleCellBinding binding= DataBindingUtil.inflate(inflater, R.layout.student_info_single_cell,parent,false);
        return new StudentListViewHolder(binding);

    }

    @Override
    public void onBindViewHolder(@NonNull StudentListAdapter.StudentListViewHolder holder, int position) {
        holder.bindData(position);
    }

    @Override
    public int getItemCount() {
        if(studentList!=null)
        {
            return studentList.size();
        }
        else
        {
            return 0;
        }
    }
    public class StudentListViewHolder extends RecyclerView.ViewHolder
    {

        private StudentInfoSingleCellBinding cellBinding;

        public StudentListViewHolder(StudentInfoSingleCellBinding cellBinding) {
            super(cellBinding.getRoot());
            this.cellBinding=cellBinding;

        }
        public void bindData(int position)
        {
            cellBinding.setStudentInfo(studentList.get(position));
        }
    }
}
