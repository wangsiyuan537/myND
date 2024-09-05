package com.ski.file.operation;

import com.ski.file.operation.delete.Deleter;
import com.ski.file.operation.download.Downloader;
import com.ski.file.operation.upload.Uploader;

public interface FileOperationFactory {
    Uploader getUploader();
    Downloader getDownloader();
    Deleter getDeleter();
}