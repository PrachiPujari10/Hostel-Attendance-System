package com.example.hosteltrack;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.StudentViewHolder> {

    private List<Student> students;
    private TableLayout tableLayout;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }
    public StudentAdapter(List<Student> students, TableLayout tableLayout) {
        this.students = students;
        this.tableLayout = tableLayout;
    }

    public class StudentViewHolder extends RecyclerView.ViewHolder {
        TextView enrollmentNumberTextView;
        TextView nameTextView;
        TextView timeTextView;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);
            enrollmentNumberTextView = itemView.findViewById(R.id.tvEnrollmentNumber);
            nameTextView = itemView.findViewById(R.id.tvStudentName);
            timeTextView = itemView.findViewById(R.id.tvTime);
        }
    }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_student, parent, false);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student = students.get(position);
        holder.enrollmentNumberTextView.setText(student.getEnrollmentNumber());
        holder.nameTextView.setText(student.getName());
        holder.timeTextView.setText(student.getTime());
    }

    public void setupTable() {
        for (Student student : students) {
            TableRow tableRow = (TableRow) LayoutInflater.from(tableLayout.getContext()).inflate(R.layout.table_row_item, null);

            TextView enrollmentNumberTextView = tableRow.findViewById(R.id.tvEnrollmentNumber);
            TextView nameTextView = tableRow.findViewById(R.id.tvStudentName);
            TextView timeTextView = tableRow.findViewById(R.id.tvTime);

            enrollmentNumberTextView.setText(student.getEnrollmentNumber());
            nameTextView.setText(student.getName());
            timeTextView.setText(student.getTime());

            tableLayout.addView(tableRow);
        }
    }

    @Override
    public int getItemCount() {
        return students.size();
    }
}
