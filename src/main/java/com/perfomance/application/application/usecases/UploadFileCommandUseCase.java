package com.perfomance.application.application.usecases;

import com.perfomance.application.application.in.UploadFileCommand;
import org.springframework.stereotype.Component;

import java.io.InputStream;

@Component
public class UploadFileCommandUseCase implements UploadFileCommand {

    @Override
    public void execute(InputStream inputStream) {

    }
}
