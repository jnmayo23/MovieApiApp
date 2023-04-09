package edu.quinnipiac.movieapiapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import edu.quinnipiac.movieapiapp.adapter.itemAdapter
import edu.quinnipiac.movieapiapp.adapter.movieItems


class MovieListFragment : Fragment() {

   // private lateinit var recycleAdapter: itemAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_list, container, false)

        val recyclerview = view.findViewById<RecyclerView>(R.id.recycleView)
        recyclerview.layoutManager = LinearLayoutManager(requireContext())

        recyclerview.adapter =  itemAdapter(requireContext(),movieItems)

        return view
    }



}