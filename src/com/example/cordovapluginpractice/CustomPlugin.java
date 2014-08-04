package com.example.cordovapluginpractice;

import org.apache.cordova.api.CallbackContext;
import org.apache.cordova.api.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;
import android.widget.Toast;

public class CustomPlugin extends CordovaPlugin {
    
    public final static String ACTION_TOAST = "action_toast";
    
    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Log.d("__CustomPlugin", "execute()");
        if (ACTION_TOAST.equals(action)) {
            String tempString = "";
            try {
                tempString = args.getString(0);
            } catch (Exception e) {
                Log.d("__CustomPlugin", "Caught exception while trying to extract paramenter from JSONArray args");
                return false;
            }
            Toast.makeText(webView.getContext(), tempString, Toast.LENGTH_SHORT).show();
            return true;
        } else {
            return false;
        }
    }
}
