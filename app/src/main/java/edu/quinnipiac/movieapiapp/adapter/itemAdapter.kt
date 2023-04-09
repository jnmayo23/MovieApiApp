package edu.quinnipiac.movieapiapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.navigation.NavController
import androidx.recyclerview.widget.RecyclerView
import edu.quinnipiac.movieapiapp.MovieItems
import androidx.core.content.ContentProviderCompat.requireContext
import com.android.volley.RequestQueue
import com.android.volley.toolbox.BasicNetwork
import com.android.volley.toolbox.DiskBasedCache
import com.android.volley.toolbox.HurlStack
import edu.quinnipiac.movieapiapp.R


var movieItems:ArrayList<MovieItems> = ArrayList()

class itemAdapter(var context: Context, val aList: ArrayList<MovieItems>):RecyclerView.Adapter<itemAdapter.ItemViewHolder>()
{
   // lateinit var requestQueue: RequestQueue


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
//        val appnetwork = BasicNetwork(HurlStack())
//        val appcache = DiskBasedCache(context.cacheDir, 10* 1024 * 1024) // 10MB cap
//        requestQueue = RequestQueue(appcache, appnetwork).apply {
//            start()
//        }

        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent, false)
        return ItemViewHolder(adapterLayout, context)
    }
    override fun getItemCount(): Int {
        return movieItems.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(position)
    }

    fun setMovieListItems(movie: ArrayList<MovieItems>) {
        movieItems = movie
        notifyDataSetChanged()
    }

    inner class ItemViewHolder(itemView: View, private val context: Context) :
        RecyclerView.ViewHolder(itemView) {

        private val title: TextView = itemView!!.findViewById(R.id.item_title)
        val image: ImageView = itemView!!.findViewById(R.id.item_image)
        private var pos: Int = 0

        // Set an on-click listener to navigate to the RecipeDetails fragment
        init {
            itemView.setOnClickListener {
//                val action = MovieResultDirections.actionMovieResultToMovieDetails(pos)
//                navController.navigate(action)
            }
        }

        fun bind(position: Int) {
            pos = position
            val onMovie = movieItems.get(position)
            title.text = onMovie.title

            val words = title.text.split("\\s+")

        }
    }
}