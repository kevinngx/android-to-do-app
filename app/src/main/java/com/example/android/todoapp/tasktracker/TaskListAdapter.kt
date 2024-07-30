package com.example.android.todoapp.tasktracker

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.android.todoapp.R
import com.example.android.todoapp.database.Task

val dummyData = listOf(
    Task(1, "Grocery Shopping", "Buy milk, eggs, bread, and cheese from the supermarket.","2024-05-10", "10:00 AM"),
    Task(2, "Book Doctor Appointment", "Schedule a check-up appointment with Dr. Smith.", "2024-05-15", "03:30 PM"),Task(3, "Pay Bills", "Pay electricity and internet bills.", "2024-05-20", "11:00 AM"),
    Task(4, "Pick up Dry Cleaning", "Collect clothes from the dry cleaners.", "2024-05-22", "05:00 PM"),
    Task(5, "Call Mom", "Wish her a happy birthday.", "2024-05-25", "09:00 AM"),
    Task(6, "Submit Project Proposal", "Finalize and submitthe project proposal to the client.", "2024-05-28", "04:00 PM"),
    Task(7, "Attend Meeting", "Team meeting to discuss project progress.", "2024-06-01", "10:30 AM"),
    Task(8, "Buy Concert Tickets", "Purchase tickets for the upcoming concert.", "2024-06-05", "12:00 PM"),
    Task(9, "Water Plants", "Don't forget to water the plants in the garden.", "2024-06-10", "06:00 PM"),
    Task(10, "Read Book", "Finish reading the latest chapter of the novel.", "2024-06-15", "08:00 PM")
)

class TaskListAdapter(private val dataSet: List<Task> = dummyData): RecyclerView.Adapter<TaskListAdapter.ViewHolder>() {
    class ViewHolder(view: View): RecyclerView.ViewHolder(view)  {
        val taskTitle: TextView
        val taskDecription: TextView
        val dueDate: TextView
        val dueTime: TextView

        init {
            // Define a click listener for the ViewHolder's View
            taskTitle = view.findViewById(R.id.TaskTitle)
            taskDecription = view.findViewById(R.id.TaskDescription)
            dueDate = view.findViewById(R.id.DueDate)
            dueTime = view.findViewById(R.id.DueTime)
        }
    }

    // Creates a new view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item
        val view = LayoutInflater.from(parent.context).inflate(R.layout.task_card, parent, false)
        return ViewHolder(view)
    }

    // Replaces the contents of a view with new data
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get element from the dataset at this position nd replace the contents of the view with that element
        holder.taskTitle.text = dataSet[position].title
        holder.taskDecription.text = dataSet[position].description
        holder.dueDate.text = dataSet[position].dueDate
        holder.dueTime.text = dataSet[position].dueTime
    }

    // Return the size of the dataset
    override fun getItemCount() = dataSet.size

}