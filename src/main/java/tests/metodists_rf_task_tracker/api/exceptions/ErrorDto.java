package tests.metodists_rf_task_tracker.api.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorDto {

    private String error;

    @JsonProperty("error_description")
    private String errorDescription;

    public ErrorDto(String error, String errorDescription) {
        this.error = error;
        this.errorDescription = errorDescription;
    }


    public static ErrorDto.ErrorDtoBuilder builder() {
        return new ErrorDto.ErrorDtoBuilder();
    }

    public static class ErrorDtoBuilder {
        private String error;
        private String errorDescription;

        public ErrorDto.ErrorDtoBuilder error(String error) {
            this.error = error;
            return this;
        }

        public ErrorDto.ErrorDtoBuilder errorDescription(String errorDescription) {
            this.errorDescription = errorDescription;
            return this;
        }

        public ErrorDto build() {
            return new ErrorDto(error, errorDescription);
        }
    }

}
