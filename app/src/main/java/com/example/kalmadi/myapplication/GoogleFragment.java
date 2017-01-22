/*
package com.example.kalmadi.myapplication;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.common.api.GoogleApiClient;

*/
/**
 * Created by KALMADI on 11/22/2016.
 *//*


public class GoogleFragment extends Fragment implements View.OnClickListener, GoogleApiClient.OnConnectionFailedListener {
    //Signin button
    private SignInButton signInButton;

    private TextView mStatusTextView;

    private MygoogleListener listener;

    //Signing Options
    private GoogleSignInOptions gso;

    //google api client
    private GoogleApiClient mGoogleApiClient;

    public MainActivity MainActivity;
    //Signin constant to check the activity result
    private int RC_SIGN_IN = 0;
    Activity context = null;
   */
/* @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity a;

        if (context instanceof Activity){
            a=(Activity) context;
        }

    }*//*

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            listener = (MygoogleListener) context;
        } catch (ClassCastException castException) {
            */
/** The activity does not implement the listener. *//*

        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mStatusTextView = listener.apnaView();
        int a=listener.interetn(4);
        listener.googleBuildclnt();
        mGoogleApiClient=listener.googleclniet();
        getString(com.google.android.gms.R.string.common_signin_button_text_long);
        Log.v("GoogleFragment","*****bhai yaha to ayaa hu");

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_google, container, false);
        signInButton = (SignInButton) rootView.findViewById(R.id.sign_in_button);
        signInButton.setSize(SignInButton.SIZE_WIDE);
        //signInButton.setScopes(gso.getScopeArray());
        signInButton.setOnClickListener(this);
       // listener.onViewCreatd(savedInstanceState);
        //Returning the layout file after inflating
        return rootView;
    }

    //This function will option signing intent
    private void signIn() {
        //Creating an intent
        Intent signInIntent = Auth.GoogleSignInApi.getSignInIntent(mGoogleApiClient);


        //Starting intent for result
        startActivityForResult(signInIntent, RC_SIGN_IN);
    }
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        //If signin
        if (requestCode == RC_SIGN_IN) {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            //Calling a new function to handle signin
            handleSignInResult(result);
        }


*/
/*Fragment fragment = (Fragment) getSupportFragmentManager().findFragmentByTag(GoogleFragment);
            if(fragment != null){
                fragment.onActivityResult(requestCode, resultCode, data);*//*



    }

    //After the signing we are calling this function
    private void handleSignInResult(GoogleSignInResult result) {
        //If the login succeed
        listener.onViewCreatd(result);
    }

    @Override
    public void onClick(View v) {
        if (v == signInButton) {
            //Calling signin
            Log.v("GoogleFragment","*****bhai yaha to ayaa hu");
            signIn();
        }
    }

    @Override
    public void onConnectionFailed(ConnectionResult connectionResult) {

    }

}
*/
