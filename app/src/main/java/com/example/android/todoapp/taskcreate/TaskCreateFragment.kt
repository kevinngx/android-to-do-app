package com.example.android.todoapp.taskcreate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.android.todoapp.R
import com.example.android.todoapp.databinding.FragmentTaskCreateBinding

class TaskCreateFragment : Fragment(R.layout.fragment_task_create) {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentTaskCreateBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_task_create, container, false)

        binding.createTaskButton.setOnClickListener { view: View ->
            if (binding.taskTitleEditText.text.isNotEmpty()) {
                // Create new database entry
                val newTitle = binding.taskTitleEditText.text
                val newDescription = binding.taskDescriptionEditText.text
                val newDueDate = binding.taskDueDateEditText.text
                val newDueTime = binding.taskDueTimeEditText.text
                view.findNavController().navigate(R.id.action_taskCreateFragment_to_dashboardFragment)
                Toast.makeText(this.context, "Entry Created", Toast.LENGTH_SHORT).show()
            }
        }

//        binding.createTaskButton.setOnClickListener {
//            if (
//                binding.taskTitleEditText.text.isNotEmpty()
//            ) {
//                Navigation.createNavigateOnClickListener(R.id.action_taskCreateFragment_to_dashboardFragment)
//            }
//        }
        return binding.root
    }
}

