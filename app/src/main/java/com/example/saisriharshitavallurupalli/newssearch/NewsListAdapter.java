package com.example.saisriharshitavallurupalli.newssearch;



import android.media.Image;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.saisriharshitavallurupalli.newssearch.models.News;

//import com.example.saisriharshitavallurupalli.placesearch.models.News;


class NewsListAdapter extends RecyclerView.Adapter {
    private News newsList;

    public NewsListAdapter(News news)
    {
        this.newsList=news;
    }

    //creates view holders that cant be recycled
    public View view;
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
         view=inflater.inflate(R.layout.single_news_layout,parent,false);
        //parent is the container for the layouts thats passed in

        NewsViewHolder viewHolder=new NewsViewHolder(view);
        //Log.i("inside ","view holder create");
        return viewHolder;
    }
    // called for every item in the grid. position indicates which item in the list it is
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        String url=newsList.posts.get(position).url;
        Uri uri= Uri.parse(url);
        String returnedTitle=newsList.posts.get(position).title;
        String returnedAuthor=newsList.posts.get(position).author;
        String returnedHilight=newsList.posts.get(position).text;
                //highlightText
        ((NewsViewHolder) holder).title.setText(returnedTitle);
        ((NewsViewHolder) holder).author.setText(returnedAuthor);
        ((NewsViewHolder) holder).hilight.setText(returnedHilight);

    }

    @Override
    public int getItemCount() {
        Log.i("posts count in adapter","");
        return newsList.posts.size();

    }


    public static class NewsViewHolder extends RecyclerView.ViewHolder{

        public TextView title;
        public TextView author;
        public TextView hilight;

        public NewsViewHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            author=itemView.findViewById(R.id.author);
            hilight=itemView.findViewById(R.id.hilighttext);

        }
    }
}
