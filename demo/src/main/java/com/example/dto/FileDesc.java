package com.example.dto;

import lombok.Data;

import java.io.PipedReader;

/**
 * 文件描述
 */
@Data
public class FileDesc {
    private String name;
    private String url;
    private String objectName;
}
