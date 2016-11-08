package com.udacity.gradle.builditbigger;

import android.test.AndroidTestCase;

/**
 * Created by theseus on 8/11/16.
 */

public class NonEmptyStringResponseTest extends AndroidTestCase {
    public void test(){
        String result=null;
        EndpointsAsyncTask endpointsAsyncTask=new EndpointsAsyncTask(getContext(),null);
        endpointsAsyncTask.execute();
        try {
            result=endpointsAsyncTask.get();
        }catch (Exception e){
            e.printStackTrace();
        }
        assertNotNull(result);
    }
}
