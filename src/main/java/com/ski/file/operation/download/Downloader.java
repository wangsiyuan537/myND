package com.ski.file.operation.download;

import javax.servlet.http.HttpServletResponse;

import com.ski.file.operation.download.domain.DownloadFile;

public abstract class Downloader {
    public abstract void download(HttpServletResponse httpServletResponse, DownloadFile uploadFile);
}