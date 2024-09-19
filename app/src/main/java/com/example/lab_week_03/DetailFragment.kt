package com.example.lab_week_03

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private val coffeeTitle: TextView?
        get() = view?.findViewById(R.id.coffee_title)
    private val coffeeDesc: TextView?
        get() = view?.findViewById(R.id.coffee_desc)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val coffeeId = arguments?.getInt(COFFEE_ID, 0) ?: 0
        setCoffeeData(coffeeId)

        view.findViewById<Button>(R.id.back_button).setOnClickListener {
            findNavController().navigateUp()
        }
    }

    fun setCoffeeData(id: Int){
        when(id){
            R.id.affogato -> {
                coffeeTitle?.text = getString(R.string.affogato_title)
                coffeeDesc?.text = getString(R.string.affogato_desc)
            }R.id.americano -> {
                coffeeTitle?.text = getString(R.string.americano_title)
                coffeeDesc?.text = getString(R.string.americano_desc)
            }R.id.latte -> {
                coffeeTitle?.text = getString(R.string.latte_title)
                coffeeDesc?.text = getString(R.string.latte_desc)
            }R.id.water -> {
                coffeeTitle?.text = getString(R.string.water_title)
                coffeeDesc?.text = getString(R.string.water_desc)
            }R.id.iced_tea -> {
                coffeeTitle?.text = getString(R.string.iced_tea_title)
                coffeeDesc?.text = getString(R.string.iced_tea_desc)
            }
        }
    }

    companion object {
        private const val COFFEE_ID = "COFFEE_ID"

    }
}