package add.larionov.minigames.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import add.larionov.minigames.R


class FragmentRPS : Fragment() {
    lateinit var binding: FragmentRPS

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentRPS.

    }

    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FragmentRPS().apply {
        }
    }
}