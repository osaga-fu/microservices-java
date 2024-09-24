package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Schema(
        name = "Error Response",
        description = "Schema to hold error response information"
)
@Data
@AllArgsConstructor
public class ErrorResponseDto {

    @Schema(
            description = "API path invoked by client"
    )
    private String apiPath;

    @Schema(
            description = "Error code representing the error that happened"
    )
    private HttpStatus errorCode;

    @Schema(
            description = "Error message describing the error that happened"
    )
    private String errorMessage;

    @Schema(
            description = "Time when the error happened"
    )
    private LocalDateTime errorTime;
}
