//package com.singularity.thetranslator;
//import android.Manifest;
//import android.content.Context;
//import android.content.pm.PackageManager;
//import android.provider.Settings;
//import android.support.v4.app.ActivityCompat;
//import android.support.v7.app.AppCompatActivity;
//import android.os.Bundle;
//import android.telephony.TelephonyManager;
//import android.widget.TextView;
//
//public class LoggedIn extends AppCompatActivity {
//
//@Override
//protected void onCreate(Bundle savedInstanceState) {
//super.onCreate(savedInstanceState);
//setContentView(R.layout.activity_logged_in);
//
//TelephonyManager telephonyManager = (TelephonyManager) getSystemService(Context.TELEPHONY_SERVICE);
//if (ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_PHONE_STATE) != PackageManager.PERMISSION_GRANTED) {
//// TODO: Consider calling
////    ActivityCompat#requestPermissions
//// here to request the missing permissions, and then overriding
////   public void onRequestPermissionsResult(int requestCode, String[] permissions,
////                                          int[] grantResults)
//// to handle the case where the user grants the permission. See the documentation
//// for ActivityCompat#requestPermissions for more details.
//return;
//}
//String s = telephonyManager.getDeviceId();
//TextView textView =findViewById(R.id.print);
//textView.setText(getString(R.string.imei)+s);
//}
//}
