package com.example.recyclerview

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide


class RecyclerAdapter constructor(private val context: Context) : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    private var title = arrayOf(
        "Ankush",
        "Ashu",
        "Mahir",
        "Nitesh",
        "Deepu",
        "Manish",
        "Aadhar",
        "Deewana",
        "kuch bhi"
    )
    private var images = arrayOf(
        "https://img.freepik.com/free-vector/shining-circle-purple-lighting-isolated-dark-background_1441-2396.jpg?size=626&ext=jpg",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQuEHrfimWzHnSVc2NXN5uFvpMqHGuheiskIA&usqp=CAU",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTv5h3COfzipVXf_6k06mnopNx8wycFtajRGQ&usqp=CAU",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQHBglX-sJUI9-_M5jhF4xHT7gxPoNmui_QhA&usqp=CAU",
        "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSJbmrVn3Iz6htSluhzn08D97rz5_r04JgA-Q&usqp=CAU",

        "https://ptrnews.com/wp-content/uploads/2018/11/Amazing-Facts-About-Panda-In-Hindi-Panda-Interesting-Facts-In-Hindi.jpg",
    "https://therealschool.in/blog/wp-content/uploads/2021/04/Interesting-and-Amazing-Facts-about-Moon.jpg",
    "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSZiRG76jPYRR6_98R5I1gMe4u_lnV4QO8aKA&usqp=CAU",
        "https://hips.hearstapps.com/hmg-prod.s3.amazonaws.com/images/gettyimages-1041987488.jpg?crop=0.7451428571428571xw:1xh;center,top&resize=480:*"

    )



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerAdapter.ViewHolder {

        val v = LayoutInflater.from(parent.context).inflate(R.layout.cardview, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerAdapter.ViewHolder, position: Int) {

        holder.itemtitle.text = title[position]
        Glide.with(context)
            .load(images[position])
            .into(holder.itemimage)
        holder.cardview.setOnClickListener {
            val intent = Intent(context, NewActivity::class.java)
            intent.putExtra("url", images[position])
            intent.putExtra("name", title[position])
            context.startActivity(intent)


        }
    }

    override fun getItemCount(): Int {

        return title.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var itemimage: ImageView = itemView.findViewById(R.id.image)
        var itemtitle: TextView = itemView.findViewById(R.id.title)
        var cardview : CardView = itemView.findViewById(R.id.cardview)

    }
}