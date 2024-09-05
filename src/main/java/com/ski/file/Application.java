/*
 *****************************************************************************
 *  Copyright (C), 2023-2024, SUKHOI'Naivy(注册于甘肃云港股份有限公司)
 *
 *  @file    ND1.0
 *  @brief   NetDisk源代码文件不包含(.gitignore)
 *
 *  @author  Naivy
 *  @date    2024.7.1
 *  @version 1.0
 *
 *
 *----------------------------------------------------------------------------
 *  本项目文件代码所有权属于Copyright (C), 2023-2024, SUKHOI'Naivy(注册于甘肃云港股
 *  份有限公司)，未经书面许可，不可使用。
 *****************************************************************************
 */

package com.ski.file;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;

@MapperScan("com.ski.file.mapper")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}