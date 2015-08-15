package com.greenvaultgames.noughtsandcrosses;

import android.app.Activity;
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

    // Call when the sign-in button is clicked
    private void signInClicked() {
        Activity mainActivity = getActivity();
        SignInCoordinator coordinator = (SignInCoordinator) mainActivity;

        coordinator.onSignInClicked();
    }

    // Call when the sign-out button is clicked
    private void signOutclicked() {
        Activity mainActivity = getActivity();
        SignInCoordinator coordinator = (SignInCoordinator) mainActivity;

        coordinator.onSignOutClicked();
    }

    public void ShowLogoutButton() {
        //Hide login button
        //Show logout button
    }

    public void ShowLoginButton() {
        //Hide logout button
        //Show login button
    }
}
