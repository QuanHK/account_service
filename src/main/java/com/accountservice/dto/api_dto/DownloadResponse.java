package com.accountservice.dto.api_dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;
import org.springframework.core.io.Resource;

import java.nio.file.Path;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DownloadResponse {
    private String encoded;
    private String contentType;
    private Resource resource;
    private Path path;
}
