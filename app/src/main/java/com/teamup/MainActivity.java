package com.teamup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.amazonaws.mobile.AWSMobileClient;
import com.amazonaws.mobilehelper.auth.IdentityManager;
import com.amazonaws.mobilehelper.auth.SignInResultHandler;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSignIn;
    private Button btnSignOut;
    private IdentityManager identityManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Obtain a reference to the mobile client. It is created in the Application class,
        // but in case a custom Application class is not used, we initialize it here if necessary.
        AWSMobileClient.initializeMobileClientIfNecessary(this);

        // Obtain a reference to the mobile client. It is created in the Application class.
        final AWSMobileClient awsMobileClient = AWSMobileClient.defaultMobileClient();

        // Obtain a reference to the identity manager.
        identityManager = awsMobileClient.getIdentityManager();


        setContentView(R.layout.activity_main);
        setUpUiElements();
    }

    private void setUpUiElements() {
        btnSignIn = (Button) findViewById(R.id.button_signIn);
        btnSignIn.setOnClickListener(this);

        btnSignOut = (Button) findViewById(R.id.button_signOut);
        btnSignOut.setOnClickListener(this);

        boolean signedIn = identityManager.isUserSignedIn();
        if (signedIn = true){
            btnSignIn.setVisibility(View.INVISIBLE);
            btnSignOut.setVisibility(View.VISIBLE);
        }
        else {
            btnSignIn.setVisibility(View.VISIBLE);
            btnSignOut.setVisibility(View.INVISIBLE);
        }
    }


    @Override
    public void onClick(View view) {
        if (view == btnSignIn){
            identityManager.signInOrSignUp(this, new SignInHandler());
            return;
        }
        if (view == btnSignOut){
            identityManager.signOut();
            identityManager.getUserID(null);
            btnSignOut.setVisibility(View.INVISIBLE);
            btnSignIn.setVisibility(View.VISIBLE);
            return;
        }
        return;
    }

}
