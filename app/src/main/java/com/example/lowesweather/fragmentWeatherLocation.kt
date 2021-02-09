package com.example.lowesweather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_CITY_NAME = "CITY_NAME_FRAGMENT_LOCATION"

/**
 * A simple [Fragment] subclass.
 * Use the [fragmentWeatherLocation.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragmentWeatherLocation : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_CITY_NAME)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(ARG_CITY_NAME, param1)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_weather_location, container, false)
    }

    companion object {

        @JvmStatic
        fun newInstance() =
            fragmentWeatherLocation()
    }
}