package com.perfomance.application.controllers;

import com.perfomance.application.application.in.UploadFileCommand;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("/files")
public class FileController {

    private static final Logger log = LoggerFactory.getLogger(FileController.class);
    private final UploadFileCommand uploadFileCommand;

    public FileController(UploadFileCommand uploadFileCommand) {
        this.uploadFileCommand = uploadFileCommand;
    }

    @PostMapping
    public ResponseEntity uploadFile(@RequestParam("file") MultipartFile file) throws IOException {
        log.info("Uploading file: {}", file.getOriginalFilename());
        uploadFileCommand.execute(file.getInputStream());
        return  ResponseEntity.ok(null);
    }
}
