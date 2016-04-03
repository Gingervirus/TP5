package com.SchoolApp.domain;

import java.io.IOException;

/**
 * Created by Armin on 2016-03-31.
 */
public interface FileHandler
{
    public void write() throws IOException;
    public void read();
    public void overWriteFile() throws IOException;

}
