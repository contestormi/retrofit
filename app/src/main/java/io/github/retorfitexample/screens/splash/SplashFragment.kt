package io.github.retorfitexample.screens.splash

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import io.github.retorfitexample.R
import io.github.retorfitexample.screens.main.MainAdapter
import io.github.retorfitexample.screens.main.MainViewModel
import kotlinx.android.synthetic.main.fragment_main.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_splash, container, false)
        CoroutineScope(Dispatchers.Main).launch {
            delay(1500)
            Navigation.findNavController(view).navigate(R.id.mainFragment)
        }
        return view
    }
}