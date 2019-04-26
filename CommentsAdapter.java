package volley_json.volley_json;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class CommentsAdapter extends RecyclerView.Adapter<CommentsAdapter.ViewHolder>{

    ArrayList<PlaceComments> mList;
    Context context;

    public CommentsAdapter(ArrayList<PlaceComments> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(context).inflate(R.layout.m_list_item,viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.postId.setText(mList.get(i).getPostId());
        viewHolder.email.setText(mList.get(i).getEmail());


    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView postId, email;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            postId = itemView.findViewById(R.id.itemName);
            email = itemView.findViewById(R.id.itemUrl);

        }
    }
}
