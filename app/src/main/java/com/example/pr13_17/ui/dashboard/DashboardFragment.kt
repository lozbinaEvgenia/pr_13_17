package com.example.pr13_17.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.pr13_17.R
import com.example.pr13_17.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root=inflater.inflate(R.layout.fragment_dashboard,container,false)

        return root
    }


}