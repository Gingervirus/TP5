package com.SchoolApp.factories;

import com.SchoolApp.domain.*;

/**
 * Created by Armin on 2016-04-07.
 */
public class DetentionFactory {
    public static boolean getDetention(String req)
    {
        Detention chain = setUpChain();
        return chain.handleRequest(req);
    }

    public static Detention setUpChain()
    {
        Detention a = new DetentionYes();
        Detention b = new DetentionNo();

        a.setNextJob(b);
        return a;
    }
}
