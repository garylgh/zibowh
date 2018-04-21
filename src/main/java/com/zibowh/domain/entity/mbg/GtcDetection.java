package com.zibowh.domain.entity.mbg;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`gtc_detection`")
public class GtcDetection {
    @Id
    @Column(name = "`ID`")
    private String id;

    @Column(name = "`REPORTID`")
    private String reportid;

    @Column(name = "`DETECTIONDATE`")
    private Date detectiondate;

    @Column(name = "`NEXTDATE`")
    private Date nextdate;

    @Column(name = "`DETECTIONRESULT`")
    private Integer detectionresult;

    /**
     * @return ID
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * @return REPORTID
     */
    public String getReportid() {
        return reportid;
    }

    /**
     * @param reportid
     */
    public void setReportid(String reportid) {
        this.reportid = reportid == null ? null : reportid.trim();
    }

    /**
     * @return DETECTIONDATE
     */
    public Date getDetectiondate() {
        return detectiondate;
    }

    /**
     * @param detectiondate
     */
    public void setDetectiondate(Date detectiondate) {
        this.detectiondate = detectiondate;
    }

    /**
     * @return NEXTDATE
     */
    public Date getNextdate() {
        return nextdate;
    }

    /**
     * @param nextdate
     */
    public void setNextdate(Date nextdate) {
        this.nextdate = nextdate;
    }

    /**
     * @return DETECTIONRESULT
     */
    public Integer getDetectionresult() {
        return detectionresult;
    }

    /**
     * @param detectionresult
     */
    public void setDetectionresult(Integer detectionresult) {
        this.detectionresult = detectionresult;
    }
}