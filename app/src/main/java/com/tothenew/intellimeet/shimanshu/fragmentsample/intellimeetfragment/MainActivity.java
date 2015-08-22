package com.tothenew.intellimeet.shimanshu.fragmentsample.intellimeetfragment;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.LoaderManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import static com.tothenew.intellimeet.shimanshu.fragmentsample.intellimeetfragment.utilities.Util.printMethodName;
import static com.tothenew.intellimeet.shimanshu.fragmentsample.intellimeetfragment.utilities.Util.printTextMessage;
import static com.tothenew.intellimeet.shimanshu.fragmentsample.intellimeetfragment.utilities
        .Util.LifecycleState.CALL_TO_SUPER;
import static com.tothenew.intellimeet.shimanshu.fragmentsample.intellimeetfragment.utilities
        .Util.LifecycleState.RETURN_FROM_SUPER;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null)
            printTextMessage(getClass(), "Bundle is null");
        else
            printTextMessage(getClass(), "Bundle has some data  : " +
                    savedInstanceState.toString());

        FragmentManager.enableDebugLogging(true);
        LoaderManager.enableDebugLogging(true);

        findViewById(R.id.button_test).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonTestClickEvent();
            }
        });
        addFragment(new MainActivityFragment());
    }

    private void buttonTestClickEvent() {
//        addFragment(new MainActivityFragment2());

        Fragment fragment = new MainActivityFragment2();
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        fragmentTransaction.replace(R.id.fragment_test_main, fragment);
        fragmentTransaction.addToBackStack(fragment.getClass().getName());
        fragmentTransaction.commit();
    }

    @Override
    public void onBackPressed() {
//        FragmentManager fragmentManager = getFragmentManager();
//        int count = fragmentManager.getBackStackEntryCount();
//        if (count > 0)
//            fragmentManager.popBackStack();
//        else
            super.onBackPressed();
    }

    private void addFragment(Fragment fragment) {
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager
                .beginTransaction();
        fragmentTransaction.add(R.id.fragment_test_main, fragment);
//        fragmentTransaction.addToBackStack(fragment.getClass().getName());
        fragmentTransaction.commit();

//        FragmentManager fragmentManager = getFragmentManager()
// Or: FragmentManager fragmentManager = getSupportFragmentManager()
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        BackgroundFragment fragment = new BackgroundFragment();
//        fragmentTransaction.add(fragment, "thread_manager");
//        fragmentTransaction.commit();

//        FragmentManager fragmentManager = getFragmentManager();
//        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
//        MainActivityFragment mainActivityFragment = new MainActivityFragment();
//        fragmentTransaction.add(mainActivityFragment, "ThreadManager");
//        fragmentTransaction.addToBackStack(fragment.getClass().getName());
//        fragmentTransaction.commit();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        printMethodName(getClass(), CALL_TO_SUPER);
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        printMethodName(getClass(), RETURN_FROM_SUPER);
        return true;
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onActivityResult(requestCode, resultCode, data);
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onAttachedToWindow() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onAttachedToWindow();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onAttachFragment(Fragment fragment) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onAttachFragment(fragment);
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onConfigurationChanged(newConfig);
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onContentChanged() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onContentChanged();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onDestroy() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onDestroy();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onDetachedFromWindow() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onDetachedFromWindow();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onNewIntent(intent);
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onPause() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onPause();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onPostCreate(savedInstanceState);
        printMethodName(getClass(), RETURN_FROM_SUPER);

    }

    @Override
    protected void onPostResume() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onPostResume();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public boolean onPrepareOptionsMenu(final Menu menu) {
        printMethodName(getClass(), CALL_TO_SUPER);
        boolean result = super.onPrepareOptionsMenu(menu);
        printMethodName(getClass(), RETURN_FROM_SUPER);

        return result;
    }

    @Override
    protected void onRestart() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onRestart();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onResume() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onResume();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onRestoreInstanceState(final Bundle savedInstanceState) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onRestoreInstanceState(savedInstanceState);
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onWindowFocusChanged(hasFocus);
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onUserLeaveHint() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onUserLeaveHint();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onStart() {

        printMethodName(getClass(), CALL_TO_SUPER);
        super.onStart();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onStop() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onStop();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    protected void onSaveInstanceState(final Bundle outState) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onSaveInstanceState(outState);
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onUserInteraction() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onUserInteraction();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }
}
