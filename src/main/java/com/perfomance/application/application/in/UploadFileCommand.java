package com.perfomance.application.application.in;

import java.io.InputStream;

public interface UploadFileCommand {
    void execute(InputStream inputStream);
}
