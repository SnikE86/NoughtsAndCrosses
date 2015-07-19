package mekins.noughtsandcrosses;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * NoughtsAndCrosses
 * Created by michael on 19/07/2015.
 */
public class GoogleSignInForm extends Fragment implements View.OnClickListener{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View theView = inflater.inflate(R.layout.google_sign_in_form, container, false);

        setupClickListeners(theView);
        return theView;
    }

    private void setupClickListeners(View theView) {
        setupClickListener(theView, R.id.sign_in_button);
        setupClickListener(theView, R.id.sign_out_button);
    }

    private void setupClickListener(View theView, int childViewId){
        View childView = theView.findViewById(childViewId);
        childView.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //
    }
}
