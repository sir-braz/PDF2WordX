package com.backend.storage.api.entity;


import javax.persistence.*;

@Entity
@Table(name = "conversionrequest")
public class ConversionRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "sourcefilerequest")
    private String sourceFileRequest;

    @Column(name = "targetformat")
    private String targetFormat;

    @Column(name = "callBackUrl")
    private String callBackUrl;

    public String getSourceFileRequest() {
        return sourceFileRequest;
    }

    public void setSourceFileRequest(String sourceFileRequest) {
        this.sourceFileRequest = sourceFileRequest;
    }

    public String getTargetFormat() {
        return targetFormat;
    }

    public void setTargetFormat(String targetFormat) {
        this.targetFormat = targetFormat;
    }

    public String getCallBackUrl() {
        return callBackUrl;
    }

    public void setCallBackUrl(String callBackUrl) {
        this.callBackUrl = callBackUrl;
    }
}
