package volley_json.volley_json;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class PlacePostAdapter extends RecyclerView.Adapter<PlacePostAdapter.ViewHolder> {

    List<PlacePost> mList;
    Context context;

    public PlacePostAdapter(){}

    public PlacePostAdapter(List<PlacePost> mList, Context context) {
        this.mList = mList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.m_list_item, viewGroup, false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {

        viewHolder.title.setText(mList.get(i).getTitle());
        viewHolder.body.setText(String.valueOf(mList.get(i).getUserId()));
//        Glide.with(context).load(mList.get(i).get)

    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        View mView;
        ImageView mImageView;
        TextView title, body;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mView = itemView;

            mImageView = mView.findViewById(R.id.itemImage);
            title = mView.findViewById(R.id.itemName);
            body = mView.findViewById(R.id.itemUrl);
        }
    }
}
