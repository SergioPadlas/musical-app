package android.example.musicalapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class AlbunAdapter extends ArrayAdapter <Albun> {

    public AlbunAdapter(Activity context, ArrayList<Albun> androidFlavors) {
        super(context, 0, androidFlavors);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null){
                    listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item_albuns, parent,false);
        }

        Albun currentGetAlbun = getItem(position);

        TextView albunText = (TextView) listItemView.findViewById(R.id.albuns_text_view);
        albunText.setText(currentGetAlbun.getDefaultAlbun());

        TextView artistaView = (TextView) listItemView.findViewById(R.id.artistas_text_view);
        artistaView.setText(currentGetAlbun.getDefaultArtista());

        return listItemView;
    }



}
