package org.openmrs.module.hr.api.impl;


import org.openmrs.User;
import org.openmrs.module.hr.HrCertificate;
import org.openmrs.module.hr.HrEducation;
import org.openmrs.module.hr.HrStaff;
import org.openmrs.module.hr.HrStaffCert;
import org.openmrs.module.hr.api.HRQualificationService;
import org.openmrs.module.hr.api.db.HRCertificateDAO;
import org.openmrs.module.hr.api.db.HREducationDAO;
import org.openmrs.module.hr.api.db.HRStaffCertDAO;

import java.util.List;

public class HRQualificationServiceImpl implements HRQualificationService{

    HRCertificateDAO hrCertificateDAO;
    HRStaffCertDAO hrStaffCertDAO;
    HREducationDAO hrEducationDAO;

    public void setHrEducationDAO(HREducationDAO hrEducationDAO){
        this.hrEducationDAO = hrEducationDAO;
    }

    public void setHrStaffCertDAO(HRStaffCertDAO hrStaffCertDAO) {
        this.hrStaffCertDAO = hrStaffCertDAO;
    }


    public void setHrCertificateDAO(HRCertificateDAO hrCertificateDAO) {
        this.hrCertificateDAO = hrCertificateDAO;
    }

    public HrCertificate getCertificateById(int id) {
        return hrCertificateDAO.getCertificateById(id);
    }


    public List<HrCertificate> getCertificates() {
        return hrCertificateDAO.getAllCertificates();
    }

    public void retireCertificate(HrCertificate certificate, String retireReason , User retiredBy) {
        certificate.setRetired(true);
        certificate.setRetireReason(retireReason);
        certificate.setRetiredBy(retiredBy);
        hrCertificateDAO.saveCertificate(certificate);
    }

    public void saveCertificate(HrCertificate certificate) {
        hrCertificateDAO.saveCertificate(certificate);
    }

    public void unretireCertificate(HrCertificate certificate) {
        certificate.setRetired(false);
        hrCertificateDAO.saveCertificate(certificate);

    }

    public HrStaffCert getStaffCertificateById(Integer staffCertificateId) {
        return hrStaffCertDAO.getStaffCertById(staffCertificateId);
    }


    public void saveStaffCertificate(HrStaffCert hrStaffCert) {
        hrStaffCertDAO.saveStaffCert(hrStaffCert);
    }

    public HrEducation getEducationById(Integer educationId) {
        return hrEducationDAO.getEducationById(educationId);
    }

    public void saveEducation(HrEducation education) {
        hrEducationDAO.saveEducation(education);
    }

    public List<HrEducation> getEducationsForStaff(HrStaff staff) {
        return hrEducationDAO.getEducationForStaff(staff);
    }

    public void deleteStaffCertificate(HrStaffCert hrStaffCert) {
        hrStaffCertDAO.deleteStaffCert(hrStaffCert);
    }

    public void deleteEducation(HrEducation education) {
        hrEducationDAO.deleteEducation(education);
    }

}
