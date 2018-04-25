package com.helloweenvsfei.servlet.upload;

import org.apache.commons.fileupload.ProgressListener;

/**
 * @author kouguangyuan
 * @Description
 * @Date Created in 2018/1/2 15:03
 * @Modified By
 */
public class UploadListener implements ProgressListener{
    private UploadStatus status;

    public UploadListener(UploadStatus status) {
        this.status = status;
    }

    public void update(long bytesRead, long contentLength, int items) {
        status.setBytesRead(bytesRead);
        status.setContentLength(contentLength);
        status.setItems(items);
    }
}
