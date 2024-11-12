package com.cis2818.viewmodeldemo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.navigation.fragment.findNavController
import com.cis2818.viewmodeldemo.databinding.FragmentFirstBinding
import androidx.lifecycle.ViewModelProvider
import android.util.Log
import androidx.lifecycle.Observer

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class FirstFragment : Fragment() {

    private var _binding: FragmentFirstBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private lateinit var viewModel: MainViewModel



    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        viewModel = ViewModelProvider(this)[MainViewModel::class.java]

    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // binding.resultText.text = viewModel.getResult().toString()


        val resultObserver = Observer<Float>{

            result -> binding.resultText.text = result.toString()
        }


        viewModel.getResult().observe(viewLifecycleOwner,resultObserver)



        binding.convertButton.setOnClickListener{

            if(binding.dollarText.text.isNotEmpty())
            {
                viewModel.setAmount(binding.dollarText.text.toString())
               // binding.resultText.text = viewModel.getResult().toString()
            }
            else{
                binding.resultText.text = "No Value"
            }

            Log.d("Test", "Convert Debug")

        }//end setOnClickListener







    }//end onViewCreated

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}