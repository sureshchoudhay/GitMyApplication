package com.example.kalmadi.myapplication;

/**
 * Created by SURESH on 11/15/2016.
 */

import android.app.Application;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by Belal on 5/3/2015.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        printHashKey();
    }

    public void printHashKey(){
        // Add code to print out the key hash
        try {
            PackageInfo info = getPackageManager().getPackageInfo(
                    "com.example.kalmadi.myapplication",
                    PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md = MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                Log.d("**************KeyHash:", Base64.encodeToString(md.digest(), Base64.DEFAULT));
                Log.println(Log.ASSERT,"*********************",Base64.encodeToString(md.digest(), Base64.DEFAULT));
                Log.v("MyApplication","*****************bhai mai main application mai hu yaha*******************");

            }
        } catch (PackageManager.NameNotFoundException e) {

        } catch (NoSuchAlgorithmException e) {

        }
    }
}