package volley_json.volley_json;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<UserResponse> mList;

    public MyAdapter(){}

    public MyAdapter(ArrayList<UserResponse> mList) {
        this.mList = mList;
    }

    @NonNull
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.m_list_item, viewGroup, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyAdapter.ViewHolder viewHolder, int i) {
//        viewHolder.tv_name.setText(mList.get(i));

//        viewHolder.tv_url.setText(mList.get(i).getUsersModels().get(i).getNameList().get(i).getFirst());
        viewHolder.tv_url.setText("hii");
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{
        private TextView tv_name, tv_url;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tv_name = itemView.findViewById(R.id.itemName);
            tv_url = itemView.findViewById(R.id.itemUrl);


        }
    }
}
