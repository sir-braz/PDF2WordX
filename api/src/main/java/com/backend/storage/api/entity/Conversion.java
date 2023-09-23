package com.backend.storage.api.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "conversions")
public class Conversion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "file_id", referencedColumnName = "id")
    private File file;

    @Column(name = "conversion_type")
    private String conversionType;

    @Column(name = "conversion_time")
    private LocalDateTime conversionTime;

    @Column(name = "download_link")
    private String downloadLink;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public String getConversionType() {
        return conversionType;
    }

    public void setConversionType(String conversionType) {
        this.conversionType = conversionType;
    }

    public LocalDateTime getConversionTime() {
        return conversionTime;
    }

    public void setConversionTime(LocalDateTime conversionTime) {
        this.conversionTime = conversionTime;
    }

    public String getDownloadLink() {
        return downloadLink;
    }

    public void setDownloadLink(String downloadLink) {
        this.downloadLink = downloadLink;
    }
}
