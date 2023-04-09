package edu.quinnipiac.movieapiapp

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.android.volley.RequestQueue
import com.android.volley.toolbox.BasicNetwork
import com.android.volley.toolbox.DiskBasedCache
import com.android.volley.toolbox.HurlStack
import edu.quinnipiac.movieapiapp.adapter.movieItems
import edu.quinnipiac.movieapiapp.databinding.FragmentMovieDetailsBinding


class MovieDetailsFragment : Fragment() {

    lateinit var requestQueue: RequestQueue
    private var _binding: FragmentMovieDetailsBinding? = null
    private val binding get() = _binding !!
    var movie_id: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val appnetwork = BasicNetwork(HurlStack())
        val appcache = DiskBasedCache(requireContext().cacheDir, 5* 1024 * 1024) // 1MB cap
        requestQueue = RequestQueue(appcache, appnetwork).apply {
            start()
        }

        val bundle = arguments
        if (bundle == null) {
            Log.e("DetailFragment", "DetailFragment did not receive hero id")
            return
        }
        movie_id = MovieDetailsFragmentArgs.fromBundle(bundle).movieId
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        _binding =  inflater.inflate(R.layout.fragment_movie_details, container, false)
        _binding = FragmentMovieDetailsBinding.inflate(inflater,container, false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.title.text = movieItems.get(movie_id).title
        binding.year.text = movieItems.get(movie_id).year

       }

}