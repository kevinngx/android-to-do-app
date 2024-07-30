package com.example.android.todoapp.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.android.todoapp.R
import com.example.android.todoapp.databinding.FragmentDashboardBinding
import com.example.android.todoapp.tasktracker.TaskListAdapter

class DashboardFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Set up a binding to the fragment
        val binding: FragmentDashboardBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_dashboard, container, false)

        // Set up navigation from the create task button to the task create screen
        binding.GoToCreateTaskButton.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_dashboardFragment_to_taskCreateFragment)
        )

        // Set up the recyclerview
        val recyclerView: RecyclerView = binding.TaskRecyclerView
        val adapter = TaskListAdapter() // Pass your data here if needed
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(context)

        return binding.root
    }

}