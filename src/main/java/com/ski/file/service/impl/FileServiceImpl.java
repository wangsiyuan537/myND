package com.ski.file.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ski.file.mapper.FileMapper;
import com.ski.file.model.File;
import com.ski.file.service.FileService;

import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class FileServiceImpl extends ServiceImpl<FileMapper, File> implements FileService {

}