package NIM_10117247.projek.utsakb;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.res.ResourcesCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

//Tanggal Pembuatan : 8 Mei 2020
// Nama  : Dzicko Pasuci Ramandes
// NIM   : 10117247
// Kelas : IF-8

public class SatuFragment extends Fragment {

    public SatuFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View viewFrag1 = inflater.inflate(R.layout.fragment_satu, container, false);
        ImageView image = (ImageView)viewFrag1.findViewById(R.id.image);
        image.setImageDrawable(ResourcesCompat.getDrawable(getResources(),R.drawable.dzicko, null));
        return viewFrag1;
            }







}
