package ness.edu.fragmentsgallery;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {
    ImageView ivGallery;
    Button btnLeft ,btnRight;
    int[] images = {R.drawable.apples_gal, R.drawable.flowers, R.drawable.tree};
    int imageIndex = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
     return inflater.inflate(R.layout.fragment_gallery, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ivGallery = (ImageView) view.findViewById(R.id.ivGallery);
        btnLeft = (Button) view.findViewById(R.id.btnLeft);
        btnRight = (Button) view.findViewById(R.id.btnRight);
        btnRight.setOnClickListener(rightListener);
        btnLeft.setOnClickListener(leftListener);

    }


    View.OnClickListener rightListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            imageIndex++;
            if (imageIndex >= images.length)
                imageIndex = 0;

            ivGallery.setImageResource(images[imageIndex]);
        }
    };

    View.OnClickListener leftListener = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            imageIndex --;
            if (imageIndex < 0)
                imageIndex = images.length - 1;

            ivGallery.setImageResource(images[imageIndex]);
        }
    };
}
