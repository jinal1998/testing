package api.com;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Clinic {
	@JsonProperty("Id")
    private String id;
	@JsonProperty("ClinicName")
    private String clinicname;
	@JsonProperty("RegistrationNo")
    private String registrationno;
	@JsonProperty("Location")
    private String location;
	@JsonProperty("Aadharcard")
    private String aadharcard;
	@JsonProperty("EmailId")
    private String emailid;
	@JsonProperty("QualificationName")
    private String qualificationname;
	@JsonProperty("PhoneNumber")
    private String phoneNumber;
	@JsonProperty("InstituteName")
    private String institutename;
	@JsonProperty("ClinicType")
    private String clinictype;
	@JsonProperty("ProcrurementYear")
    private String procurementyear;
	@JsonProperty("YearOfPractice")
    private String yearsofpractice;
	@JsonProperty("AssociatedFacilites")
    private String associatedfacilites;
	@JsonProperty("ClinicRegistration")
    private String clinicregistration;
	@JsonProperty("DoctorName")
    private String docname;
    
    

    public Clinic() {
    }

    public Clinic(String id) {
        this.id = id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getId() {
        return id;
    }

   
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


	public String getClinicname() {
		return clinicname;
	}

	public void setClinicname(String clinicname) {
		this.clinicname = clinicname;
	}

	public String getRegistrationno() {
		return registrationno;
	}

	public void setRegistrationno(String registrationno) {
		this.registrationno = registrationno;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getAadharcard() {
		return aadharcard;
	}

	public void setAadharcard(String aadharcard) {
		this.aadharcard = aadharcard;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getQualificationname() {
		return qualificationname;
	}

	public void setQualificationname(String qualificationname) {
		this.qualificationname = qualificationname;
	}

	public String getInstitutename() {
		return institutename;
	}

	public void setInstitutename(String institutename) {
		this.institutename = institutename;
	}

	public String getClinictype() {
		return clinictype;
	}

	public void setClinictype(String clinictype) {
		this.clinictype = clinictype;
	}

	public String getProcurementyear() {
		return procurementyear;
	}

	public void setProcurementyear(String procurementyear) {
		this.procurementyear = procurementyear;
	}

	public String getYearsofpractice() {
		return yearsofpractice;
	}

	public void setYearsofpractice(String yearsofpractice) {
		this.yearsofpractice = yearsofpractice;
	}

	public String getAssociatedfacilites() {
		return associatedfacilites;
	}

	public void setAssociatedfacilites(String associatedfacilites) {
		this.associatedfacilites = associatedfacilites;
	}

	public String getClinicregistration() {
		return clinicregistration;
	}

	public void setClinicregistration(String clinicregistration) {
		this.clinicregistration = clinicregistration;
	}

	public String getDocname() {
		return docname;
	}

	public void setDocname(String docname) {
		this.docname = docname;
	}
}