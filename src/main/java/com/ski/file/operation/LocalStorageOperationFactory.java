package com.ski.file.operation;

import javax.annotation.Resource;

import com.ski.file.operation.delete.Deleter;
import com.ski.file.operation.delete.product.LocalStorageDeleter;
import com.ski.file.operation.download.Downloader;
import com.ski.file.operation.download.product.LocalStorageDownloader;
import com.ski.file.operation.upload.Uploader;
import com.ski.file.operation.upload.product.LocalStorageUploader;

import org.springframework.stereotype.Component;

@Component
public class LocalStorageOperationFactory implements FileOperationFactory{

    @Resource
    LocalStorageUploader localStorageUploader;
    @Resource
    LocalStorageDownloader localStorageDownloader;
    @Resource
    LocalStorageDeleter localStorageDeleter;
    @Override
    public Uploader getUploader() {
        return localStorageUploader;
    }

    @Override
    public Downloader getDownloader() {
        return localStorageDownloader;
    }

    @Override
    public Deleter getDeleter() {
        return localStorageDeleter;
    }


}