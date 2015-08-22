package com.tothenew.intellimeet.shimanshu.fragmentsample.intellimeetfragment;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import static com.tothenew.intellimeet.shimanshu.fragmentsample.intellimeetfragment.utilities.Util.LifecycleState.CALL_TO_SUPER;
import static com.tothenew.intellimeet.shimanshu.fragmentsample.intellimeetfragment.utilities.Util.LifecycleState.RETURN_FROM_SUPER;
import static com.tothenew.intellimeet.shimanshu.fragmentsample.intellimeetfragment.utilities.Util.printMethodName;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment2 extends Fragment {

    public MainActivityFragment2() {
    }

    @Override
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onInflate(activity, attrs, savedInstanceState);
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onAttach(Activity activity) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onAttach(activity);
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onCreate(savedInstanceState);
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        printMethodName(getClass(), CALL_TO_SUPER);
        return inflater.inflate(R.layout.fragment_main2, container, false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onActivityCreated(savedInstanceState);
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onStart() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onStart();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onResume() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onResume();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onPause() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onPause();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onStop() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onStop();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onDestroyView() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onDestroyView();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onDestroy() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onDestroy();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }

    @Override
    public void onDetach() {
        printMethodName(getClass(), CALL_TO_SUPER);
        super.onDetach();
        printMethodName(getClass(), RETURN_FROM_SUPER);
    }
}
