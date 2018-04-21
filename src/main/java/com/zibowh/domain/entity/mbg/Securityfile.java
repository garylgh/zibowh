package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`securityfile`")
public class Securityfile {
    @Id
    @Column(name = "`FILEID`")
    private String fileid;

    @Column(name = "`FILENAME`")
    private String filename;

    @Column(name = "`FILETYPE`")
    private String filetype;

    @Column(name = "`FILEDATE`")
    private Date filedate;

    @Column(name = "`OWNER_ID`")
    private String ownerId;

    @Column(name = "`FILE`")
    private String file;

    /**
     * @return FILEID
     */
    public String getFileid() {
        return fileid;
    }

    /**
     * @param fileid
     */
    public void setFileid(String fileid) {
        this.fileid = fileid == null ? null : fileid.trim();
    }

    /**
     * @return FILENAME
     */
    public String getFilename() {
        return filename;
    }

    /**
     * @param filename
     */
    public void setFilename(String filename) {
        this.filename = filename == null ? null : filename.trim();
    }

    /**
     * @return FILETYPE
     */
    public String getFiletype() {
        return filetype;
    }

    /**
     * @param filetype
     */
    public void setFiletype(String filetype) {
        this.filetype = filetype == null ? null : filetype.trim();
    }

    /**
     * @return FILEDATE
     */
    public Date getFiledate() {
        return filedate;
    }

    /**
     * @param filedate
     */
    public void setFiledate(Date filedate) {
        this.filedate = filedate;
    }

    /**
     * @return OWNER_ID
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * @param ownerId
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId == null ? null : ownerId.trim();
    }

    /**
     * @return FILE
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file
     */
    public void setFile(String file) {
        this.file = file == null ? null : file.trim();
    }
}